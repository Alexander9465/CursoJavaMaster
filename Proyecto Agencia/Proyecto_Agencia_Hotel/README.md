
# SERVICIO HOTEL

## Descripcion 
Este servicio de hotel proporciona una API para acceder a una tabla de hoteles.
La tabla contiene los siguientes campos:
  
    idHotel (autonumérico)
    nombre :nombre del hotel
    categoria :categoria del hotel
    precio :precio del hotel 
    disponible (si o no) :  disponibilidad del hotel 
A continuación se describen los recursos disponibles y cómo utilizarlos.

## Funciones
### Lista de hoteles disponibles 
Retorna la lista de hoteles que están disponibles.

    Método: GET
    Ruta: http://localhost:8080/hotel
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Lista de hoteles disponibles en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)
       
### Datos de un hotel a partir de su nombre 
Obtiene los datos de un hotel a partir de su nombre.

    Método: GET
    Ruta: http://localhost:8080/hotel/:nombre
    Parámetros de ruta:
        :nombre (cadena): Nombre del hotel que se desea obtener
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Datos del hotel en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)       
