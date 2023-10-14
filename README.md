<p align='center'><img width='300' src="./.github/logo.svg"/></p>
<h1 align='center'>App ToDo - Java + Spring</h1>
<p align='center'>
<img src="https://img.shields.io/github/repo-size/rafaasimi/todolist-springboot-rocketseat?color=77BC1F">
<img src="https://img.shields.io/github/languages/count/rafaasimi/todolist-springboot-rocketseat?color=77BC1F">
<img src="https://img.shields.io/github/last-commit/rafaasimi/todolist-springboot-rocketseat?color=77BC1F">
</p>

## 🔖 Descrição
<p>📝 Criação de uma TodoList utilizando Java/SpringBoot na semana de Java da Rocketseat.

## 🚀 Tecnologias
Esse projeto está utilizando as seguintes tecnologias:
- Java
- [SpringBoot](https://spring.io/)
- [Maven](https://maven.apache.org/)

## 🎲 Como utilizar
```bash
# Clone esse repositório
$ git clone https://github.com/rafaasimi/todolist-springboot-rocketseat.git

# Navegue até o repositório
$ cd todolist-springboot-rocketseat

# Instale as dependências
$ mvn clean install
```

## ⚙️ Rotas

### Criação de usuário
Endpoint
```bash
http://localhost:8080/users/
```

Body JSON

```json
{
    "name": "Rafael Simionato",
    "username": "rafaasimi",
    "password": "123456"
}
```

### Criação de tarefa
Endpoint
```bash
http://localhost:8080/tasks/
```

Authorization
```bash
username: {usuário}
password: {senha}
```

Body JSON

```json
{
    "title": "Ir ao supermercado",
    "description": "Comprar refrigerante, leite e frutas.",
    "priority": "ALTA",
    "startAt": "2023-10-15T08:50",
    "endAt": "2023-10-16T15:35"
}
```

### Listar tarefas do usuário
Endpoint
```bash
http://localhost:8080/tasks/{ID_DA_TAREFA}
```

Authorization
```bash
username: {usuário criado}
password: {senha criada}
```

### Atualizar tarefa
Endpoint
```bash
http://localhost:8080/tasks/{ID_DA_TAREFA}
```

Authorization
```bash
username: {usuário criado}
password: {senha criada}
```

Body JSON

```json
{
    "title": "Ir ao supermercado - Alterado",
    "description": "Comprar refrigerante, leite e frutas. - Alteradp"
}
```


---
<p>Criado com 💙 por <a href='https://github.com/rafaasimi/' target='_blank'>Rafael Simionato</a></p>