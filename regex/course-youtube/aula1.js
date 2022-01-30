// flags
// g -  global ( encontra todas as ocorrencias )
// i - insensitive

const { texto } = require('./textos')

//find EVERY string with João exact WORDS 
const regExpOnlyGlobal = /João/g; 


//find the first string with joão, both in uppercase and in lowercase
const regExpOnlyInsentive = /João/i;


// find EVERY string with João words, both in uppercase and in lowercase
const regExp1 = /João/gi; // true
const regExp2 = /Teve 5 fihos/i; // false fihos!=filhos

// test vai testar se existe  aquela determinada expressão regular dentro de uma string, 
console.log(regExp1.test(texto))
console.log(regExp2.test(texto))


// Buscar algo
console.log(regExp1.exec(texto))
// retorna um array se achou ou NULL
// retorna na  [0] a string buscada
// retorna na [1] o local ( index ) encontrado
// retorna na [2] o input ( o que foi passado como parametro)

// Buscar algo por grupos
const regexGroups = /(maria)(, hoje sua esposa)/i;
console.log(regexGroups.exec(texto))
// retorna um array se achou ou NULL
// retorna na  [0] a string buscada
// retorna na  [1] o primeiro grupo (maria)
// retorna na  [2] o segundo grupo (, hoje sua esposa)

const regexGroupWithOr = /(maria|joão|luiz)(, hoje sua esposa)/i
const found = regexGroupWithOr.exec(texto)
console.log(found)
// irá retornar true por que maria existe no texto