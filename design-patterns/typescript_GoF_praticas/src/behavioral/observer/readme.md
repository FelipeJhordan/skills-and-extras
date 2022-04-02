## Intenção Oficial
- Define uma dependencia de um para muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados.

## Sobre o Observer
- Implementado com dois tipo de objetos: objetos obsersáveis (Obsersable) e objetos observadores ( Observer )
- Objetos obeserváveis ( Observable ) têm uma referência para todos os seus observadores. isso torna possível adicionar, remover e notificar todos os observadores quando seu estado muda.
- Objetos Observadores ( Observer ) devem ter meios de receber notificações de seus observáveis. Geralmente isso é feito com apenas um método.

##  Aplicabilidade
Use o Observer quando:
- Você precisa notificar ´varios objetos sobre a mudança de estado de outro(s) objeto(s)

## Consequencias
### Vantagem
- Usa o SRP e OCP
- Facilita a comunicação entre objetos em tempo de execução.

### Desvantagem
- Pode ser complexo ou quase impossível manter a ordem em que as notificações são enviadas.