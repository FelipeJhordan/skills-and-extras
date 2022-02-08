## Como alterar uma tabela

#### Agora vamos ao que mais acontece.

```
create table junktable (
id int primary key identity(1,1),
any_value varchar(50)
)

-- cria nova coluna chamada junk_id
alter table mangas
	add  junk_id int not null;

-- cria uma nova chave estrangeira, que referencia o valor  da junktable.id ao junk_id
alter table mangas
	add constraint fk_junktable_manga foreign key (junk_id)
	references junktable (id)
	on delete cascade;

-- dropa a chave estrangeira
alter table mangas
	drop constraint fk_junktable_manga;

-- dropa a coluna ( não pode acontecer antes de dropar a chave estrangeira )
alter table mangas
	drop column junk_id;

```
