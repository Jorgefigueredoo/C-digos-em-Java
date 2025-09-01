# 📚 Projeto de Estudos Java - Conceitos Fundamentais

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![Licença](https://img.shields.io/badge/Licença-MIT-blue?style=for-the-badge)

## 🎯 Sobre o Projeto

Este repositório contém uma coleção abrangente de exemplos práticos e exercícios em Java, cobrindo desde conceitos básicos até tópicos avançados de programação orientada a objetos. O projeto foi desenvolvido como material de estudo e referência para aprendizado da linguagem Java.

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Como Executar](#-como-executar)
- [Conteúdo Abordado](#-conteúdo-abordado)
- [Exemplos Destacados](#-exemplos-destacados)
- [Contribuição](#-contribuição)
- [Licença](#-licença)
- [Contato](#-contato)

## 🏗️ Estrutura do Projeto

```
📦 java-learning-project
├── 📁 Classes/
│   ├── 📁 Carro/               # Herança e Polimorfismo
│   ├── 📁 ContaBancaria/       # Encapsulamento e Construtores
│   ├── 📁 Estoque/             # Métodos e Operações
│   ├── 📁 Retangulo/           # Cálculos Geométricos
│   ├── 📁 Salario/             # Manipulação de Dados
│   └── 📁 Triangulo/           # Comparação de Objetos
├── 📁 Composiçao/              # Composição e Associações
├── 📁 DataHora/                # Manipulação de Data/Hora
├── 📁 Enumeracao/              # Enums e Estados
├── 📁 EstruturaCondicional/    # If/Else e Condicionais
├── 📁 EstruturaRepetição/      # Loops e Iterações
├── 📁 Funcao/                  # Métodos e Funções
├── 📁 Listas/                  # Collections e Listas
├── 📁 Matrizes/                # Arrays Bidimensionais
└── 📁 Vetores/                 # Arrays e Estruturas
```

## 🛠️ Tecnologias Utilizadas

- **Java SE** - Versão 8 ou superior
- **Scanner** - Para entrada de dados
- **Collections Framework** - ArrayList, List
- **Date/Time API** - LocalDate, LocalDateTime, Instant
- **Streams API** - Para operações funcionais

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- IDE de sua preferência (Eclipse, IntelliJ IDEA, VS Code)

### Passos para execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/java-learning-project.git
   ```

2. **Navegue até o diretório**
   ```bash
   cd java-learning-project
   ```

3. **Compile um exemplo específico**
   ```bash
   javac Classes/Carro/Herança.java
   ```

4. **Execute o programa**
   ```bash
   java Classes.Carro.Herança
   ```

### Exemplo Rápido

```java
// Executar o exemplo de Conta Bancária
cd Classes/ContaBancaria
javac Program.java
java Classes.ContaBancaria.Program
```

## 📚 Conteúdo Abordado

### 🔹 Fundamentos
- **Variáveis e Tipos de Dados**
- **Entrada e Saída de Dados**
- **Operadores e Expressões**
- **Estruturas Condicionais**
- **Estruturas de Repetição**

### 🔹 Programação Orientada a Objetos
- **Classes e Objetos**
- **Construtores e Sobrecarga**
- **Encapsulamento (getters/setters)**
- **Herança e Polimorfismo**
- **Composição e Associação**

### 🔹 Estruturas de Dados
- **Arrays (Vetores)**
- **Matrizes**
- **Listas (ArrayList)**
- **Manipulação de Collections**

### 🔹 Tópicos Avançados
- **Enumerações (Enums)**
- **Date/Time API**
- **Stream API**
- **Tratamento de Strings**
- **Formatação de Saída**

## ✨ Exemplos Destacados

### 💰 Sistema de Conta Bancária
```java
// Demonstra encapsulamento, construtores e métodos
ContaBancaria conta = new ContaBancaria(123, "João Silva", 1000.0);
conta.deposito(500.0);
conta.retirar(200.0);
System.out.println(conta); // Exibe informações formatadas
```

### 🚗 Sistema de Herança (Veículos)
```java
// Demonstra herança e polimorfismo
Carro carro = new Carro();
carro.marca = "Toyota";
carro.modelo = "Corolla";
carro.exibir_informaçoes(); // Método que utiliza herança
```

### 👥 Gestão de Funcionários
```java
// Demonstra uso de Collections e Stream API
List<Funcionario> funcionarios = new ArrayList<>();
funcionarios.stream()
    .filter(f -> f.getId().equals(idProcurado))
    .findFirst()
    .ifPresent(f -> f.aumentarSalario(10.0));
```

## 🎓 Objetivos de Aprendizado

Este projeto foi estruturado para cobrir:

- ✅ **Sintaxe básica do Java**
- ✅ **Conceitos de POO aplicados**
- ✅ **Boas práticas de programação**
- ✅ **Manipulação de dados e estruturas**
- ✅ **Resolução de problemas práticos**
- ✅ **Uso de APIs nativas do Java**

## 🧪 Exercícios Incluídos

| Categoria | Exercícios | Dificuldade |
|-----------|------------|-------------|
| **Básicos** | Entrada de dados, condicionais, loops | ⭐ |
| **Intermediários** | Classes, métodos, arrays | ⭐⭐ |
| **Avançados** | Collections, composição, enums | ⭐⭐⭐ |

## 🤝 Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto:

1. Faça um **fork** do projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/MinhaFeature`)
3. Faça **commit** das suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Faça **push** para a branch (`git push origin feature/MinhaFeature`)
5. Abra um **Pull Request**

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 📞 Contato

**Desenvolvedor:** Jorge Antonio 
**Email:** contatojorgeafigueredo@gmail.com
**LinkedIn:** [Seu LinkedIn](https://linkedin.com/in/seu-perfil)  
**GitHub:** [Jorgefigueredoo](https://github.com/Jorgefigueredoo/C-digos-em-Java/new/main?filename=README.md)

---

### 🌟 Se este projeto foi útil para você, considere dar uma ⭐!

---

**Última atualização:** Setembro 2025
