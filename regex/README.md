# Para que usar expressões regulares ?
- Manipular String
- Procurar String
- Procurar Substring

# Exemplos mais concretos
- Extrair link de tags
- Pegar números de um cpf ( mascara )
- Validar cpf/cnpj/email/ipv4/ipv6

# Informações de regex dentro do javascript
## Exec e test são usadas dentro de um objeto RegExp
const regex = /felipe/gi 
regex === RegExp

## metodos match, replace, search, split são utilizados em um objeto string
const string = "felipe"
const newString = felipe.replace(regex)
