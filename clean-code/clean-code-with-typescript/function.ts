// Argumentos de funções ( 2 ou menos é o ideal)
// É recomendável usar até 2 argumentos, e no máximo três.
// Quando tem muitos argumentos quer dizer que sua função está desempenhando mais de uma tarefa (cade a responsabilidade unica)
// Você pode também agrupar os parametros em uma interface em comum e utilizar a sintaxe de desinstructuring

let badIdea, niceIdea, otherNiceIdea;

badIdea = () => {
  function createMenu(
    title: string,
    body: string,
    buttonText: string,
    cancellable: boolean
  ) {
    //
  }

  createMenu("Alguma coisa", "Corpo", "Aperta aqui", true);
};

niceIdea = () => {
  function createMenu(options: {
    title: string;
    body: string;
    buttonText: string;
    cancellable: boolean;
  }) {}

  createMenu({
    title: "Alguma coisa",
    body: "Corpo",
    buttonText: "Aperta aqui",
    cancellable: true,
  });
};

//  Você pode ir mais longe se você aprimorar a leitura usando type alias

otherNiceIdea = () => {
  //   Se você precisar, você pode exportar esse Tipo, ou até mesmo criar um arquivo separado para ele e reutilizar..
  type MenuOption = {
    title: string;
    body: string;
    buttonText: string;
    cancellable: boolean;
  };

  function createMenu(options: MenuOption) {
    //
  }

  createMenu({
    title: "Alguma coisa",
    body: "Corpo",
    buttonText: "Aperta aqui",
    cancellable: true,
  });
};

// --------------------------------

// Funções devem fazer apenas uma coisa
// opaaa, princípio de responsabilidade única
badIdea = () => {
  function emailActiveClients(clients: Client[]) {
    clients.forEach((client) => {
      const clientRecord = database.lookup(client);

      clients.forEach((client) => {
        const clientRecord = database.lookup(client);
        if (clientRecord.isActive()) {
          email(client);
        }
      });
    });
  }
};

niceIdea = () => {
  function emailActiveClients(clients: Client[]) {
    clients
      .filter(
        isActiveClient
      ) /* mesma coisa que (client) => IsActiveClient(client) */
      .forEach(email /* mesma coisa que (client) => email(client)*/);
  }

  function isActiveClient(client: Client) {
    const clientRecord = database.lookup(client);
    return clientRecord.isActive();
  }
};

// O nome das funções devem dizer que eles fazem

badIdea = () => {
  function addToDate(date: Date, month: number): Date {
    //
  }

  const date = new Date();

  // É díficil dizer pela função o que é adicionado na data
  addToDate(date, 1);
};

niceIdea = () => {
  function addMonthToDate(date: Date, month: number): Date {
    //
  }

  const date = new Date();

  addMonthToDate(date, 1);
};

// Funções devem apenas ter um nível de abstração

badIdea = () => {
  function parseCode(code: string) {
    const REGEXES = [
      /* ... */
    ];
    const statements = code.split("");
    const tokens = [];
    REGEXES.forEach((regex) => {
      statements.forEach((statement) => {});
    });

    const ast = [];
    tokens.forEach((token) => {});

    ast.forEach((node) => {});
  }
};

niceIdea = () => {
  type Token = string;
  type SyntaxTree = [];
  const REGEXES = [
    /* --- */
  ];
  function parseCode(code: string) {
    const tokens = tokenize(code);
    const sytaxTree = parse(tokens);

    sytaxTree.forEach((node) => {
      // parse
    });
  }

  function tokenize(code: string): Token[] {
    const statements = code.split(" ");
    const tokens: Tokens[] = [];
    REGEXES.forEach((regex) => {
      statements.forEach((statement) => {
        tokens.push();
      });
    });

    return tokens;
  }

  function parse(tokens: Token[]): SyntaxTree[] {
    const syntaxTree: SyntaxTree[] = [];
    tokens.forEach((token) => {
      syntaxTree.push(/* ... */);
    });

    return syntaxTree;
  }
};

// ----------------------------
// Remover codigo duplicado
// ----------------------

