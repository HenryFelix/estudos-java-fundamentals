# 📦 Transportadora Mágica - Arquitetura com Java Generics e Streams API

Este mini-projeto foi desenvolvido para demonstrar a aplicação prática de conceitos avançados de **Java**, focando em segurança de tipos, precisão financeira e programação funcional.

## 🚀 Sobre o Projeto
O sistema simula a logística de uma transportadora. O desafio principal resolvido aqui é a criação de um "motor de transporte" universal. Em vez de criar classes específicas como `CaixaParaTeclado` ou `CaixaParaMouse`, o projeto utiliza a arquitetura de **Generics (`<T>`)** para criar uma única estrutura flexível e segura (`Caixa<T>`), capaz de embalar qualquer tipo de produto garantindo a integridade dos dados em tempo de compilação.

## 🛠️ Tecnologias e Conceitos Aplicados

* **Java Generics (`<T>`)**: Criação de classes genéricas fortemente tipadas. O código demonstra na prática como os Generics evitam erros em tempo de execução. *Nota: O código `Main` contém um erro intencional comentado (`caminhao.add(caixaInt);`) para ilustrar como o compilador do Java bloqueia a inserção de uma `Caixa<Integer>` num camião de `Caixa<Produto>`.*
* **BigDecimal**: Utilizado em substituição ao `double` nativo para garantir 100% de precisão matemática em valores monetários (preços dos produtos), evitando os clássicos bugs de ponto flutuante em sistemas financeiros.
* **Streams API & Lambdas**: Processamento declarativo de dados. O projeto utiliza uma "esteira" de Streams (`.map`, `.filter`, `.forEach`) para extrair os produtos das caixas e filtrar encomendas baseadas no valor, resultando num código limpo e de fácil manutenção.
* **Clean Code & Encapsulamento**: Uso de injeção de dependência via construtor (evitando objetos `null`) e delegação de responsabilidades (uso do `@Override toString()` na classe Produto para auto-formatação).

## 📂 Estrutura do Código

1. **`Caixa<T>`**: Classe genérica e imutável que atua como o contentor principal.
2. **`Produto`**: Classe de domínio que representa a mercadoria, utilizando `BigDecimal` para o atributo `preco`.
3. **`Main`**: A classe orquestradora onde o camião (`List<Caixa<Produto>>`) é carregado e processado pela Streams API.

## 💻 Como testar a segurança dos Generics
No ficheiro `Main.java`, descomente a seguinte linha:
```java
// caminhao.add(caixaInt);
