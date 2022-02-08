## Como alterar uma tabela

```
-- Alterar o tamanho para 300
alter table mangas
alter column road_map varchar(300);

-- Criando uma nova tabela com um dado do tipo int
CREATE TABLE t1 (c INT);
INSERT INTO t1
    VALUES
        (1),
        (2),
        (3);

-- Alterando o tipo para varchar
ALTER TABLE t1 ALTER COLUMN c VARCHAR (2);

INSERT INTO t1
VALUES ('@');

-- Alterando para inteiro novamente, porém não da! não da para converter uma string em um inteiro, mas o contrário sim!
ALTER TABLE t1 ALTER COLUMN c INT;


-- Voltando ao mangas
-- alterando  public_company para permitir valores nulos
alter table mangas alter column public_company VARCHAR(100) NULL;
```
