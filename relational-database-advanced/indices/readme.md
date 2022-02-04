# Oque são Índices?
O Índice é uma estrutura de dados utilizada para melhorar o tempo de execução de consultas ( Pós é utilizado uma 2 estrutura de dados, uma árvore que contêm a posição relacional dos valores)

# Vantagem
- Agiliza as pesquisas
# Desvantagem
- O processo, alteração e delete de dados se torna mais lento, em função do maior número de estruturas que é necessário atualizar ( pois é necessário atualizar também a árvore com os indices).
- Consome espaço de armazenamento ( pois existe uma segundo estrutura de dados para guardar a posição dos indices )

## Tipos de indices
- B-tree ( balanceado )
- Hash utel para comparações ( mas não é seguro )
- GIN ( MAPEAR VARIOS VALORES PARA UMA LINHA) [ Muito complexo kkk]


## Informações extras
- O banco será bloqueado no momento da criação do index, portanto o sistema ficará fora do ar, e em sistemas mt grandes, poderá demorar muito tempo. ( mas no postgre da para criar indices concorrentes hehe)
- Para aproveitar o index a pesquisa tem que estar ordenada na mesma ordem que o index... 

## exemplo

create table clientes {
    idclient integer primary key,
    nome varchar(80)
}

select * from clientes order by nome; ( 800ms )

create index idx_cliente on clientes ( nome )

select * from clientes order by nome; ( 245ms )

