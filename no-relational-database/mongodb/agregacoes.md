## Agregações

- Procedimento de processar dados em uma ou mais etapas, onde o resultado de cada etapa é utilizado na etapa seguinte, de modo a retornar um resultado combinado.

### Existe dois tipos de agregações

#### de proposito único

- count ( vai contar os valores )
- distinct ()

##### count

db.restaurants.count({})

##### distinct

<!-- Vai trazer todos os possíveis valores para um determinado campo -->

db.restaurants.distinct({"cuisine"})

#### Pipelines

- filtros
- operadores

##### $group

db.restaurants.aggregate([{ $group: {_id: "cuisine", total: {$sum: 1}}}])

##### #addFields

db.restaurants.aggregate([{ $addFields: {"test": true}}])

### Existe também algumas funções

- $sum
- $avg
- max
- min

### Operadores lógicos

- $and
- $or
- $not
- $nor

### Exemplo de filtro

db.restaurants.aggregate([{$match: { $and: [{ cuisine: 'American'}, {borough: "Brooklyn"}]}}])
