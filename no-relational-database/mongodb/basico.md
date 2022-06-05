## Conectando ao mongo db pelo shell

./mongosh mongodb+srv://host/myFirstDatabase

## Show database

show databases;

## Use a database or create if not exists

use some_database;

<!-- Apartir daqui vamos supor que eu já estou usando ou estou em alguma database -->

## Create collection

<!-- Esse comando cria uma collection limitada com máximo de documentos 2-->

db.createCollection("test", {capped: true, max: 2, size: 2});

## Insert one in collection

db.test.insertOne({ name: "Teste 1"});
db.test.insertOne({ name: "Teste 2"});

<!-- Apartir daqui se eu adicionar mais um elemento na coleção, ele automaticamente vai "expirar" o primeiro da fila -->

db.test.insertOne({ name: "Teste 3"});

## Create collection implicity

db.test1.insertOne({ name: "Teste 1"});

## Insert many in collection client

<!-- Observe que o comando insert está em depreciação, pois quando utilizo dá um aviso, é recomendado usar o insertMany -->
<!-- db.clients.insertMany([{"name": "Patrick", "age": 38}, {"name": "Bob Esponja"}]); -->

db.clients.insert([{"name": "Patrick", "age": 38}, {"name": "Bob Esponja"}]);

## Update document

<!-- Observe que o comando update está em depreciação, utilize o updateOne, ou updateMany -->

db.clients.update({ \_id: ObjectId("629be3cb2b5502c27457ebbd")}, {$set: {"name": "Maria"}});
db.clients.updateOne({_id: ObjectId("629be4152b5502c27457ebbf")}, {$set: {"name": "Felipe"}});
db.clients.find();

## Update many

db.clients.updateMany({"age": 41}, {$set: {"age": 55}});

## Find all

db.clients.find({})

## Find only that age is 55

db.clients.find({ age: 55});

## Find with limit

db.clients.find({age: 55});

## Find with in

db.clients.find({"age": { in: [38, 55]}});

## Find with or

<!-- O operador and já é automático, porém para utilizar o operador OR, é necessário utilizar o atributo $or -->

db.clients.find({ $or: [{name: "maria"}, { age: 38}]});

## Find all documents below age 44

db.clients.find({"age": { $lt: 44}})

## Find all documents below or equals age 38

db.clients.find({"age": { $lte: 44}})

## Delete one

db.clients.deleteOne({"age": 55})

## Delete many

db.clients.deleteMany({"age": 38})
