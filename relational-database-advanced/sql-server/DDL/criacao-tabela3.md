## Utilização de cuuid como id "vísivel" que se expõe nas apis

-- uuid é único na tabela, cada banco de dados, cada servidor, permite facil mesclagem de registro em diferentes banco de dados
-- porém pesado dificil de depurar comparado com um id inteiro sequencial, por isso é melhor usar apenas para export uma identificação para o mundo, e usar
-- o id como serial/int internamente

CREATE TABLE mangas (
id int primary key identity(1,1) not null ,
uuid uniqueidentifier default newid(),
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
uuid uniqueidentifier default newid(),
synopsis VARCHAR(50) NOT NULL,
price money default 25.00 NOT NULL,
release_date DATETIME,
manga_id INT NOT NULL,
created_at DATETIME default CURRENT_TIMESTAMP NOT NULL,
update_at DATETIME default GETDATE() NOT NULL,
deleted_at DATETIME default GETDATE()
FOREIGN KEY (manga_id) REFERENCES mangas (id)
)
