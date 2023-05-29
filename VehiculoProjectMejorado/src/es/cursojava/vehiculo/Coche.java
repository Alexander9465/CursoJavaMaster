package es.cursojava.vehiculo;

import es.cursojava.interfaces.Conducible;

/**
 * La clase coche que es hija de vehiculo y que implementa la interfaz conducible 
 * @author  Alexander Paul Tupiza Tupiza 
 *
 */
public class Coche extends Vehiculo  implements Conducible{

	/**
	 * 
	 * @param matricula matricula del coche 
	 * @param color color del coche 
	 * El numero de ruedas lo protegemos directamente porque los coches siempre tienen 4 ruedas 
	 */
	public Coche(String matricula, String color) {
		super(matricula, color, 4);
		
	}
	/**
	 * Añadimos el metodo toString añadiendo el nombre del vehiculo 
	 */
	@Override
	public String toString() {
		String res = "El coche "+super.toString();
		 return res;
		
	}
	/**
	 * es un metodo en donde arrancamos y el tiempo se incrementa en 1 por cada metodo 
	 */
	@Override
	public void conducir() {
		System.out.println("Arrancamos el coche  ");
		super.incrementoTiempo();
		System.out.println("Tiene un recorrido de: "+ super.getEspacio() +" y un tiempo de: "+ super.getTiempo()+" segundos");
		
	}
	/**
	 * metodo donde avanzamos con el coche 
	 * @param metros que queremos recorrer
	 * incrementamos el tiempo 
	 * e introducimos el nuevo recorrido
	 * en una condicionale metemos si el coche avanza respecto al punto de origen, si se aleja mas o acerca mas 
	 * 
	 */
	@Override
	public void avanzar(double metros ) {
		super.incrementoTiempo();
		double res = metros + super.getEspacio();
		if(res >0) {
			super.setEspacio(res);
			System.out.println("El espacio recorrido es : " + res + " metros"+" y su tiempo de viaje es: " + super.getTiempo()+" segundos");
		}else {
			super.setEspacio(res);
			System.out.println("El espacio recorrido es : " + Math.abs(res) + " metros atras desde el punto original  y su tiempo de viaje es: " + super.getTiempo()+" segundos");
		}
	}
	/**
	 *	Metodo para avanzar el coche
	 *	@param metros que queremos recorrer
	 *	Metodo donde hacemos que el coche retroceda desde su posicion actual acercandose o alejandose del punto de origen 
	 */
	@Override
	public void retroceder(double metros) {
		super.incrementoTiempo();
		double res =super.getEspacio()- metros;
		if(res <0) {
			super.setEspacio(res);
			System.out.println("El espacio recorrido es : " + Math.abs(res) + " metros hacia atras  y su tiempo de viaje es:" + super.getTiempo()+" segundos");
		}else {
		super.setEspacio(res);
		System.out.println("El espacio recorrido es : " + res + " metros"+" y su tiempo de viaje es:" + super.getTiempo()+" segundos");
		}
	}
	/**
	 * Metodo donde paramos el coche y reestablecemos el tiempo inicial a cero y mostramos su recorrido y su teimpo total 
	 */

	@Override
	public void parar() {
		super.incrementoTiempo();
	
		System.out.println("El espacio recorrido total es : "+super.getEspacio()+ " metros y el tiempo final del viaje es: " + super.getTiempo()+" segundos");
		setTiempo();
		
	}
	
	

}
