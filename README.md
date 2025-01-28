# Microserviço de E-mail  
## Desafio Backend da Uber

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)  
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)  

Este repositório contém uma API robusta construída com **Java, Spring Boot** e **AWS Simple Email Service (SES)**. 🚀

O microserviço foi desenvolvido para resolver o [Desafio Backend da Uber](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md), que tem como objetivo testar habilidades em design de sistemas e na implementação de soluções escaláveis.

## Sumário

- [Introdução](#introdução) 📌
- [Instalação](#instalação) 🛠️
- [Configuração](#configuração) ⚙️
- [Uso](#uso) 📚
- [Endpoints da API](#endpoints-da-api) 🌐
- [Banco de Dados](#banco-de-dados) 🗄️
- [Testes](#testes) 🧪
- [Contribuição](#contribuição) 🤝

## Introdução 📌

Este microserviço permite o envio de e-mails através da AWS SES, utilizando uma arquitetura baseada em microserviços para fornecer escalabilidade, facilidade de manutenção e integração com outras partes de um sistema de backend.

## Instalação 🛠️

1. Clone o repositório:

```bash
git clone https://github.com/Dev-Linn/UberChallenge.git
```

2. Navegue até o diretório do projeto:

```bash
cd UberChallenge
```

3. Instale as dependências com o Maven:

```bash
mvn install
```

4. Crie um arquivo `application.properties` na raiz do projeto com suas credenciais da AWS:

```properties
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```

## Configuração ⚙️

A configuração do serviço depende do **AWS SES**, que exige configurações específicas para validar sua conta e endereço de e-mail. Siga as etapas para configurar a AWS SES:

1. Crie uma conta AWS e habilite o SES.
2. Verifique o endereço de e-mail que deseja usar como remetente.
3. Configure as credenciais de acesso (Access Key ID e Secret Key) na AWS e insira no arquivo `application.properties`.

## Uso 📚

Após configurar o ambiente, inicie a aplicação com o Maven:

```bash
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

## Endpoints da API 🌐  

### Enviar E-mail

**POST /api/email/send**  
Envia um e-mail do remetente para o destinatário.

**BODY**  
```json
{
  "to": "exemplo@dominio.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do E-mail"
}
```

**Exemplo de resposta**:
```json
{
  "status": "success",
  "message": "Email enviado com sucesso!"
}
```

## Banco de Dados 🗄️

Para este projeto, não foi utilizado banco de dados, já que a aplicação é focada em enviar e-mails. No entanto, você pode integrar um banco de dados para armazenar os e-mails enviados, histórico de logs, etc. Isso pode ser feito com um simples banco de dados relacional (como MySQL ou PostgreSQL) ou até mesmo com uma solução NoSQL.


## Contribuição 🤝

1. Faça o **fork** deste repositório.
2. Crie uma **branch** para a sua feature (`git checkout -b feature/nova-feature`).
3. Faça o **commit** das suas alterações (`git commit -m 'Adicionando nova feature'`).
4. **Push** para a branch (`git push origin feature/nova-feature`).
5. Crie um **pull request**.
