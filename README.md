#  :clipboard: To-Do-List

* <p text-align="justify">A presente aplicação consiste em uma API Rest desenvolvida na lingaguem java com a a utilização da ferramenta Spring Boot para representação de uma To Do List.
* As funcionalidades da aplicação consistem em CRUD(Create, Read, Update e Delete).<br>
* A aplicação quando em execução utiliza a porta 8080 e pode ser acessada via URL: http://localhost:8080<br>
* A aplicação utiliza o banco de dados em memória H2 e pode ser acessado utilizando a URI: http://localhost:8080/h2-console com usuário e senha disponíveis no arquivo properties</p>


Para executar a aplicação recomenda-se a utilização da IDE <a href="https://www.eclipse.org/downloads/">Eclipse</a> (preferencialmente), ou como alternativa a IDE <a href="https://spring.io/tools">Spring Tool</a>

__Após download e instalação seguir os seguintes passos:__

	1 - Clicar na aba File
	2 - Clicar em Import
	3 - Selecionar Existing Maven Projects
	4 - Clicar em next
	5 - Clicar em Browse
	6 - Escolher o caminho da pasta que contém o arquivo pom.xml do projeto
	7 - Clicar em Finish
	8 - Clicar com o botão direito no nome do projeto na coluna a esquerda
	9 - Selecionar a opção Maven
	10 - Clicar em Update Project
	11 - Selecionar as caixas inferiores:
		- Update dependencies
		- Force Update Snapshots/Releases
		- Update project configuration from pom.xml
		- Refresh workspace resources from local filesystem
		- Clean projects
	12 - Clicar em OK
	13 - Clicar com o botão direito no arquivo ToDoListApplication.java que se ecncontra no pacote com.nxxxlxs.ToDoList na pasta src/main/java
	14 - Selecionar a opção Run As
	15 - Clicar na opção Java Application

Maiores informações e solução de possíveis dúvidas acessar: <a href="https://medium.com/@alex.girao/importar-um-projeto-maven-spring-boot-ea10078b2bde">Como importar um projeto Maven Spring Boot</a>

__Para execução via terminal:__

É necessário a instalação do maven e configura-lo nas variáveis de ambiente
  
	1 - Entre na pasta contendo o arquivo pom.xml e execute um dos comando:
   
		mvn package

		ou

		mvn install

		ou

		mvn clean install

	2 - Execute agora o seguinte comando:

		mvn spring-boot:run


Para utilização dos métodos implementados utlizar as seguintes URI em algum gerenciador de requisições (recomenda-se o Postman ou Insomnia):

__Salvar uma tarefa__

	- Tipo do método: POST
	- URI: http://localhost:8080/todo
	- Corpo da requisição (tipo JSON):
		{
			"descricao": "",
			"completa": ,
			"prazo":
		}

	- Tipos dos atributos:
		descricao: String
		completa: boolean
		prazo: String no formato: YYYY-MM-DD

__Encontrar todas as tarefas__

	- Tipo do método: GET
	- URI: http://localhost:8080/todo

__Encontrar tarefa em específico__

	- Tipo do método: GET
	- URI: http://localhost:8080/todo/id
	- Onde o id é o identificador da tarefa

__Atualizar uma tarefa__

	- Tipo do método: PUT
	- URI: http://localhost:8080/todo/id
	- Onde o id é o identificador da tarefa
	- Corpo da requisição (tipo JSON):
		{
			"descricao": "",
			"completa": ,
			"prazo":
		}

	- Tipos dos atributos:
		descricao: String
		completa: boolean
		prazo: String no formato: YYYY-MM-DD

__Remover uma tarefa__

	- Tipo do método: DELETE
	- URI: http://localhost:8080/todo/id
	- Onde o id é o identificador da tarefa

