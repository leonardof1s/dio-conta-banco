# Projeto de Criação de Conta Bancária

Este projeto consiste na criação de um programa em Java que solicita informações do usuário para a criação de uma conta bancária e, em seguida, imprime as informações juntamente com uma mensagem de confirmação.

## Funcionalidades

- Solicitar informações do usuário:
  - Nome
  - Sobrenome
  - Data de Nascimento
  - Nacionalidade
  - Telefone
  - Número da Reserva
- Armazenar as informações em um objeto `ContaBancaria`.
- Exibir as informações juntamente com uma mensagem de confirmação.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `ContaBancaria.java`: Classe que representa a conta bancária do usuário.
- `ContaBancariaApp.java`: Classe principal que executa o programa, solicita as informações do usuário e imprime as informações com a mensagem de confirmação.

## Como Executar

1. Clone o repositório para sua máquina local:
    ```sh
    git clone https://github.com/seu-usuario/projeto-conta-bancaria.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd projeto-conta-bancaria
    ```
3. Compile o programa:
    ```sh
    javac ContaBancaria.java ContaBancariaApp.java
    ```
4. Execute o programa:
    ```sh
    java ContaBancariaApp
    ```

## Exemplo de Uso

Quando o programa for executado, ele solicitará ao usuário que insira suas informações:

```sh
Digite o seu nome: João
Digite o seu sobrenome: Silva
Digite a sua data de nascimento (yyyy-mm-dd): 1990-01-01
Digite a sua nacionalidade: Brasileiro
Digite o seu telefone: (11) 99999-9999
Digite o número da sua reserva: 12345
