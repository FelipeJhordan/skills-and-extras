(() => {
  let [badIdea, niceIdea, otherNiceIdea]: Function[] = [];
  // Objects Data and Structures
  // Use getters and setters

  badIdea = () => {
    type BankAccount = {
      balance: number;
    };

    const value = 100;

    const account: BankAccount = {
      balance: 0,
    };

    if (value < 0) {
      throw new Error("Cannot set negative balance.");
    }
    account.balance = value;
  };

  niceIdea = () => {
    class BankAccount {
      private accountBalance: number = 0;

      get balance(): number {
        return this.accountBalance;
      }

      set balance(value: number) {
        if (value < 0) {
          throw new Error("Cannot set negative balance");
        }
        this.accountBalance = value;
      }
    }

    const account = new BankAccount();
    account.balance = 100;
  };

  //Utilizar modificador de acessibilidade

  badIdea = () => {
    class Circle {
      radius: number;

      constructor(radius: number) {
        this.radius = radius;
      }

      perimeter() {
        return 2 * Math.PI * this.radius;
      }

      surface() {
        return Math.PI * this.radius * this.radius;
      }
    }
  };

  badIdea = () => {
    class Circle {
      constructor(private readonly radius: number) {}

      perimeter() {
        return 2 * Math.PI * this.radius;
      }

      surface() {
        return Math.PI * this.radius * this.radius;
      }
    }
  };

  // Preferir imutabilidade
  // Isso não é nem um pouco flexível em
  badIdea = () => {
    interface Config {
      host: string;
      port: string;
      db: string;
    }
  };
  niceIdea = () => {
    interface Config {
      readonly host: string;
      readonly port: string;
      readonly db: string;
    }
  };

  otherNiceIdea = () => {
    const array: ReadonlyArray<number> = [1, 3, 5];
    // array = []; // error
    // array.push(2) // error
  };

  //   Tipo vs Interface
  // É recomendável utilizar tipos quando se precisa de união ou interseção
  // É recomendável utilizar interface quando você quer extender ou implementar
})();
