(() => {
  let [badIdea, niceIdea, otherNiceIdea]: Function[] = [];
  // Classes
  badIdea = () => {
    // Isso infringe o princípio de responsabilidade única
    class Dashboard {
      getLanguage(): string {}
      setLanguage(language: string): void {}
      showProgress(): void {}
      hideProgress(): void {}
      isDirty(): boolean {}
      disable(): void {}
      enable(): void {}
      addSubscription(subscription: Subscription): void {}
      removeSubscription(subscription: Subscription): void {}
      addUser(user: User): void {}
      removeUser(user: User): void {}
      goToHomePage(): void {}
      updateProfile(details: UserDetails): void {}
      getVersion(): string {}
      // ...
    }
  };

  niceIdea = () => {
    class Dashboard {
      disable(): void {
        /* ... */
      }
      enable(): void {
        /* ... */
      }
      getVersion(): string {
        /* ... */
      }
    }
    // Todas as outras funções devem ser realocadas em suas devidas classes DE DOMÍNIO
  };

  // Preferir baixo acoplamento e alta coesão
  niceIdea = () => {
    class UserManager {
      // Bad: each private variable is used by one or another group of methods.
      // It makes clear evidence that the class is holding more than a single responsibility.
      // If I need only to create the service to get the transactions for a user,
      // I'm still forced to pass and instance of `emailSender`.
      constructor(
        private readonly db: Database,
        private readonly emailSender: EmailSender
      ) {}

      async getUser(id: number): Promise<User> {
        return await db.users.findOne({ id });
      }

      async getTransactions(userId: number): Promise<Transaction[]> {
        return await db.transactions.find({ userId });
      }

      async sendGreeting(): Promise<void> {
        await emailSender.send("Welcome!");
      }

      async sendNotification(text: string): Promise<void> {
        await emailSender.send(text);
      }

      async sendNewsletter(): Promise<void> {
        // ...
      }
    }
  };

  niceIdea = () => {
    class UserService {
      constructor(private readonly db: Database) {}

      async getUser(id: number): Promise<User> {
        return await this.db.users.findOne({ id });
      }

      async getTransactions(userId: number): Promise<Transaction[]> {
        return await this.db.transactions.find({ userId });
      }
    }

    class UserNotifier {
      constructor(private readonly emailSender: EmailSender) {}

      async sendGreeting(): Promise<void> {
        await this.emailSender.send("Welcome!");
      }

      async sendNotification(text: string): Promise<void> {
        await this.emailSender.send(text);
      }

      async sendNewsletter(): Promise<void> {
        // ...
      }
    }
  };

  //   Preferir composição ao invez de herança
  badIdea = () => {
    class Employee {
      constructor(
        private readonly name: string,
        private readonly email: string
      ) {}

      // ...
    }

    // Bad because Employees "have" tax data. EmployeeTaxData is not a type of Employee
    class EmployeeTaxData extends Employee {
      constructor(
        name: string,
        email: string,
        private readonly ssn: string,
        private readonly salary: number
      ) {
        super(name, email);
      }

      // ...
    }
  };
  niceIdea = () => {
    class Employee {
      private taxData: EmployeeTaxData;

      constructor(
        private readonly name: string,
        private readonly email: string
      ) {}

      setTaxData(ssn: string, salary: number): Employee {
        this.taxData = new EmployeeTaxData(ssn, salary);
        return this;
      }

      // ...
    }

    class EmployeeTaxData {
      constructor(
        public readonly ssn: string,
        public readonly salary: number
      ) {}

      // ...
    }
  };

  //   Usar encadeamentos de métodos
  badIdea = () => {
    class QueryBuilder {
      private collection: string;
      private pageNumber: number = 1;
      private itemsPerPage: number = 100;
      private orderByFields: string[] = [];

      from(collection: string): void {
        this.collection = collection;
      }

      page(number: number, itemsPerPage: number = 100): void {
        this.pageNumber = number;
        this.itemsPerPage = itemsPerPage;
      }

      orderBy(...fields: string[]): void {
        this.orderByFields = fields;
      }

      build(): Query {
        // ...
      }
    }

    // ...

    const queryBuilder = new QueryBuilder();
    queryBuilder.from("users");
    queryBuilder.page(1, 100);
    queryBuilder.orderBy("firstName", "lastName");

    const query = queryBuilder.build();
  };

  niceIdea = () => {
    class QueryBuilder {
      private collection: string;
      private pageNumber: number = 1;
      private itemsPerPage: number = 100;
      private orderByFields: string[] = [];

      from(collection: string): this {
        this.collection = collection;
        return this;
      }

      page(number: number, itemsPerPage: number = 100): this {
        this.pageNumber = number;
        this.itemsPerPage = itemsPerPage;
        return this;
      }

      orderBy(...fields: string[]): this {
        this.orderByFields = fields;
        return this;
      }

      build(): Query {
        // ...
      }
    }

    // ...

    const query = new QueryBuilder()
      .from("users")
      .page(1, 100)
      .orderBy("firstName", "lastName")
      .build();
  };
})();
