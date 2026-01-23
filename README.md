# 👥 Cadastro de Usuários API

Este é um projeto de API REST desenvolvido para gerenciamento de usuários. Foi criado com o objetivo de praticar os conceitos fundamentais de desenvolvimento web com Java e Spring Boot, implementando um CRUD (Create, Read, Update, Delete) completo.

## 🚀 Tecnologias Utilizadas

* **Java 17** (Linguagem principal)
* **Spring Boot** (Framework para facilitar a configuração e execução)
* **Spring Data JPA** (Para persistência de dados e repositórios)
* **H2 Database** (Banco de dados em memória para testes rápidos)
* **Lombok** (Para redução de código boilerplate como Getters/Setters)
* **Maven** (Gerenciamento de dependências)

## 🛠️ Funcionalidades

A API permite realizar as seguintes operações:

* **Criar Usuário:** Cadastra um novo usuário com nome e email.
* **Buscar Usuário:** Localiza um usuário específico através do email.
* **Atualizar Usuário:** Atualiza os dados de um usuário existente pelo ID.
* **Deletar Usuário:** Remove um usuário do banco de dados através do email.

## ⚙️ Como Executar

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven instalado (ou usar o wrapper `mvnw` incluso no projeto).

### Passo a passo
1.  Clone o repositório:
    ```bash
    git clone [https://github.com/seu-usuario/cadastro-usuario.git](https://github.com/seu-usuario/cadastro-usuario.git)
    ```
2.  Acesse a pasta do projeto:
    ```bash
    cd cadastro-usuario
    ```
3.  Execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A API estará rodando em: `http://localhost:8080`

## 🔌 Endpoints da API

Aqui estão as rotas disponíveis para teste (via Postman ou Insomnia).

**Nota:** Os endpoints utilizam *Query Parameters* (ex: `?email=...`) em vez de *Path Variables*.

| Método | Endpoint | Parâmetros (Query) | Body (JSON) | Descrição |
| :--- | :--- | :--- | :--- | :--- |
| `POST` | `/usuario` | - | Sim | Cria um novo usuário. |
| `GET` | `/usuario` | `?email=exemplo@email.com` | Não | Busca um usuário por email. |
| `PUT` | `/usuario` | `?id=1` | Sim | Atualiza os dados do usuário com o ID informado. |
| `DELETE` | `/usuario` | `?email=exemplo@email.com` | Não | Remove um usuário por email. |

### Exemplo de JSON (Body para POST/PUT)
```json
{
  "nome": "Seu Nome",
  "email": "seu.email@exemplo.com"
}
