<h2>Digital Innovation: Expert class - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Implantação do sistema na nuvem através do Heroku

```
http://localhost:8080/api/v1/people
```

Criando um usuário com JSON
```
{
    "personName": "PAULO CESAR",
    "personCpf": "11111111111",
    "addresses": [
            {
                "addressName": "Manuel Alvarenga",
                "addressNumber": 100,
                "addressComplement": "CASA",
                "addressType": "HOME",
                "district": {
                    "districtName": "Colina"
                },
                "city": {
                    "cityName": "Alfenas"
                }
            }
        ]
}
```

 * segue o link do Heroku [Projeto] (https://create-crud-people.herokuapp.com/api/v1/people/)

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:

* Java 8 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Spring Tools 4 for Eclipse ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem

Abaixo, seguem links bem bacanas, sobre tópicos:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Spring Tools 4 for Eclipse, para download](https://spring.io/tools)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

