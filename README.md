# SpringBootJJOO
-------------------------------------------------------------------------------
-- COMPILACION Y DESPLIEGUE
-------------------------------------------------------------------------------
Para compilar desde eclipse hacemos click derecho sobre el proyecto y vamos a:
Run as --> Maven build...

En Goal le ponemos el literal 'package' y pulsamos en el botón 'Run que compila, 
testea (si existen test cases en src/test y no ponemos el flag de skip tests) y 
empaqueta el proyecto en el formato definido en el pom (ear, war, jar)
Por defecto el ejecutable se guardará en nuestro proyecto, en la carpeta target.

Para ejecutarlo, accedemos desde la terminal al fichero y ejecutaríamos 
(suponiendo que hayamos generado un jar, por ejemplo) :
java -jar <nombre del fichero>.jar


-------------------------------------------------------------------------------
-- ESTRUCTURA DEL PROYECTO
-------------------------------------------------------------------------------
El proyecto está estructurado en las siguientes capas:
* Main class --> con @SpringBootApplication inicializa el Servlet dispatcher, 
				el contenedor, el Spring context y analiza los repositorios y
				entities con diferentes anotaciones (@EntityScan, @ComponentScan, 
				@EnableJpaRepositories)
* Controller --> procesa las resquest del front que pasan los filtros del servlet
				dispatcher. El controlador delega la funcionalidad en la capa de
				servicios. En este caso los controladores son RestController
* Services	--> funcionan como una abstracción a la capa de persistencia.
* Repository --> contiene el CRUD básico a cada tabla usando las entities definidas 
* Entity 	--> definición de la tabla de BBDD usada por spring data con hibernate/jpa

-------------------------------------------------------------------------------
-- Requisitos
-------------------------------------------------------------------------------
Las tecnologías necesarias son:
 - MySQL
 - Java 1.8
 - Junit
 - Maven
 - Spring Boot
 - Spring Data JPA
