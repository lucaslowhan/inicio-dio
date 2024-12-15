# Calculadora Simples em Java

Este projeto implementa uma calculadora simples em Java que permite ao usuário realizar operações matemáticas básicas: soma, subtração, multiplicação e divisão.

## Funcionamento

O programa solicita que o usuário forneça seu nome e em seguida apresenta um menu com as opções de operações matemáticas. Após escolher uma operação, o usuário deve fornecer dois números e o programa realizará a operação escolhida, exibindo o resultado.

### Operações Disponíveis:

1. **Somar**: Realiza a soma entre dois números.
2. **Diminuir**: Realiza a subtração entre dois números.
3. **Multiplicar**: Realiza a multiplicação entre dois números.
4. **Dividir**: Realiza a divisão entre dois números. Caso o divisor seja zero, o programa exibirá um erro informando sobre a divisão por zero.

## Estrutura do Código

### Classe `Main`

A classe `Main` é o ponto de entrada do programa. Ela realiza as seguintes funções:

1. **Leitura do nome do usuário**: Solicita que o usuário insira seu nome e exibe uma saudação personalizada.
<img src="/assets/img/screenshot.png">
2. **Menu de Operações**: Exibe um menu com as opções de operações matemáticas disponíveis.
<img src="/assets/img/screenshot2.png">
3. **Entrada dos Valores**: O programa solicita dois valores numéricos ao usuário para realizar a operação.
<img src="/assets/img/screenshot3.png">
4. **Chamada dos Métodos da Classe `Calculadora`**: De acordo com a escolha do usuário, o programa chama o método correspondente na classe `Calculadora` e exibe o resultado.
<img src="/assets/img/screenshot4.png">

### Classe `Calculadora`

A classe `Calculadora` define os métodos que realizam as operações matemáticas. Ela possui dois atributos: `primeiroValor` e `segundoValor`, que armazenam os valores inseridos pelo usuário. Para cada operação, o método correspondente realiza o cálculo e retorna o resultado:

- **`somar()`**: Soma os dois valores.
- **`diminuir()`**: Subtrai o segundo valor do primeiro.
- **`multiplicar()`**: Multiplica os dois valores.
- **`dividir()`**: Divide o primeiro valor pelo segundo. Caso o segundo valor seja zero, o método retorna uma mensagem de erro.
<img src="/assets/img/screenshot5.png">

## Como Executar

1. **Pré-requisitos**: Certifique-se de que o Java esteja instalado em sua máquina. Caso não tenha o Java, você pode baixá-lo no site oficial [aqui](https://www.java.com/pt-BR/download/).

2. **Compilação e Execução**:
    - Abra o terminal ou prompt de comando.
    - Navegue até o diretório onde o código foi salvo.
    - Compile o código com o comando:
      ```
      javac Main.java
      ```
    - Execute o programa com o comando:
      ```
      java Main
      ```

3. **Interação**:
    - O programa pedirá para você inserir seu nome, depois exibirá um menu com opções de operações.
    - Escolha uma operação (1-4) e forneça dois números.
    - O programa exibirá o resultado da operação.

## Exemplo de Execução
```
Qual o seu nome? João 
Olá João! 
Digite uma das opções abaixo: 
1 - Somar 
2 - Diminuir 
3 - Multiplicar 
4 - Dividir 
3 
Digite o primeiro valor: 5 
Digite o segundo valor: 10 
O resultado da multiplicação é: 50.0
```


## Melhorias Possíveis

- **Validação de Entrada**: Atualmente, o programa não valida se a entrada do usuário é um número válido. Isso poderia ser melhorado com a verificação do tipo de entrada.
- **Operações Com Mais de Dois Valores**: Poderia ser expandido para permitir que o usuário insira mais de dois valores e realize operações sobre todos eles.
- **Interface Gráfica**: Uma versão futura poderia implementar uma interface gráfica (GUI) para melhorar a interação do usuário.

## Contribuição

Se você deseja contribuir com este projeto, fique à vontade para fazer um fork e submeter um pull request com suas melhorias!

