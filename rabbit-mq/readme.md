# Rabbit MQ
## Sobre o Rabbit MQ

- Message broker
- Implementa AMQP, MQTT, STOMP e HTTP.
- Desenvolvido em Erlang
- Desacoplamento entre serviços
- Rápido e poderoso.
- Padrão em mercado
- Guarda direto na memória ( não é I/O igual KAFKA)

## Por baixo dos panos
- O cliente faz uma requesição TCP para o server, que abre uma conexão persistente, mas dentro dessa conexão é criada sub-conexões ou canais para envio de diferentes dados. ( MULTIPLEXING CONNECTIONS )
- Uma Thread por channel

## Funcionamento básico 

O publisher ( publicador ) envia uma mensagem para uma Exchange ( um tipo de middleware entre a fila) que verifica para quais filas ou qual fila é para enviar a mensagem ( QUEUE ) onde o consumidor fica lendo da fila.

## Exchange
- Binding: É a ligação entre uma fila e um exchange
- Binding key: É uma chave específica da ligação entre a fila e o exchange
- Routing key: É uma chave enviada junto a mensagem que o exchange usa para decidir para que fila (ou filas) vai rotear uma mensagem.

### Direct
Manda mensagem para exchange e ela envia especificamente para uma fila
### Fanout
Quando manda mensagem para a Exchange, ela envia para todas filas que estão conectadas a exchange.
### Topic
Quando mensagem para mensagem, quando envia mensagem para exchange, ela é enviada de acordo com regras cadastradas. (algum tipo de padrão.)

## Queue
### PROPRIEDADES
- Durable ( se ela deve ser salva mesmo depois do restart do broker)
- Auto-delete ( removida automaticamente quando o consumer se desconecta)
- Expiry - (Define o tempo que não há mensagens ou clientes consumindo )
- Message TTL ( Tempo de vida da mensagem)
- Overflow
    - Drop head ( remove a última )
    - Reject publish ( impede a criação de novas mensagems )
- Exclusive: Somente channel que criou pode acessar
- Max length ou bytes ( Quantidade de mensagens ou o tamanho em bytes )

## Dead letter queues
- Algumas mensagens não conseguem ser entregues por algum motivo
- São encaminhadas para um Exchange específica que roteia as mensagens não que foram lidas ou que acusaram erro na leitura.
- Tais mensgens podem ser consumidas e averiguadas posteriormente

## Lazy Queues
Em casos onde há uma grande quantidade de entrada de dados, pode ocasionar problemas, já que o Rabbit MQ guarda as mensagens na memória. 
- Mensagens são lidas em disco
- Exige alto I/O ( por que é feito via disco )


## Confiabilidade 
- Consumer acknowledgement
- Publisher confirm
- Filas e mensagens duráveis / persistidas ( salvamento em disco )

### Status comunicação -> 
    - Basic.Ack
    - Basic.Reject.
    - Basic.Nack

## Util
Para testar ou esboçar algum fluxo com  rabbit MQ pode usar  https://tryrabbitmq.com/ para simular a comunicação de diferentes exchange/queue/producer/consumer
Para criar de maneira fácil filas/exchanges/channels dá para usar o RABBITMQ management