badIdea = () => {
  function showDeveloperList(developers: Developer[]) {
    developers.forEach((developer) => {
      const expectedSalary = developer.calculateExpectedSalary();
      const experience = developer.getExperience();
      const githubLink = developer.getGithubLink();

      const data = {
        expectedSalary,
        experience,
        githubLink,
      };

      render(data);
    });
  }

  function showManagerList(managers: Manager[]) {
    managers.forEach((manager) => {
      const expectedSalary = manager.calculateExpectedSalary();
      const experience = manager.getExperience();
      const portfolio = manager.getMBAProjects();

      const data = {
        expectedSalary,
        experience,
        portfolio,
      };

      render(data);
    });
  }
};

niceIdea = () => {
  class Developer {
    // ...
    getExtraDetails() {
      return {
        githubLink: this.githubLink,
      };
    }
  }

  class Manager {
    // ...
    getExtraDetails() {
      return {
        portfolio: this.portfolio,
      };
    }
  }

  function showEmployeeList(employee: Developer | Manager) {
    employee.forEach((employee) => {
      const expectedSalary = employee.calculateExpectedSalary();
      const experience = employee.getExperience();
      const extra = employee.getExtraDetails();

      const data = {
        expectedSalary,
        experience,
        extra,
      };

      render(data);
    });
  }
};

//  Definir objetos padrões com Object.assign ou destructuring

badIdea = () => {
  type MenuConfig = {
    title?: string;
    body?: string;
    buttonText?: string;
    cancellable?: boolean;
  };

  function createMenu(config: MenuConfig) {
    config.title = config.title || "Foo";
    config.body = config.body || "Bar";
    config.buttonText = config.buttonText || "Baz";
    config.cancellable =
      config.cancellable !== undefined ? config.cancellable : true;

    // ...
  }

  createMenu({ body: "Bar" });
};

niceIdea = () => {
  type MenuConfig = {
    title?: string;
    body?: string;
    buttonText?: string;
    cancellable?: boolean;
  };

  //   Vai criar um objeto padrão, e caso não tenha algum valor passado, irá utiliar esses valores
  function createMenu(config: MenuConfig) {
    const menuConfig = Object.assign(
      {
        title: "Foo",
        body: "bar",
        buttonText: "Baz",
        cancellable: true,
      },
      config
    );
  }

  createMenu({
    body: "Alguma coisa",
  });
};

otherNiceIdea = () => {
  function createMenu(config: MenuConfig) {
    const menuConfig = {
      title: "Foo",
      body: "Bar",
      buttonText: "Baz",
      cancellable: true,
      ...config,
    };
  }
};

//  Não utilize flags ( as vezes não da pra fugir em)

badIdea = () => {
  function createFile(name: string, temp: boolean) {
    if (temp) {
      fs.create(`./temp/${name}`);
    } else {
      fs.create(name);
    }
  }
};

niceIdea = () => {
  function createTempFile(name: string) {
    createFile(`./temp/${name}`);
  }

  function createFile(name: string) {
    fs.create(name);
  }
};

// Evitar efeitos colaterais
badIdea = () => {
  let name = "Robert C. Martin";

  function toBase64() {
    name = btoa(name);
  }

  toBase64();

  console.log(name); // Não vai emprimir o retorno do conteúdo do criador do game of thrones
};

niceIdea = () => {
  const name = "Robert C. Martin";

  function toBase64(text: string): string {
    return btoa(text);
  }

  const encodedName = toBase64(name);
  console.log(name);
};

//  Não declare funções globais

badIdea = () => {
  declare global {
    interface Array<T> {
      diff(other: T[]): Array<T>;
    }
  }

  if (!Array.prototype.diff) {
    Array.prototype.diff = function <T>(other: T[]): T[] {
      const hash = new Set(other);
      return this.filter((elem) => !hash.has(elem));
    };
  }
};

niceIdea = () => {
  class MyArray<T> extends Array<T> {
    diff(other: T[]): T[] {
      const hash = new Set(other);
      return this.filter((elem) => !hash.has(elem));
    }
  }
};

// Favorecer programação funciona á programação imperativa

badIdea = () => {
  const contributions = [
    {
      name: "Uncle Bobby",
      linesOfCode: 500,
    },
    {
      name: "Suzie Q",
      linesOfCode: 1500,
    },
    {
      name: "Jimmy Gosling",
      linesOfCode: 150,
    },
    {
      name: "Gracie Hopper",
      linesOfCode: 1000,
    },
  ];

  let totalOutput = 0;

  for (let i = 0; i < contributions.length; i++) {
    totalOutput += contributions[i].linesOfCode;
  }
};

