# Estudo sobre serverless com node
## Anotações
- É um tipo de servidor (apesar que o nome indique que sem servidor...)
- Basicamente hospedar uma funcionalidade da aplicação sem se preocupar com configurações do servidor ( sem se preocupar com node processo de deploy ).
- Pode colocar qualquer tipo de aplicação, menos as de socket/tempo real.
- Geralmente disparadas por rotas http(rest) ou eventos disparados por outros serviços existentes.
- Geralmente a arquitetura serverless é utilizada para processar códigos assíncronos que não tem necessidade de execução imediata e que podem causar um processamento desnecessário na aplicação principal hospedada em servidores comuns.
- Importante frisar que toda função que utiliza esse modelo possui um limite de tempo de execução tare é extremamente difícil de debugar ou tes, por isso, é importante que o serviço seja extremamente simples e tenha um objetivo bem definido com poucos efeitos colaterais.
- Além disso, esses serviços são stateless e, por isso, não devem guardar nenhum estado entre cada execução pois cada nova execução pode reconstruir o servidor do total zero sem resquícios de uma execução anterior.
- Serverless podem ser tanto BaaS tanto FaaS.

## Casos de uso
- Micro-serviços
- Picos de acesso ( porém considerar que o serviço deve ser pequeno e não um aplicativo enorme. )
- Serviço com pouco tráfego
- Diminuir go-to-market.
## Evitar
- Criar grandes/megas aplicações com severless.

## Vantagens
- Não precisamos configurar o servidor (Node, NGINX, Apache, etc...);
Extremamente barato: U$ 0,20/milhão de requisições na - - AWS (Fora tempo de computação caso seu serviço ocupe muito tempo);
- Escalabilidade automática: Não importa se tivermos uma ou 1 milhão de requisições, os servidores são auto-escaláveis e tudo isso é gerenciado pela provedora;
- Deploy muito simples: Subir novo código? Basta encapsular todo o código em um ZIP e subir pro servidor, o resto deixa com ele. Existem ferramentas que automatizam ainda mais isso;

## Desvantagens
- Execuções espaçadas criam o servidor do zero, realizando cold-starts da aplicação que podem ocasionar perda de performance momentânea;
- As funções executadas jamais podem passar de 300 segundos de execução, e se chegar perto disso o custo começa a aumentar bastante;
- O debugging e teste das funções serverless é extremamente difícil, ainda mais quando essas dependem de eventos que ocorrem em outros serviços;
- Utilizado da forma errada o custo é maior que servidores cloud comuns já que serviços serverless não são criados para aplicações com execuções constantes;

## Comandos
- serverless create --template aws-nodejs --path . 
- npx serverless config credentials --provider aws --key=suakey --secret suasecret

O que acontece por debaixo dos panos? é criado um bucket no S3 contendo a pasta nodeless zipada.

## Referência
https://blog.rocketseat.com.br/serverless-nodejs-lambda/
https://www.redhat.com/pt-br/topics/cloud-native-apps/what-is-serverless