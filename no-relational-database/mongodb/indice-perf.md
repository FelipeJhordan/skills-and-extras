## Create many clients

<!-- O mongodb suporta javascript -->

for (var i = 0; 1000; i++) { db.clients.insert({ name: "Cliente " + i, age: i });}

## Query explain

db.getCollection('clients').find({\_id: ObjectId("629becd52b5502c27457ee18")}).explain(true)

## Create index

db.getCollection('clients').createIndex({name: 1}, { 'name': 'idx_name'})
