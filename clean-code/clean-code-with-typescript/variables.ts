let badExample, goodExample;

// Criar variáveis que façam sentido

badExample = () => {
  // As variáveis não tem nome que façam "sentido"
  function between<T>(a1: T, a2: T, a3: T): boolean {
    return a2 <= a1 && a1 <= a3;
  }
};

goodExample = () => {
  function between<T>(value: T, left: T, right: T): boolean {
    return left <= value && value <= right;
  }
};

// Crie variáveis que soem pronúnciaveis
//  Se você não consegue pronunciar, você não pode discutir sem soar igual um idiota

badExample = () => {
  type DtaRcdr102 = {
    genymentdsok: Date;
    monydsjod9s: Date;
    pszquint: number;
  };
};

goodExample = () => {
  type Customer = {
    generationTimestamp: Date;
    modificationTimestamp: Date;
    recordId: number;
  };
};

// Usa o mesmo vocabulário para o mesmo tipo de variável
type User = {
  nome: string;
};
badExample = () => {
  function getUserInfo(): User {}
  function getUserDetails(): User {}
  function getUserData(): User {}
};
goodExample = () => {
  function getUser(): User {}
};

// Usar nomes pesquisáveis
// Nós vamos ler mais códigos e não escrever. Por isso é importante que o
// Código que iremos escrever seja de fácil leitura e "pesquisável".

badExample = () => {
  let restart = async () => {};
  // O que diabos significa 864...
  setTimeout(restart, 86400000);
};

goodExample = () => {
  // Por convenção, as constantes deveriam ser escritas
  // em modo de caixa alta, porém não vemos isso, somente em
  //  arquivos de configuração ou de definições no ts/js
  const MILLISECONDS_PER_DAY = 24 * 60 * 60 * 1000; // 8640000
};

// Use variáveis explicativas

badExample = () => {
  declare const users: Map<string, User>;

  for (const keyValue of users) {
  }
};

goodExample = () => {
  declare const users: Map<string, User>;

  for (const [id, user] of users) {
  }
};

// Evite inferências/mapeamentos mentais
// Claridade reina
badExample = () => {
  const u = getUser();
  const s = getSubscription();
};

goodExample = () => {
  const user = getUser();
  const subscription = getSubscription();
};

//  Não adicione contexto desnecessário
//  Se sua classe/tipo/objeto name mostra alguma coisa, não repita
//  no atributo

badExample = () => {
  type Car = {
    carMake: string; // se é um atributo do carro, o prefix "Car" é redundante
    carModel: string;
    carColor: string;
  };

  function print(car: Car): void {
    console.log(`${car.carMake} ${car.carModel} (${car.carColor})`);
  }
};

goodExample = () => {
  type Car = {
    make: string;
    model: string;
    color: string;
  };
  function print(car: Car): void {
    console.log(`${car.make} ${car.model} (${car.color})`);
  }
};

// Use argumentos padrões em vez de curto circuito ou conditionais
badExample = () => {
  function loadPages(count?: number) {
    const loadCount = count !== undefined ? count : 10;
  }
};

goodExample = () => {
  function loadPages(count: number = 10) {}
};

// Use ENUM para documentar a intenção

let projector = { configureFilme: (genre) => {} };
badExample = () => {
  const GENRE = {
    ROMANTIC: "romantic",
    DRAMA: "drama",
    COMEDY: "comedy",
    DOCUMENTARY: "documentary",
  };

  projector.configureFilme(GENRE.COMEDY);
};

goodExample = () => {
  enum GENRE {
    ROMANTIC,
    DRAMA,
    COMEDY,
    DOCUMENTARY,
  }

  projector.configureFilme(GENRE.COMEDY);
};
