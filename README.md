# Sistema de Reserva de Assentos — Cinema

Sistema de gerenciamento de reservas de assentos em um cinema, desenvolvido em **Java** como atividade acadêmica para praticar lógica de programação e conceitos fundamentais da linguagem.

## Sobre o Projeto

O projeto simula o funcionamento de uma sala de cinema, permitindo que o usuário visualize os assentos disponíveis, realize reservas e cancele reservas existentes por meio de um menu interativo no terminal.

A aplicação utiliza estruturas de repetição, decisão e vetores para controlar a ocupação dos assentos.

## Funcionalidades

- **Visualização da sala:** exibe os assentos disponíveis e ocupados.
- **Reserva de assentos:** permite reservar um assento livre.
- **Cancelamento de reservas:** permite liberar um assento previamente reservado.
- **Validação de entradas:** impede números de assentos inválidos e operações incompatíveis com o estado da reserva.
- **Contagem de assentos:** apresenta a quantidade de assentos disponíveis e ocupados.
- **Menu interativo:** mantém o sistema em execução até que o usuário escolha encerrá-lo.

## Tecnologias Utilizadas

- **Java** — linguagem de programação.
- **Scanner** — leitura de dados digitados pelo usuário.
- **IntelliJ IDEA** — ambiente de desenvolvimento, caso utilizado.

## Conceitos Praticados

- Variáveis e tipos de dados.
- Estruturas condicionais (`if`, `else` e `switch`).
- Estruturas de repetição (`do-while` e `for`).
- Vetores de objetos.
- Métodos e parâmetros.
- Encapsulamento com atributos `private`.
- Classes, objetos, construtores e métodos getters.
- Validação de dados e regras de negócio.

## Como Funciona

A sala possui **20 assentos**, organizados em 4 fileiras de 5 lugares.

| Símbolo | Significado |
|---|---|
| `[D]` | Assento disponível |
| `[X]` | Assento ocupado |

Ao executar o programa, o usuário pode escolher uma das opções:

1. Reservar um assento.
2. Cancelar uma reserva.
3. Encerrar o sistema.

O programa atualiza a ocupação dos assentos após cada operação.

## Como Executar

### Pré-requisitos

- Java JDK instalado.
- Uma IDE Java, como IntelliJ IDEA, ou um terminal com acesso ao compilador Java.

### Passos

1. Clone o repositório:

   ```bash
   git clone https://github.com/Elias-official/Sistema-de-Menu-de-Cinema-Matriz-Arraylist.git
   ```

2. Entre na pasta do projeto:

   ```bash
   cd NOME_DA_PASTA
   ```

3. Compile o arquivo `Main.java`:

   ```bash
   javac Main.java
   ```

4. Execute o programa:

   ```bash
   java Main
   ```

> **Observação:** os comandos acima consideram que as classes `Main` e `Assento` estão no mesmo arquivo `Main.java`.

## Possíveis Melhorias Futuras

- Permitir diferentes quantidades de assentos.
- Organizar os lugares por fileiras e colunas configuráveis.
- Adicionar preços diferentes conforme a localização do assento.
- Salvar as reservas em um arquivo para manter os dados após encerrar o programa.
- Criar uma interface gráfica para facilitar a utilização.

## Autor

**Elias Teixeira**

Estudante de Análise e Desenvolvimento de Sistemas, desenvolvendo projetos para aprimorar conhecimentos em programação, lógica e desenvolvimento de software.

---

*Projeto acadêmico desenvolvido com o objetivo de praticar os fundamentos da programação em Java.*
