package es.cursojava.vehiculo;

import es.cursojava.interfaces.Conducible;

/**
 * 
 * @author sinensia Alexander Paul Tupiza Tupiza 
 *	Esta es la clase abstracta vehiculo ya que un vehiculo puede ser un coche un barco o un camion
 */
public abstract class  Vehiculo implements Conducible{
	
	private String matricula;		//matricula que tiene cualquier vehiculo
	protected String color ;		//color que tiene un vehiculo
	protected int numRuedas;		//numero de ruedas que puede o no puede tener un vehiculo 
	private double velocidad;		//velocidad que tiene el vehiculo
	private double tiempoDeViaje;			//teimpo de viaje 
	private double espacioRecorrido;			//espacio recorrido con el vehiculo 
	
	
	
	

	/**
	 * @param matricula matricula del vehiculo
	 * @param color  color del vehiculo 
	 * @param numRuedas	ruedas que tiene el vehiculo   
	 * 
	 * Los parametros velocidad,tiempo y espacio estan a cero porque no se ha movido a menos 
	 * que se utilice el metodo avanzar o retroceder 
	 */
	public Vehiculo(String matricula, String color, int numRuedas) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numRuedas = numRuedas;
		this.velocidad = 0;
		this.tiempoDeViaje =0;
		this.espacioRecorrido = 0;
	}

	/**
	 * Metodo que nos devuelve la velocidad que tiene el coche 
	 * @return un double que sera la velocidad en metros por casa segundo
	 */

	public double getVelocidad() {
		return velocidad;
	}
	/**
	 * Metodo get 
	 * @return nos devuelve un double que seria el tiempo de viaje 
	 */
	public double getTiempo() {
		return tiempoDeViaje;
	}
	/**
	 * metodo que nos devuelve el tiempo de viaje,
	 * a intepretacion del eneunciado ya que un un coche puede tardar en recorrer x metros en y segundos
	 * e interpretado con un incrementador que el timpo ira creciendo cada vez que se arranque, avance
	 * retroceda y pare en un 1
	 * @return un double que sera el tiempo en segundos
	 */


	public double incrementoTiempo() {
		tiempoDeViaje++;
		return tiempoDeViaje;
	}
	/**
	 * el tiempo lo ponemos a cero de nuevo cuando paramos el coche 
	 */
	public void setTiempo() {
		tiempoDeViaje = 0;
	}

	/**
	 * Metodo que nos devuelve el espacio recorrido del coche 
	 * @return nos devuelve un double que seran metro
	 */


	public double getEspacio() {
		return espacioRecorrido;
	}
	/**
	 * Ponemos de nuevo a 0 el espacio recorrido
	 *@param espacio espacio recorrido 
	 */
	public void setEspacio(double espacio) {
		this.espacioRecorrido =espacio;
	}
	
	/**
	 * Creamos el metodo setColor porque si queremos cambiar el color del coche 
	 * @param nuevo color
	 */
	public void setColor(String nuevo) {
		this.color = nuevo;
	}


	/**
	 * metodo para vizualizar la matricula del coche, color y numero de ruedas 
	 */
	@Override
	public String toString() {
		return " tiene una  matricula= " + matricula + ", un color= " + color + " y tiene = " + numRuedas + " ruedas" ;
	}
	
	
	
	
	

	
	
}
