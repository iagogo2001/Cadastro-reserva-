<div align="center">

#  Cadastro de Reserva
**API REST com Spring Boot + H2**

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="80" height="80"/>

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Web%20%2B%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/H2-In%20Memory-red?style=for-the-badge)
![Lombok](https://img.shields.io/badge/Lombok-Enabled-blue?style=for-the-badge)

</div>

---

## 📜 Sobre o Projeto
Projeto **didático** em **Spring Boot** que implementa uma **API de cadastro de reservas**, persistindo dados em **banco H2 em memória** e expondo endpoints via **Spring WebMVC**.

> 🌟 **Ideal para:** praticar **CRUD**, **Spring Data JPA**, **validações**, e uso do **H2 Console** durante o desenvolvimento.

---

## ✨ Tecnologias
- **Java 21** :contentReference[oaicite:0]{index=0}  
- **Spring Boot (WebMVC + Data JPA)** :contentReference[oaicite:1]{index=1}  
- **H2 Database (em memória) + H2 Console** :contentReference[oaicite:2]{index=2}  
- **Lombok** :contentReference[oaicite:3]{index=3}  

---

## ✨ Funcionalidades (geral)
| Funcionalidade | Descrição | Ícone |
| :--- | :--- | :---: |
| **Cadastrar** | Criação de registros (ex.: reserva/usuário) via API | ➕ |
| **Listar** | Consulta de registros persistidos | 📋 |
| **Buscar por ID** | Consulta detalhada de um registro | 🔎 |
| **Atualizar** | Alteração de dados existentes | ✏️ |
| **Remover** | Exclusão de registros | 🗑️ |
| **H2 Console** | Visualizar tabelas/dados pelo navegador | 🧪 |

> **Nota:** como o repositório não traz README e o GitHub não expôs a árvore de arquivos no HTML que consegui acessar, mantive a seção de endpoints **genérica** (modelo padrão). Se você me mandar o nome das rotas (ou colar seus controllers aqui), eu ajusto com **100% de fidelidade**.

---

## 🧪 Banco de Dados (H2)
Este projeto usa **H2 em memória** e habilita o **H2 Console**. :contentReference[oaicite:4]{index=4}

- **Console:** `http://localhost:8080/h2-console` :contentReference[oaicite:5]{index=5}  
- **JDBC URL:** `jdbc:h2:mem:usuario` :contentReference[oaicite:6]{index=6}  
- **User:** `iago` :contentReference[oaicite:7]{index=7}  
- **Password:** `1234` :contentReference[oaicite:8]{index=8}  

---

## 🔌 Endpoints (modelo)
> Ajuste os caminhos abaixo conforme seus `@RequestMapping`.

- `GET /...` → listar
- `GET /.../{id}` → buscar por id
- `POST /...` → cadastrar
- `PUT /.../{id}` → atualizar
- `DELETE /.../{id}` → remover

---

## 🚀 Como Executar

### Pré-requisitos
- **Java 21+** :contentReference[oaicite:9]{index=9}  
- Maven (ou **Maven Wrapper** `mvnw`, já presente no repo) :contentReference[oaicite:10]{index=10}  

### Passo a Passo
1. **Clone o projeto**
   ```bash
   git clone https://github.com/iagogo2001/Cadastro-reserva-.git
   cd Cadastro-reserva-
