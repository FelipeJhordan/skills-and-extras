function delay(value: number) {
  console.log("delay(): evaluated");
  return function (
    target: any,
    propertKey: string,
    descriptor: PropertyDescriptor
  ) {
    var originalMethod = descriptor.value;
    descriptor.value = function () {
      var context = this;
      var args = arguments;
      setTimeout(() => {
        originalMethod.apply(context, args);
      }, value);
    };
  };
}

class Timeout {
  count: number = 0;
  @delay(500)
  callMe() {
    this.count++;
    console.log("call me is been called with ", +this.count);
  }
}

const timeout = new Timeout();
timeout.callMe();
