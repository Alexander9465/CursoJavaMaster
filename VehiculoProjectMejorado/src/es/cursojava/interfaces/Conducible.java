package es.cursojava.interfaces;

/**
 * 
 * La interfaz que se puede implementar a un coche,barco...
 * @author sinensia Alexander Paul Tupiza Tupiza 
 *
 */
public interface Conducible {
	
	/**
	 * nos permite conducir el vehiculo 
	 */
	public void conducir() ;
	/**
	 * hace que  avance  el vehiculo 
	 */
	public void avanzar(double metros);
	/**
	 * hace que  retroceda  el vehiculo
	 */
	public void retroceder(double metros );
	/**
	 * hace que pare el vehiculo
	 */
	public void parar();

}
