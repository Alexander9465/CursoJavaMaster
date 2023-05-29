
# Projecto  Vehiculo 
***Version 2.0***

## Descripcion
El proyecto trata de una simulacion de las acciones y diferentes acciones que puede tener un vehiculo, en este caso la aplicacion esta hecha para la demostracion de las funcionalidad que puede tener un coche y un camio.
En la aplicacion se mostrara un menu donde el usuario podra seleccionar en entre *coche* y *camion*, una vez elegido el objeto el usuario podra realizar las acciones de cada vehiculo mediante unas opciones que se le mostrara en pantalla, e introduciendo los valores que el quiera para la realizacion de las pruebas 

## Funcioanlidades 
- [Requisitos previos](#Requisitos)
- [Uso](#Uso)
- [Mejoras](#Mejoras)



## Requisitos previos <a id="Requisitos"></a>
Se necesita un id que soporte java como puede ser Neatbeans, Eclipse o IntelliJ

## Uso<a id="Uso"></a>
Para el uso de nuestra aplicacion tenemos que tener en consideracion dos cosas la primera es que siempre empezaremos con el coche o camion arrancado ya que queremos realizar las acciones de cada vehiculo, si el coche esta parado y lo queremos mover tomara la accion de enceder automaticamente, todo esto porque estamos viendo sus funcionalidades.La segunda cosideracion es el tiempo que tomaremos 1 s con cada accion que realiza el coche como enceder, avanzar ,retrocer o parar 
Tenemos dos menus en nuestra aplicacion segun para al objeto que queramos realizar sus acciones como:

**Coche:**
Dentro de coche podemos realizar distintas acciones como:
1. Avanza: el coche avanzara los metros que desee el usuario
2. Retroceder: el coche retrocedera los metros que desee el usuario
3. Parar: el coche parar y mostrara el teimpo y espacio recorrido

**Camion:**
Dentro de camion podemos realizar distintas acciones como:
1. Avanza: el camion avanzara los metros que desee el usuario
2. Retroceder: el camion retrocedera los metros que desee el usuario
3. Parar: el camion parar y mostrara el teimpo y espacio recorrido
4. Mostrar tacometro: en el mostrara las velocidades que el camion haya realizado en su trayecto desde que enciende y apaga el motor 

## Mejoras<a id="Mejoras"></a>

Las mejoras añadidas con respecto a la primera version, son el tratamiento de las posibles excepciones que nos podemos encontrar al pedir al usuario valores por teclado, como la introduccion de un caracter erroneo o no que este en la lista, o como la introduccion erronea o accidental de letras por numeros, haciendo que la aplicion muestre porque ha sido y pueda darle la oportunidad de corregir el fallo

