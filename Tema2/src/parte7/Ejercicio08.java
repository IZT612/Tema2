package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero = 0;
		
		/* Creamos la variable "ultimoNumero" donde guardaremos el ultimo numero que ha introducido el usuario, para 
		 * compararlo con el recien introducido */
		int ultimoNumero = 0;
		
		// Creamos la variable "numerosIntroducidos" donde guardaremos la cantidad de numeros que ha introducido el usuario
		int numerosIntroducidos = 0;
		
		// Creamos la variable "numerosFallados" donde guardaremos la cantidad de numeros que ha fallado el usuario
		int numerosFallados = 0;
		
		/* Creamos una variable booleana "primeraVez" para verificar si es el primer numero que el usuario va a 
		 * introducir despues de fallar o al empezar el programa para así evitar errores*/
		boolean primeraVez = true;
		
		// Creamos una variable booleana "error" para verificar si hay algun error al introducir el número
		boolean error = false;
		
		// Creamos el bucle do-while principal que repite todo el programa
		do {
			
			// Creamos un bucle do-while secundario para pedir el numero y repetir si es incorrecto
			do {
				
				// Ponemos "error" como falso para evitar bucles infinitos en caso de que se obtenga un error
				error = false;
				
				// Hacemos un try para encontrar errores a la hora de pedir el numero y recogerlo
				try {
					
					// Pedimos el numero al usuario
					System.out.println("Introduzca un número");
					
					// Introducimos el valor recibido en "numero"
					numero = sc.nextInt();
					
				/*  El unico error posible es que se introduzca algo que no es un numero, si es el caso lo atrapamos con un catch 
				 * para mostrar un mensaje de error */
				} catch  (InputMismatchException e) {
					
					// Informamos al usuario del error
					System.out.println("No puede introducir texto");
					
					// Ponemos "error" como true
					error = true;
					
				}
				
				// Limpiamos el scanner
				sc.nextLine();
				
			// Este bucle se repetirá mientras haya un error
			} while (error);
			
			// Siempre que el numero sea distinto de 0 entramos al condicional
			if (numero != 0) {
				
				// Y sumamos 1 a "numerosIntroducidos"
				numerosIntroducidos++;
				
			}
		
			
			// Si es la primera vez del usuario entramos en el condicional
			if (primeraVez) {
				
				/* Guardamos el último numero como el número recien introducido, sin verificar nada porque al ser el 
				 * primero no puede ser menor a ningun otro numero */
				ultimoNumero = numero;
				
				// Ponemos "primeraVez" como falso
				primeraVez = false;
				
			/* Si no, entramos en el siguiente condicional siempre que sea distinto de 0 y el numero introducido sea 
			 * menor al anterior */
			} else if (numero <= ultimoNumero && numero != 0) {
				
				// Aumentamos en 1 las veces que ha fallado el usuario
				numerosFallados++;
				
				// Volvemos a poner "primeraVez" como true
				primeraVez = true;
				
				// Informamos al usuario que ha fallado
				System.out.println("Ha fallado");
				
			}
			
			// Hacemos que "ultimoNumero" sea igual al número recien escrito
			ultimoNumero = numero;
			
		// Este bucle se repetirá mientras que no se introduzca un 0
		} while (numero != 0);
		
		// Le mostramos al usuario las veces que ha fallado
		System.out.println("Ha fallado " + numerosFallados + " veces");
		
		// Le mostramos al usuario los números introducidos
		System.out.println("Ha introducido " + numerosIntroducidos + " números");
		
		// Cerramos el scanner
		sc.close();

	}

}
