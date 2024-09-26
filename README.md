
# Resolução do Teste Técnico - Target Sistemas

Este repositório contém a implementação de um teste técnico solicitado pela Target Sistemas, com questões de lógica de programação e raciocínio matemático. O projeto foi desenvolvido em **Java** e inclui um menu interativo para que o usuário possa escolher qual questão deseja resolver.

## Funcionalidades

O programa apresenta um menu com cinco questões diferentes. Cada questão pode ser selecionada pelo operador e será executada, com uma pausa para que o operador possa visualizar a resposta antes de retornar ao menu principal.

### Menu de Opções:

1. **Verificar se um número pertence à sequência de Fibonacci**  
   Dado um número informado pelo usuário, o programa verifica se ele pertence à sequência de Fibonacci.

2. **Verificar a existência da letra 'a' em uma string**  
   O programa recebe uma string e verifica a quantidade de vezes que a letra 'a' (maiúscula ou minúscula) aparece.

3. **Calcular o valor da variável SOMA em um loop**  
   Calcula e exibe o valor final da variável SOMA em um loop específico fornecido na questão.

4. **Completar sequências lógicas**  
   Apresenta a lógica de seis diferentes sequências e exibe os próximos números corretos de cada uma delas.

5. **Resolver o problema dos interruptores e lâmpadas**  
   Explica como descobrir qual interruptor acende cada lâmpada em uma sala com três interruptores, utilizando apenas duas idas até a sala das lâmpadas.

## Como Usar

### Requisitos

- JDK 8 ou superior
- Uma IDE Java (IntelliJ, Eclipse) ou terminal para compilar e rodar o programa

### Execução

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. Compile o código:
    ```bash
    javac TesteMenu.java
    ```

3. Execute o programa:
    ```bash
    java TesteMenu
    ```

4. Siga as instruções no terminal para selecionar a questão que deseja resolver.

### Exemplo de Uso

Ao iniciar o programa, você verá o seguinte menu:


Selecione uma questão para resolver:
1. Verificar se um número pertence à sequência de Fibonacci
2. Verificar a existência da letra 'a' em uma string e contar quantas vezes aparece
3. Calcular o valor da variável SOMA ao final do processamento
4. Completar a sequência lógica
5. Resolver o problema dos interruptores e lâmpadas
0. Sair
Escolha uma opção:


Após escolher uma opção, o programa executará a lógica correspondente e exibirá a resposta. Ao final de cada execução, será necessário pressionar **Enter** para continuar.

### Exemplo de Resposta para a Questão 1 (Fibonacci):


Informe um número para verificar se pertence à sequência de Fibonacci: 21
21 pertence à sequência de Fibonacci.

Pressione Enter para continuar...


## Estrutura do Projeto

O código fonte está organizado em um único arquivo Java (`TesteEstagioRP.java`), com todas as questões implementadas em métodos separados:

- `verificarFibonacci()`: Verifica se um número pertence à sequência de Fibonacci.
- `verificarLetraA()`: Conta as ocorrências da letra 'a' em uma string.
- `calcularSoma()`: Realiza o cálculo da variável SOMA.
- `completarSequencias()`: Completa as sequências lógicas fornecidas.
- `resolverInterruptores()`: Explica a solução do problema dos interruptores.

## Licença

Este projeto não possui licença específica, sendo de uso acadêmico para o processo seletivo da **Target Sistemas**.

## Contato

Caso tenha dúvidas ou sugestões, entre em contato:

- Nome: Victor Henrique
- E-mail: victxl@gmail.com
- GitHub: https://github.com/victxl/Estagio_Ribeirao_Preto

