# API Spring Boot

Este projeto é uma API REST desenvolvida com Spring Boot, utilizando MySQL como banco de dados. A aplicação está pronta para ser executada localmente utilizando o VS Code.

## ✅ Requisitos

- Java 17+
- MySQL 8+
- Maven 3.8+
- Visual Studio Code com as extensões:
  - Java Extension Pack
  - Spring Boot Extension Pack

## 🚀 Como executar

### 1. Clone o repositório

```
git clone https://github.com/GianiBraga/api_spring_boot.git
cd api_spring_boot
```

### 2. Configure o banco de dados

Crie um banco de dados no MySQL:
```
CREATE DATABASE nome_do_banco;
```

 No arquivo src/main/resources/application.properties, configure:

```
 spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 2. Compile e execute
```
./mvnw spring-boot:run
```

A aplicação estará disponível em: http://localhost:8080

## 📚 Documentação dos Endpoints

## 🔹 GET/produtos
Retorna a lista de todos os produtos cadastrados.
http://localhost:8080/produtos

## 🔹 POST/produtos
Cadastra um novo produto.
http://localhost:8080/produtos

## 🔹 GET/produtos/{id}
Retorna os dados de um produto específico.
http://localhost:8080/produtos/{id}

## 🔹 PUT/produtos/{id}
Atualiza os dados de um produto específico.
http://localhost:8080/produtos/{id}

## 🔹 DELETE/produtos{id}
Remove um produto do banco de dados.
http://localhost:8080/produtos{id}

# 🧪 Testando a API
Você pode usar ferramentas como:

- Postman

- Insomnia

# 📌 Observações

Certifique-se de que o banco de dados esteja rodando antes de iniciar a aplicação.
A porta padrão da aplicação é 8080.
