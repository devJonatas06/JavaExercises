# Contact List - Aplicativo de Gerenciamento de Contatos

## Descrição
O projeto **Contact List** é um aplicativo de console em Java que permite ao usuário gerenciar uma lista de contatos. Com ele, é possível adicionar, atualizar, remover, buscar e listar contatos de maneira simples e eficiente.

## Funcionalidades
- **Adicionar um novo contato**: Permite adicionar um contato com nome e número de telefone.
- **Atualizar um contato existente**: Possibilita modificar o nome e/ou o número de um contato.
- **Remover um contato**: Exclui um contato da lista.
- **Buscar um contato**: Permite localizar um contato pelo nome.
- **Listar todos os contatos**: Exibe todos os contatos salvos no sistema.

## Estrutura do Projeto
O projeto é composto por três classes principais:

### 1. `Contact`
Classe que representa um contato, contendo:
- `name`: Nome do contato.
- `phoneNumber`: Número de telefone.
- `CraatContact()`: Método estático para criar um novo contato.

### 2. `MobilePhone`
Classe que gerencia os contatos, incluindo:
- `addNewContact()`: Adiciona um novo contato.
- `updateContact()`: Atualiza um contato existente.
- `removeContact()`: Remove um contato da lista.
- `queryContact()`: Busca um contato pelo nome.
- `printContact()`: Exibe todos os contatos cadastrados.

### 3. `testes`
Classe contendo o método `main()`, que permite ao usuário interagir com o programa através do console.

## Como Executar
1. Clone o repositório ou copie os arquivos para um diretório local.
2. Compile os arquivos Java:
   ```sh
   javac Contact.java MobilePhone.java testes.java
   ```
3. Execute o programa:
   ```sh
   java testes
   ```
4. Utilize o menu interativo para gerenciar seus contatos.



