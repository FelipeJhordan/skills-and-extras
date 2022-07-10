## Intenção oficial

Agregar responsabilidades adicionais a um objeto dinamicamente. Os decorators fornecem uma alternativa flexível ao uso  de subclasses para  para a extensão de funcionalidades

## Sobre o decorator
- Usa a composição ao invés de herança ( sempre prefira composição ao invez de herança)
- É muito parecido com o "composite" porém tem a intenção diferente
- É usado para adicionar funcionalidades a objetos em tempo de execução
- Finge ser objeto sendo decorado, porém repsassa as chamdas de métodos par ao mesmo
- Pode executar ações antes de depois das chamadas dos métodos do objeto decorado
- Pode manipular dados antes do retorno 

## Aplicabilidade
Use o padrão decorator quando:
- Você precisa adicionar funcionalidades em objetos sem quebrar ou alterar o código existente
- Você quiser usar composição ao invez de herança
- Quando você percebe que pode ocorrer uma explosão de subclasses

## Consequências
### Bom
- Composição é melhor que herança na maioria dos casos
- é fácil adicionar ou remover comportamentos de objetos sem tocar em código já escrito ou testado
- É possivel decorar um objeto já decorado, adicionando ainda mais (camadas)

### Ruim
- Quanto mais decorators em camadas, mais complexo seu código se torna