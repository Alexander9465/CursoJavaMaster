package es.cursojava.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza
 * En esta clase es dodnde trato las posibles excepciones como el tratmiento del nombre entre nombre y camion
 * y la excepcion de no poner un numero 
 *
 */
public class TratamientoExcepciones {
	
	/**
	 * Metodo que nos devolvera un nombre valido 
	 * 
	 * @param n sera el nombre que reciba inicialmente el programa 
	 * @return regresara un String nombre que sera valido para la continuacion del progrma
	 */
	public  static String comprobarNombre( String n) {
		
		try {
			//comparamos si el nombre es o coche o camion si lo es retornara n
			if(n.equals("coche")||n.equals("camion")) {
				System.out.println("Ha elegido "+ n);
				return n;
			}else {
				//en caso de que no lo sea saltara la excepcion 
				throw new Exception("Debe ingresar exactamente dos nombres.");
			}
		
		}catch (Exception e){
			//una vez salte la excepcion daremos al usuario la posibilidad de volver a escribirlo bien 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hubo un problema, Tiene que escribir o coche o camion");
			String ve = scanner.next();
			//una vez haya cambiado el nombre haremos una llamada recursiva para comprobarlo de nuevo 
			// en caso de que sea erroneo pasara lo anterior y en caso de que no devolvera el nombre valido 
			return comprobarNombre(ve);
		}


}
	
	/**
	 * 
	 * Metodo que nos comprobara si el numero introducido es un numero 
	 * 
	 * @return nos devolvera un int 
	 */

public static  int ingresarNumero() {
    Scanner scanner = new Scanner(System.in);

    try {
       //si el numero introducido es un numero de tipo int nos devolvera el numero 
        int numero = scanner.nextInt();
        return numero ;
        
    } catch (InputMismatchException e) {
    	//en caso contrario  hara una llamada recursiva para poder ingresar un numero correctamente 
        System.out.println("Solo se permiten números.");
         return ingresarNumero(); // Llamada recursiva
    }
}
}
