package es.cursojava.vehiculomain;

import java.util.InputMismatchException;
import java.util.Scanner;

import es.cursojava.excepciones.TratamientoExcepciones;
import es.cursojava.vehiculo.Camion;
import es.cursojava.vehiculo.Coche;
/**
 * 
 * @author sinensia Alexander paul Tupiza Tupiza
 *
 */
public class VehiculoMain {
	

	/**
	 * Menu del camion  donde podremos acceder a todas las funcionalidades del camion 
	 * @param res boleano de si se ha creado o no el camion
	 * @param ca objeto camion
	 * @param scanner objeto scanner
	 */
	public static void menu2(boolean res, Camion ca,Scanner scanner ) {
		int opcion;
		do {
			System.out.println("=== MENÚ ===");

			System.out.println("1. Avanzar");
			System.out.println("2. Parar ");
			System.out.println("3. Mostrar tacometro ");
			System.out.println("4. Retroceder ");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {

			case 1://si res es falso significa que el camion esta apagado y el espacio lo recorrido lo pondra de nuevo a ceo 
					// y lo volvera a encender
				if (res == false) {
					ca.setEspacio(0);
					ca.conducir();
					res = true;
				}
				//si el camion esta encendido avanzara 
				System.out.println("indica la cantidad que quieres recorrer");
				int can = TratamientoExcepciones.ingresarNumero();
				ca.avanzar(can);
				break;
			case 2:
				//si res es falso significa que el camion estaba parado y apagarse si ya esta apagado  
				if (res == false) {
					System.out.println("El coche esta apagado, si avanza o retrocedes se encendera el coche");
					ca.setEspacio(0);
				} else {
					//si el camion estaba en movimiento lo paramos 
					System.out.println("El coche ha parado");
					System.out.println("El coche arrancara cuando cuando avances o retrocedas");
					ca.parar();

					res = false;
				}
				break;
			case 3:
				ca.mostrarTacometro();
				break;
			case 4:
				//si res es falso significa que el camion esta apagado y el espacio lo recorrido lo pondra de nuevo a cero 
				// y lo volvera a encender
				if (res == false) {
					ca.setEspacio(0);
					ca.conducir();
					res = true;
				}
				System.out.println("indica la cantidad que quieres recorrer");
				int c = TratamientoExcepciones.ingresarNumero();
				ca.retroceder(c);
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				break;
			}
		} while (opcion != 5);

	}
	
	

	/**
	 * Menu del camion  donde podremos acceder a todas las funcionalidades del coche 
	 * @param res boleano de si se ha creado o no el camion
	 * @param coche objeto coche
	 * @param scanner objeto scanner 
	 */
	
	public static void menu1(boolean res, Coche coche,Scanner scanner ) {
		
		int opcion;
		do {
			System.out.println("=== MENÚ ===");

			System.out.println("1. Avanzar");
			System.out.println("2. Parar ");
			System.out.println("3. Retroceder ");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {

			case 1:
				// controlamos la variable res para saber si el coche esta parado o encendido
				// para
				// reestablecer los valores por defecto y encender el coche
				if (res == false) {
					coche.setEspacio(0);
					coche.conducir();
					res = true;

				}
				System.out.println("indica cuanto metros  quieres recorrer");
				int can = TratamientoExcepciones.ingresarNumero();
				coche.avanzar(can);
				break;
			case 2:
				if (res == false) {
					System.out.println("El coche esta apagado, si avanza o retrocedes se encendera el coche");
					coche.setEspacio(0);
				} else {
					System.out.println("El coche ha parado");
					System.out.println("Si avanza o retrocedes se encendera el coche");
					coche.parar();
					res = false;
				}

				break;
			case 3:
				// controlamos la variable res para saber si el coche esta parado o encendido
				// para
				// reestablecer los valores por defecto y encender el coche
				if (res == false) {
					coche.setEspacio(0);
					coche.conducir();
					res = true;

				}
				System.out.println("indica la cantidad que quieres recorrer");
				int cs = TratamientoExcepciones.ingresarNumero();
				coche.retroceder(cs);
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				break;
			}
		} while (opcion != 4);
	}
	
	

	
	
	public static void main(String[] args) {

		boolean res= true; //variable con la que controlaremos si el coche esta apagado o encendido
		
		Coche coche = new Coche("xsd5658","blanco"); //Creamos el obejeto coche 
		Camion ca = new Camion("xfda6665", "negro", 8);// Creamos el objeto camion
		
		//Visualizamos los objetos 
		System.out.println(ca.toString());
		System.out.println(coche.toString());
		
		Scanner scanner = new Scanner(System.in);
		//Creo un menu para elegir el vehiculo que se quiere conducir 
		
		System.out.println("Elije entre coche y camion. ");
		String ve = scanner.next();
		//comprobamos que el nombre sea coche o camion 
		ve = TratamientoExcepciones.comprobarNombre(ve);
		//si es coche haremos arrancaremos y nos iremos al menu de coche 
		if (ve.equals("coche")) {
			coche.conducir();
			res = true;
			menu1(res, coche, scanner);

		}//si es coche haremos arrancaremos y nos iremos al menu de camion 
		else if (ve.equals("camion")) {
			ca.conducir();
			res = true;
			menu2(res, ca, scanner);
		}
		scanner.close();
		
	}
}



