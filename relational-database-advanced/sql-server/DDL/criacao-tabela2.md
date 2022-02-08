## Como criar uma relação muito para muitos

Vamos tentar imaginar um manga que pode ter varios capitulos, e um capitulo que pode ter vários mangas, isso por que seilá, é um episódio especial onde junta dois protagonistas de dois animes diferentes ou heroís de quadrinhos... enfim não emporta, só imagine.

```
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
created_at DATETIME default CURRENT_TIMESTAMP NOT NULL,
update_at DATETIME default GETDATE() NOT NULL,
deleted_at DATETIME default GETDATE()
)


CREATE TABLE mangas_chapters(
id INT PRIMARY KEY IDENTITY(1,1),
id_manga INT  NOT NULL,
id_chapter INT NOT NULL,
release_date DATETIME,
FOREIGN KEY(id_manga) REFERENCES mangas (id),
FOREIGN KEY (id_chapter) REFERENCES chapters (id)
)
```
