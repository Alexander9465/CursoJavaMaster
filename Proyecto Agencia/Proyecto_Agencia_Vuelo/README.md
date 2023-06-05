
# SERVICIO VUELO

## Descripcion 
Este servicio de hotel proporciona una API para acceder a una tabla de Vuelo.
La tabla contiene los siguientes campos:
  
    idVuelo (autonumérico)
    compañia 
    fechaVuelo
    precio 
    Plazasdisponible .
A continuación se describen los recursos disponibles y cómo utilizarlos.

## Funciones
### Lista de vuelos disponibles 
Retorna la lista de Vuelos que están disponibles
y se deberán devolver los datos de los vuelos que tengan plazas suficientes para dicho valor 

    Método: GET
    Ruta: http://localhost:9090/vuelo/:valor
    Parámetros de ruta:
        :valor (numerico): Cantidad de plazas que necesita tu veulo 
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Lista de hoteles disponibles en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)
       
### Modificacion de un vuelo 
Un recurso que al recibir una petición put actualiza los datos del uelo indicado

    Método: Put
    Ruta:http://localhost:9090/vuelo/:id/:plazas
    Parámetros de ruta:
        :id(numerico): Id del vuelo que vamos a cambiar
        :plazas(numerico ) cantidad de plazas con las que vamos a cambiar 
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Datos del hotel en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)       
