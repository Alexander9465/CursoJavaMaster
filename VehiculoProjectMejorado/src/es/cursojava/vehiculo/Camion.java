package es.cursojava.vehiculo;

import java.util.ArrayList;

import es.cursojava.interfaces.Conducible;

/**
 * Clase camion que hereda de Vehiculo e implementa los metodos de conducible
 * @author sinensia Alexander Paul Tupiza 
 *
 */
public class Camion  extends Vehiculo implements Conducible{

	private ArrayList <Integer> tacometro ; //almacena las velocidades de un camion 
	private int distaciatotal= 0;
	
	
	/**
	 * 
	 * @param matricula    matricula del camion 
 	 * @param color			color del camion
	 * @param numRuedas		numero de ruedas que esta vez puede ser diferente de 4, 6 y 8 ruedas
	 * @param tacometro		almacena una lista con las velocidad de un recorrido 
	 */
	
	public Camion(String matricula, String color, int numRuedas) {
		super(matricula, color, numRuedas);
		this.tacometro =  new ArrayList<Integer>();
	}
	
	/**
	 * metodo para almacenar las velocidades en un tacocmetro 
	 * @param metros metros que recorrio el vehiculo
	 * @param segundos segundo que recorrio el vehiculo
	 */
	
	public void almacenarVelocidades(double metros , double segundos) {
		//hago un castin a numero enteros porque la velocidad suele ser un numero entero 
		int res = (int) (metros/segundos) ; //calcular velocidad podria ser un metodo que podemos tenerla en la clase padre comun a todas las hijas pero en este caso solo nos piden 
		tacometro.add(res);
		
		
	}
	/**
	 * es un metodo de tipo void que lo que  hace es devolvernos la lista de velocidades del camion 
	 * 
	 */
	public void mostrarTacometro() {
		System.out.println("\nVelocidades del tacometro");
		System.out.println("========================");
		for(Integer v: tacometro) {
			System.out.println("La velocidad es : "+ v.toString()+" m/s");
		}
		System.out.println("\n");
	}
	
	//Arrancamos el camion y avanzamos mas uno el tiempo 

	@Override
	public void conducir() {
		System.out.println("Arrancamos el camion  ");
		super.incrementoTiempo();
		System.out.println("Tiene un recorrido de: "+ super.getEspacio() +" y un tiempo de: "+ super.getTiempo()+" segundos");
		
	}
	
	/**
	 * metodo avanzar donde metemos el valor de metros y lo guardamos como nuevo espacio recorrido 
	 * 
	 */

	@Override
	public void avanzar(double metros) {
		super.incrementoTiempo();
		distaciatotal+= metros;
		double res = metros + super.getEspacio();
		if(res >0) {
			super.setEspacio(res);
			System.out.println("El espacio recorrido es : " + res + " metros"+" y su tiempo de viaje es: " + super.getTiempo()+" segundos");
		}else {
			super.setEspacio(res);
			System.out.println("El espacio recorrido es : " + Math.abs(res) + " metros atras desde el punto original  y su tiempo de viaje es: " + super.getTiempo()+" segundos");
		}
	}


	@Override
	public void retroceder(double metros) {
		super.incrementoTiempo();
		distaciatotal+= metros;
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
	 * Para el vehiculo y mostramos el tiempo de viaje final 
	 * ademas ponemos el tiempo y el recorrido a cero para hacer un nuevo recorrido 
	 * En este punto almacenamos en un Arrraylist los recorridos que hacemos 
	 */

	@Override
	public void parar() {
		super.incrementoTiempo();
		almacenarVelocidades(distaciatotal, super.getTiempo());
		 
		
		System.out.println("El espacio recorrido total es : "+Math.abs(super.getEspacio())+ " metros y el tiempo final del viaje es: " + super.getTiempo()+" segundos");
		setTiempo();
		distaciatotal=0;
		
		
		
		
	}
	
	
	/**
	 * Añadimos el metodo toString añadiendo el nombre del vehiculo 
	 */
	@Override
	public String toString() {
		String res = "El camion "+super.toString();
		 return res;
		
	}

}