niceIdea = () => {
  const contributions = [
    {
      name: "Felpeira",
      linesOfCode: 20,
    },
    {
      name: "Suzie d",
      linesOfCode: 1500,
    },
    {
      name: "Jimmy Gosling",
      linesOfCode: 150,
    },
    {
      name: "Gracie Hopper",
      linesOfCode: 1000,
    },
  ];

  const totalOutput = contributions.reduce(
    (totalLines, output) => totalLines + output.linesOfCode,
    0
  );
};

// Encapsular conditionais

let subscription: any;
let account: any;
badIdea = () => {
  if (subscription.isTrial || account.balance > 0) {
  }
};

niceIdea = () => {
  function canActivateService(subscription: Subscription, account: Account) {
    return subscription.isTrial || account.balance > 0;
  }

  if (canActivateService(subscription, account)) {
    // ...
  }
};

// Evitar conditionais negativos

badIdea = () => {
  function isEmailNotUsed(email: string): boolean {
    //
  }

  if (isEmailNotUsed(email)) {
  }
};

niceIdea = () => {
  function isEmailUsed(email: string): boolean {
    //
  }

  if (!isEmailUsed(email)) {
  }
};

//  Evite condicionais

badIdea = () => {
  class Airplane {
    private type: string;
    // ...

    getCruisingAltitude() {
      switch (this.type) {
        case "777":
          return this.getMaxAltitude() - this.getPassengerCount();
        case "Air Force One":
          return this.getMaxAltitude();
        case "Cessna":
          return this.getMaxAltitude() - this.getFuelExpenditure();
        default:
          throw new Error("Unknown airplane type.");
      }
    }

    private getMaxAltitude(): number {
      // ...
    }
  }
};

niceIdea = () => {
  abstract class Airplane {
    protected getMaxAltitude(): number {
      // shared logic with subclasses ...
    }

    // ...
  }

  class Boeing777 extends Airplane {
    // ...
    getCruisingAltitude() {
      return this.getMaxAltitude() - this.getPassengerCount();
    }
  }

  class AirForceOne extends Airplane {
    // ...
    getCruisingAltitude() {
      return this.getMaxAltitude();
    }
  }

  class Cessna extends Airplane {
    // ...
    getCruisingAltitude() {
      return this.getMaxAltitude() - this.getFuelExpenditure();
    }
  }

  const cessna: Cessna = new Cessna();
  cessna.getCruisingAltitude(); // vai chamar a função do cessna
  const boing = new Boeing777();
  boing.getCruisingAltitude(); // vai chamar a função do boing
};

// Evite checagem de tipos

badIdea = () => {
  function travelToTexas(vehicle: Bicycle | Car) {
    if (vehicle instanceof Bicycle) {
      vehicle.pedal(currentLocation, new Location("texas"));
    } else if (vehicle instanceof Car) {
      vehicle.drive(currentLocation, new Location("texas"));
    }
  }
};

niceIdea = () => {
  type Vehicle = Bicycle | Car;

  function travelToTexas(vehicle: Vehicle) {
    vehicle.move(currentLocation, new Location("texas"));
  }
};

// Remover código morto
// não preciso de um exemplo pra exercitar isso kk

// Utilizar iteratos e generators

badIdea = () => {
  function fibonacci(n: number): number[] {
    if (n === 1) return [0];
    if (n === 2) return [0, 1];

    const items: number[] = [0, 1];
    while (items.length < n) {
      items.push(items[items.length - 2] + items[items.length - 1]);
    }

    return items;
  }

  function print(n: number) {
    fibonacci(n).forEach((fib) => console.log(fib));
  }

  print(10);
};

niceIdea = () => {
  function* fibonacci(): IterableIterator<number> {
    let [a, b] = [0, 1];

    while (true) {
      yield a;
      [a, b] = [b, a + b];
    }
  }

  function print(n: number) {
    let i = 0;
    for (const fib of fibonacci()) {
      if (i++ === n) break;
      console.log(fib);
    }
  }

  print(10);
};
