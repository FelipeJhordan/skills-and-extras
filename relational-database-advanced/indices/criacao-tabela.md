## Como criar tabela

CREATE TABLE mangas (
id INT PRIMARY KEY IDENTITY(1,1),
name VARCHAR (50) NOT NULL,
road_map VARCHAR(150) NOT NULL,
author VARCHAR(100) NOT NULL,
public_company VARCHAR(100) NOT NULL,
release_date DATETIME,
created_at DATETIME default CURRENT_TIMESTAMP NOT NULL,
update_at DATETIME default GETDATE() NOT NULL,
deleted_at DATETIME default GETDATE()
);

CREATE TABLE chapters(
id INT PRIMARY KEY IDENTITY(1, 1),
synopsis VARCHAR(50) NOT NULL,
price money default 25.00 NOT NULL,
release_date DATETIME,
manga_id INT NOT NULL,
created_at DATETIME default CURRENT_TIMESTAMP NOT NULL,
update_at DATETIME default GETDATE() NOT NULL,
deleted_at DATETIME default GETDATE()
FOREIGN KEY (manga_id) REFERENCES mangas (id)
)

## Anotações

- Existe um tipo monetário (money) com 4 casas decimais, que é QUASE TOTALMENTE parecido com numérico.
- Float tem os mesmos problemas de precisão que em qualquer banco
- CURRENT_TIMESTAMP e GETDATE() são em suma a mesma coisa ( tem diferença mas essa diferença não importa pra gente...)
- esquece o tipo timestamp, aqui isso não existe ( para nós, só internamente que existe ) https://stackoverflow.com/a/7105172
