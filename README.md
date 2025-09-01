# Explorando Padrões de Projeto em Java

Este projeto implementa **padrões de projeto clássicos** em Java puro, sem frameworks externos, para reforçar os conceitos de **Singleton, Strategy e Facade**.

---

## Padrões Implementados

- **Singleton** → Garante que apenas uma instância da classe exista em toda a aplicação.  
- **Strategy** → Permite trocar algoritmos em tempo de execução (ex.: soma ou multiplicação).  
- **Facade** → Fornece uma interface simplificada para iniciar subsistemas complexos (CPU, Memória, Disco).

---

## Estrutura
src/
├── App.java # Classe principal (executa os exemplos)
├── SingletonExample.java # Singleton
├── Operation.java # Strategy - interface
├── SumOperation.java # Strategy - implementação (soma)
├── MultiplyOperation.java# Strategy - implementação (multiplicação)
├── StrategyExample.java # Strategy - contexto
├── CPU.java # Facade - subsistema 1
├── Memory.java # Facade - subsistema 2
├── Disk.java # Facade - subsistema 3
└── FacadeExample.java # Facade - fachada


---

## Como Executar

1. Clone este repositório:

```bash
git clone https://github.com/nay-joplin/design-patterns-java.git
cd design-patterns-java

## Objetivo

Este projeto foi desenvolvido como parte do Desafio de Padrões de Projeto em Java no Bootcamp Santander/DIO, com foco em praticar a aplicação de boas práticas de arquitetura no desenvolvimento back-end.

