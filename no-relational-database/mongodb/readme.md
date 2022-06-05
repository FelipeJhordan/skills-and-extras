# Mongodb

## Características

- Tipo não apenas relacional do tipo Documento.
- Suporte a indices
- Map-Reduce
- Gridfs

## Comparação

- Document ==> Tupla/Registro (Lembrando que seus dados não podem depender de outros dados, algo que pode trazer redundância, algo que é proibida ou má prática no sql)
- Collection ==> Tabela
- Embedding/Linking ==> Join

## Quando usar:

- Grande volume de dados.
- Sabe performar, porém é necessário pensar de forma inteligente como modelar.
- Dados não necessariamente precisam estar estruturados

## Quand não utilizar:

- Necessidade de relacionamentos/joins
- Propriedade ACID e transações são importantes.
- Curiosidade: Diversas entidades de pagamento não homologam sistemas cujos dados financeiros dos clientes não estejam em bancos de dados relacionais tradicionais.

## Schema Design

### Embedding

- Documento autocontido ( toda informação que eu preciso está dentro do documento )

#### Pros:

- Consulta informações em uma única query
- Atualiza o registro em uma unica operação

#### Contras:

- Limite de 16MB por documento ( muita coisa )

### Referência

- Documento com depêndencia de outros documentos ou collections ( refêrencia )

#### Pros:

- Documentos pequenos
- Não duplica informações
- ( Usado quando os dados não são acessados em todas consultas )

#### Contras:

- Duas ou mais queries ou utilização do $lookup

### Boas práticas

- Evite docuemntos muito grande
- Use campos objetivos e curtos
- Analise as suas queries utilizando explain()
- Atualize apenas os campos alterados
- Evite negações em queries
