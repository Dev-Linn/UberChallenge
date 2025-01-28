# Email Microservice  
## Uber Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)  
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)  
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é uma API construída com **Java, Java Spring e AWS Simple Email Service**. 🚀

O Microserviço foi desenvolvido para demonstrar como resolver o [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Table of Contents

- [Installation](#installation) 🛠️
- [Configuration](#configuration) ⚙️
- [Usage](#usage) 📚
- [API Endpoints](#api-endpoints) 🌐
- [Database](#database) 🗄️

## Installation 🛠️

1. Clone o repositório:

```bash
git clone https://github.com/Dev-Linn/UberChallenge.git
```

2. Instale as dependências com o Maven

3. Crie o arquivo `application.properties` na raiz do projeto com suas credenciais da AWS:

```properties
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```

## Usage 📚

1. Inicie a aplicação com o Maven
2. A API estará disponível em http://localhost:8080

## API Endpoints 🌐  
A API fornece os seguintes endpoints:

**POST EMAIL**  
```markdown
POST /api/email/send - Envia um e-mail do seu remetente para o destino
```

**BODY**  
```json
{
  "to": "exemplo@dominio.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do E-mail"
}
```
