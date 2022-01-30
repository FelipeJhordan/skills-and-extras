const { texto } = require('./textos')

const regExp1 = /João/i
console.log(texto.match(regExp1))
// retorna apenas a primeira ocorrência, e com informações adicionais

const regExp2 = /João/gi
console.log(texto.match(regExp2))
// retornas todas ocorrências, porem sem informações adicionais.
// apenas um array com os textos encontrado - > ['João', 'joão']

const regExp3 = /João|Maria/gi
console.log(texto.match(regExp3))
// -> [ 'João', 'Maria', 'joão', 'maria', 'Maria' ]

const regExp4 = /João|Maria/gi
console.log(texto.replace(regExp4,'Felipe'))
// Irá trocar todas ocorrências de João e Maria pelo Felipe
console.log(texto.replace(/João|Maria/i,'Felipe'))
// Irá trocar a primeira ocorrêncoia de João ou Maria pelo Felipe

// A variável $1 se refere ao primeiro grupo
console.log(texto.replace(/(João|Maria)/gi,'"$1"'))
// Irá trocar João e Maria por "João" / "Maria"

// Da para usar uma  função dentro do replace
console.log(texto.replace(/(João|Maria)/gi, function(input) {
    return input.toUpperCase()
}))