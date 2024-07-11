# Conversor de Moedas

Projeto desenvolvido para estudos e reforçar o aprendizado no uso de API, consiste em um aplicativo em Java que permite converter valores entre diferentes moedas usando uma API de câmbio(Exchange Rate API).

## Funcionalidades

- Converte valores entre diferentes pares de moedas:
  - Dólar (USD) → Real Brasileiro (BRL)
  - Peso Argentino (ARS) → Dólar (USD)
  - Dólar (USD) → Peso Argentino (ARS)
  - Real Brasileiro (BRL) → Dólar (USD)
  - Dólar (USD) → Peso Colombiano (COP)
  - Peso Colombiano (COP) → Dólar (USD)
- Interface de usuário simples baseada em texto.

## Como Executar

1. Clone este repositório para o seu ambiente local:
    ```sh
    git clone https://github.com/seu-usuario/conversor-moedas.git
    cd conversor-moedas
    ```

2. Compile o projeto:
    ```sh
    javac -d bin src/modelo/*.java
    ```

3. Execute o programa:
    ```sh
    java -cp bin modelo.InterfaceUsuario
    ```

## Estrutura do Projeto

```plaintext
conversor-moedas/
├── src/
│   └── modelo/
│       ├── ConexaoApi.java
│       ├── Conversor.java
│       ├── InterfaceUsuario.java
│   └── principal/
│       ├── Main.java
│
└── README.md
└── .gitignore
