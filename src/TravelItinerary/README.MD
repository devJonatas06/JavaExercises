# Travel Itinerary - Gerenciador de Itinerário de Viagem

## Descrição

O **Travel Itinerary** é um programa em Java que permite ao usuário gerenciar uma lista de locais para visitar, ordenando-os com base na distância em quilômetros. O sistema possibilita a navegação entre os locais cadastrados, listagem de todos os destinos e a exibição de um menu interativo para controle.

## Funcionalidades

- **Adicionar um novo local**: Insere um local na lista de itinerário, garantindo que não haja duplicatas e mantendo a ordem crescente de distância.
- **Navegação pelo itinerário**:
    - Avançar para o próximo destino.
    - Voltar para o destino anterior.
- **Listar todos os locais cadastrados**.
- **Exibir o menu de comandos disponíveis**.
- **Encerrar a execução do programa**.

## Estrutura do Projeto

O projeto contém duas classes principais:

### 1. `Place`
Classe que representa um local no itinerário, contendo:

- `name`: Nome do local.
- `distance`: Distância em quilômetros do ponto inicial.
- Construtor e métodos para acessar os atributos.

### 2. `travelItinerary`
Classe principal que gerencia a lista de locais e permite a interação com o usuário:

- `addPlace()`: Adiciona um novo local mantendo a ordem crescente de distância.
- `navigate()`: Controla a navegação entre os locais cadastrados.
- `listPlaces()`: Exibe todos os locais do itinerário.
- `printMenu()`: Mostra as opções disponíveis para interação.

## Como Executar

1. Clone ou copie os arquivos do repositório para um diretório local.
2. Compile os arquivos Java:
   ```sh
   javac Place.java travelItinerary.java
   ```
3. Execute o programa:
   ```sh
   java travelItinerary
   ```
4. Utilize os comandos no console para navegar pelo itinerário:
   ```
   (F)orward - Avançar para o próximo local
   (B)ackward - Voltar para o local anterior
   (L)ist Places - Listar todos os locais
   (M)enu - Exibir o menu de opções
   (Q)uit - Sair do programa
   ```


