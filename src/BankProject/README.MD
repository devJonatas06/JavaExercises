# Banco - Sistema de Gerenciamento de Clientes e Agências

## Descrição
Este projeto implementa um sistema de gerenciamento bancário simples em Java. Ele permite a criação de agências bancárias, o cadastro de clientes e o registro de transações financeiras para cada cliente.

## Funcionalidades
- Criar um banco com um nome específico.
- Adicionar agências ao banco.
- Cadastrar clientes em uma agência com um depósito inicial.
- Registrar transações para clientes já cadastrados.
- Exibir a lista de agências e seus clientes com suas respectivas transações.

## Estrutura do Código
O código contém as seguintes classes:

### `Bank`
Classe principal responsável por gerenciar as agências bancárias e os clientes.

#### Métodos principais:
- `addBranch(String branchName)`: Adiciona uma nova agência ao banco.
- `addCustomer(String branchName, String customerName, double initialTransactions)`: Adiciona um novo cliente a uma agência com um depósito inicial.
- `addCustomerTransaction(String branchName, String customerName, double transaction)`: Adiciona uma transação a um cliente existente.

### `Branch`
Representa uma agência bancária que contém uma lista de clientes.

#### Métodos principais:
- `newCustomer(String customerName, double initialTransactions)`: Adiciona um novo cliente à agência.
- `addCustomerTransaction(String customerName, double transaction)`: Registra uma nova transação para um cliente existente.

### `Customer`
Representa um cliente do banco com um nome e uma lista de transações.

#### Métodos principais:
- `addTransaction(double transaction)`: Adiciona uma nova transação à conta do cliente.

## Exemplo de Uso
```java
Bank bank = new Bank("Banco Central");

bank.addBranch("Agência Centro");
bank.addCustomer("Agência Centro", "Carlos", 500.0);
bank.addCustomerTransaction("Agência Centro", "Carlos", 150.0);

bank.addBranch("Agência Norte");
bank.addCustomer("Agência Norte", "Ana", 300.0);
bank.addCustomerTransaction("Agência Norte", "Ana", 100.0);
```

## Saída Esperada
```
Lista de Bancos e Clientes:

Agência: Agência Centro
Carlos - Transações: [500.0, 150.0]

Agência: Agência Norte
Ana - Transações: [300.0, 100.0]
```

## Tecnologias Utilizadas
- Java
- ArrayList para armazenamento de dados dinâmicos



