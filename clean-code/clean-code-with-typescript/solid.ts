(() => {
  let [badIdea, niceIdea, otherNiceIdea]: Function[] = [];
  // SOLID
  //   Principio de responsabilidade única
  badIdea = () => {
    class UserSettings {
      constructor(private readonly user: User) {}

      changeSettings(settings: UserSettings) {
        if (this.verifyCredentials()) {
          // ...
        }
      }

      verifyCredentials() {
        // ...
      }
    }
  };

  niceIdea = () => {
    class UserAuth {
      constructor(private readonly user: User) {}
      verifyCredentials() {}
    }
    class UserSettings {
      private readonly auth: UserAuth;
      constructor(private readonly user: User) {
        this.auth = new UserAuth(user);
      }

      changeSettings(settings: UserSettings) {
        if (this.auth.verifyCredentials()) {
          //
        }
      }
    }
  };

  //   Princípio do aberto/fechado (OCP)

  badIdea = () => {
    class AjaxAdapter extends Adapter {
      constructor() {
        super();
      }

      // ...
    }

    class NodeAdapter extends Adapter {
      constructor() {
        super();
      }

      // ...
    }

    class HttpRequester {
      constructor(private readonly adapter: Adapter) {}

      async fetch<T>(url: string): Promise<T> {
        if (this.adapter instanceof AjaxAdapter) {
          const response = await makeAjaxCall<T>(url);
          // transform response and return
        } else if (this.adapter instanceof NodeAdapter) {
          const response = await makeHttpCall<T>(url);
          // transform response and return
        }
      }
    }

    function makeAjaxCall<T>(url: string): Promise<T> {
      // request and return promise
    }

    function makeHttpCall<T>(url: string): Promise<T> {
      // request and return promise
    }
  };

  niceIdea = () => {
    abstract class Adapter {
      abstract async request<T>(url: string): Promise<T>;

      // code shared to subclasses ...
    }

    class AjaxAdapter extends Adapter {
      constructor() {
        super();
      }

      async request<T>(url: string): Promise<T> {
        // request and return promise
      }

      // ...
    }

    class NodeAdapter extends Adapter {
      constructor() {
        super();
      }

      async request<T>(url: string): Promise<T> {
        // request and return promise
      }

      // ...
    }

    class HttpRequester {
      constructor(private readonly adapter: Adapter) {}

      async fetch<T>(url: string): Promise<T> {
        const response = await this.adapter.request<T>(url);
        // transform response and return
      }
    }
  };

  //    Principio de substituição de liskov (LSP)
  // Se S é um subtipo de T, então objetos do tipo T devem poder ser trocados por objetos do tipo S
  badIdea = () => {
    class Rectangle {
      constructor(protected width: number = 0, protected height: number = 0) {}

      setColor(color: string): this {
        // ...
      }

      render(area: number) {
        // ...
      }

      setWidth(width: number): this {
        this.width = width;
        return this;
      }

      setHeight(height: number): this {
        this.height = height;
        return this;
      }

      getArea(): number {
        return this.width * this.height;
      }
    }

    class Square extends Rectangle {
      setWidth(width: number): this {
        this.width = width;
        this.height = width;
        return this;
      }

      setHeight(height: number): this {
        this.width = height;
        this.height = height;
        return this;
      }
    }

    function renderLargeRectangles(rectangles: Rectangle[]) {
      rectangles.forEach((rectangle) => {
        const area = rectangle.setWidth(4).setHeight(5).getArea(); // BAD: Returns 25 for Square. Should be 20.
        rectangle.render(area);
      });
    }

    const rectangles = [new Rectangle(), new Rectangle(), new Square()];
    renderLargeRectangles(rectangles);
  };

  niceIdea = () => {
    abstract class Shape {
      setColor(color: string): this {
        // ...
      }

      render(area: number) {
        // ...
      }

      abstract getArea(): number;
    }

    class Rectangle extends Shape {
      constructor(private readonly width = 0, private readonly height = 0) {
        super();
      }

      getArea(): number {
        return this.width * this.height;
      }
    }

    class Square extends Shape {
      constructor(private readonly length: number) {
        super();
      }

      getArea(): number {
        return this.length * this.length;
      }
    }

    function renderLargeShapes(shapes: Shape[]) {
      shapes.forEach((shape) => {
        const area = shape.getArea();
        shape.render(area);
      });
    }

    const shapes = [new Rectangle(4, 5), new Rectangle(4, 5), new Square(5)];
    renderLargeShapes(shapes);
  };

  //   Principio de segregação de interface (ISP)

  badIdea = () => {
    interface SmartPrinter {
      print();
      fax();
      scan();
    }

    class AllInOnePrinter implements SmartPrinter {
      print() {
        // ...
      }

      fax() {
        // ...
      }

      scan() {
        // ...
      }
    }

    class EconomicPrinter implements SmartPrinter {
      print() {
        // ...
      }

      fax() {
        throw new Error("Fax not supported.");
      }

      scan() {
        throw new Error("Scan not supported.");
      }
    }
  };

  niceIdea = () => {
    interface Printer {
      print();
    }

    interface Fax {
      fax();
    }

    interface Scanner {
      scan();
    }

    class AllInOnePrinter implements Printer, Fax, Scanner {
      print() {
        // ...
      }

      fax() {
        // ...
      }

      scan() {
        // ...
      }
    }

    class EconomicPrinter implements Printer {
      print() {
        // ...
      }
    }
  };

  //   Princípio de inversão de dependencia
  badIdea = async () => {
    import { readFile as readFileCb } from "fs";
    import { promisify } from "util";

    const readFile = promisify(readFileCb);

    type ReportData = {
      // ..
    };

    class XmlFormatter {
      parse<T>(content: string): T {}
    }

    class ReportReader {
      // BAD: Criamos uma dependencia com uma biblioteca ou implementação específica,
      // isso gera acoplamento e "dificulta" qualquer alteração ou atualização
      private readonly formatter = new XmlFormatter();

      async read(path: string): Promise<ReportData> {
        const text = await readFile(path, "UTF8");
        return this.formatter.parse<ReportData>(text);
      }
    }

    // ...
    const reader = new ReportReader();
    const report = await reader.read("report.xml");
  };

  niceIdea = async async () => {
    import { readFile as readFileCb } from "fs";
    import { promisify } from "util";

    const readFile = promisify(readFileCb);

    type ReportData = {
      // ..
    };

    interface Formatter {
      parse<T>(content: string): T;
    }

    class XmlFormatter implements Formatter {
      parse<T>(content: string): T {
      }
    }

    class JsonFormatter implements Formatter {
      parse<T>(content: string): T {
      }
    }

    class ReportReader {
      constructor(private readonly formatter: Formatter) {}

      async read(path: string): Promise<ReportData> {
        const text = await readFile(path, "UTF8");
        return this.formatter.parse<ReportData>(text);
      }
    }

    // ...
    const reader = new ReportReader(new XmlFormatter());
    const report = await reader.read("report.xml");

   
    const reader = new ReportReader(new JsonFormatter());
    const report = await reader.read("report.json");
  };
})();
