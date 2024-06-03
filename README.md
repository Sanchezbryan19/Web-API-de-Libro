# Deber

Esta tarea consiste en una aplicación de Spring Boot para gestionar libros en una universidad. La aplicación consta de varias partes:

1.	Controllers (LibroController):
   
Define un controlador REST que expone endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los libros. Los métodos del controlador reciben solicitudes HTTP y llaman a los métodos correspondientes del servicio.

2.	Models (Libro):
   
Define la estructura de datos de un libro, incluyendo propiedades como id, título, autor, editorial y año de publicación.

3.	Repository (LibroRepository y LibroRepositoryImpl):
   
Define una interfaz (LibroRepository) que proporciona métodos para interactuar con los libros, como obtener un libro por su id, obtener todos los libros y agregar un nuevo libro. La implementación concreta (LibroRepositoryImpl) proporciona la lógica para estos métodos, utilizando una lista de libros en memoria como fuente de datos.

4.	Service (LibroService y LibroServiceImpl):
   
Define una interfaz (LibroService) que especifica los métodos para manipular los libros. La implementación concreta (LibroServiceImpl) proporciona la lógica para estos métodos, delegando las operaciones al repositorio.

5.	Clase principal (DemoApplication):
    
Punto de entrada de la aplicación Spring Boot.

![varias partes](https://github.com/Sanchezbryan19/Web-API-de-Libro/assets/148237561/e39820bd-20a7-428a-a3df-2be195126835)

# Comprobación 

# Obtener todos los libros (GET /libros)

En esta solicitud devuelve todos los libros disponibles en la biblioteca.

![GET-libros](https://github.com/Sanchezbryan19/Web-API-de-Libro/assets/148237561/ed1422ed-111a-41d0-8035-9af33b02288d)

# Obtener un libro por su ID (GET /libros/{id})

Por medio de esta solicitud devuelve un libro específico según su ID.

![libro por su ID ](https://github.com/Sanchezbryan19/Web-API-de-Libro/assets/148237561/d059f89c-ec66-4873-982a-93a305a87077)

# Agregar un nuevo libro (POST /libros/ agregarlibros)

Esta solicitud agrega un nuevo libro a la biblioteca.

![agregarlibros](https://github.com/Sanchezbryan19/Web-API-de-Libro/assets/148237561/3c03b87a-b93f-420d-a05e-e213ecd73249)

Y para confirmar que se allá creado hacemos un GET consultando la id que creamos:

![GET- id que creamos](https://github.com/Sanchezbryan19/Web-API-de-Libro/assets/148237561/5ae8e42f-d4cc-4f85-abb7-445860706913)

