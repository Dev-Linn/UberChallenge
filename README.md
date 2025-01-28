# Microserviço de Envio de E-mails  
## Desafio Backend Uber

Este repositório contém um microserviço API desenvolvido com **Java, Spring Boot** e **AWS Simple Email Service (SES)**, criado para solucionar o desafio de backend proposto pela Uber.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **AWS Simple Email Service (SES)**

## Como Começar

### 1. Clone o Repositório

Para começar, clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/Dev-Linn/UberChallenge.git
```

### 2. Dependências

Instale as dependências do projeto utilizando o **Maven**. Você pode usar o comando abaixo para instalar as dependências necessárias:

```bash
mvn install
```

### 3. Configuração de AWS

Crie o arquivo `application.properties` na raiz do projeto para incluir suas credenciais da AWS. Por questões de segurança, esse arquivo não está no repositório.

Exemplo de configuração:

```properties
aws.region=us-east-1
aws.accessKeyId=SUA_ACCESS_KEY_AQUI
aws.secretKey=SUA_SECRET_KEY_AQUI
```

### 4. Inicie a Aplicação

Para rodar a aplicação localmente, use o comando abaixo com o Maven:

```bash
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

## Endpoints da API

### Enviar E-mail

**POST /api/email/send**

Permite o envio de um e-mail para um endereço de destino.

**Exemplo de corpo de requisição:**

```json
{
  "to": "exemplo@dominio.com",
  "subject": "Assunto do E-mail",
  "body": "Conteúdo do E-mail"
}
```

## Observações

- Lembre-se de configurar corretamente as credenciais da AWS antes de rodar a aplicação.
- O microserviço utiliza o **AWS SES** para envio de e-mails, portanto, verifique se sua conta da AWS está configurada adequadamente.
