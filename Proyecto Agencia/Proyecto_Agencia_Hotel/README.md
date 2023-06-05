
# SERVICIO HOTEL

## Descripcion 
Este servicio de hotel proporciona una API para acceder a una tabla de hoteles.
La tabla contiene los siguientes campos:
  
    idHotel (autonumérico)
    nombre 
    categoria
    precio 
    disponible (si o no).
A continuación se describen los recursos disponibles y cómo utilizarlos.

## Funciones
### Lista de hoteles disponibles 
Retorna la lista de hoteles que están disponibles.

    Método: GET
    Ruta: /hotel
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Lista de hoteles disponibles en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)
       
### Datos de un hotel a partir de su nombre 
Obtiene los datos de un hotel a partir de su nombre.

    Método: GET
    Ruta: /hotel/:nombre
    Parámetros de ruta:
        :nombre (cadena): Nombre del hotel que se desea obtener
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Datos del hotel en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)       