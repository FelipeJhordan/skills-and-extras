# Façade - Structural ( Estrutural )

## Intenção

Façade ( Fachada ) é um padrão de projeto estrutural que tem a intenção de fornencer uma interface unificada para um conjunto de interfaces em um subsistema. Façade define uma interface de nível mais alto que torna o subsistema mais fácil de ser utilizado.

## Sobre o Façade.

### Aplicabilidade 

Use o padrão facade quando:
- Você quer disponibilizar uam interface mais simples para um sistema complexo
- Você quer criar pontos de estrada para determinadas partes do sistema, como serviços externos, camadas da aplicação e objetos compelxos dentro em um determinada parte do código.

## Implementação
Veja o código e os diagramas dessa pasta para entender como o Façade é implementado.

## Consequencias
O que é bom ou ruim no Façade:

### Bom
- Isola o código complexo do código cliente
- Facilita o uso do sistema
- Cria pontos de entrada para camadas da aplicação e serviços de terceiros

### Ruim
- O objeto façade se torna facilmente um God Class