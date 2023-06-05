
# SERVICIO RESERVA

## Descripcion 
Este servicio de reservas interactúa con los servicios de hotel y vuelos para gestionar reservas de viajes
  
    idReserva  (autonumérico)
    nombreCliente
    dni
    idVuelo
   idHotel
A continuación se describen los recursos disponibles y cómo utilizarlos.

## Funciones
### Reserva
 Metod que da de alta una reserva actulizando las plazas dispobibles de un vuelo

    Método: POST 
    Ruta: http://localhost:8088/reserva
    
    Parámetros de la solicitud: Objeto JSON en el cuerpo de la petición con los siguientes campos:

        idVuelo (número): Identificador del vuelo
        idHotel (número): Identificador del hotel
        nombre (cadena): Nombre del cliente
        dni (cadena): DNI del cliente
        totalPersonas (número): Total de personas que forman la reserva
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Lista de hoteles disponibles en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)
       
### Reservas que tiene un hotel 
 Muestra una lista de reservas que tiene un hotel 

    Método: GET
    Ruta: http://localhost:8088/reserva/:nombreHotel
    Parámetros de ruta:
        :nombreHotel(cadena): Nombre del hotel que se desea obtener la lista de reservas que tiene 
    
    Respuesta exitosa:
        Código de estado: 200 (OK)
        Contenido: Datos del hotel en formato JSON
   Respuesta no exitosa:
   
        Codigo de estado: 404 (Metodo no permitido)
        Codigo de estado: 500 (Error inesperado)       
