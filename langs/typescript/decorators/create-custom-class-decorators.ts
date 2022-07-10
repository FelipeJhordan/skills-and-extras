function log(text: string) {
  return function <T extends { new (...args: any[]): {} }>(target: T) {
    return class extends target {
      text = "override";

      constructor(...args: any[]) {
        super(args);
        console.log("contructor for decorator", text);
      }
    };
  };
}
@log("Service A")
class Service {
  text = "Service";
  constructor() {
    console.log("hi from class Service");
  }
  doSomething() {
    return "h1" + this.text;
  }
}

let service = new Service();

console.log("do something", service.doSomething());
