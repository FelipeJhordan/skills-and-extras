## Problema
Enquanto no Observable você dispara um único evento e todos os incristos são notificados no evento, no Publisher-Subscriber é necessário definir o evento quer será publicado e que deseja se inscrever deve declarar o evento que possuí interesse.

## Detalhes
- Padrão de comunicação entre sistemas.
- Uma alternativa no sistema de filas
- Padrão simples.
- Multitecnologia.

## Vantagens
- Não há fila alguma quando uma mensagem é enviada. Simplismente um Broadcast é realizado.
- Normalmente não há verificação de recebimento na outra ponta.
- O publisher não possui idéia de quem é o subscriber e o subscriber não possui ideía de quem é o publisher.
- Não há pooling

## Pontos importantes
- Em geral o consumidor da mensagem não "fala de volta" com o publicador enviando qualquer tipo de confirmação ou algo do tipo.
- Multiplo recebedores
