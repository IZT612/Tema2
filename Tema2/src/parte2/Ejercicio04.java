package parte2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
	
		// Creamos la variable string "tirada1" donde guardaremos el valor de la primera tirada del usuario
		String tirada1;
		
		// Creamos la variable string "tirada2" donde guardaremos el valor de la segunda tirada del usuario
		String tirada2;
		
		// Creamos la variable entera "dado1" donde guardaremos el valor de la primera tirada pero en número
		int dado1;
		
		// Creamos la variable entera "dado2" donde guardaremos el valor de la segunda tirada pero en número
		int dado2;
		
		// Le pedimos al usuario que introduzca el valor de la primera tirada
		System.out.println("Introduzca la primera tirada en letras");
		
		// Introducimos el valor recibido en la variable "tirada1"
		tirada1 = sc.nextLine();
		
		// Le pedimos al usuario que introduzca el valor de la segunda tirada
		System.out.println("Introduzca la segunda tirada en letras");
		
		// Introducimos el valor recibido en la variable "tirada2"
		tirada2 = sc.nextLine();
	
		// Hacemos un switch con el valor de "tirada1" igualandolo a "dado1"
		dado1 = switch (tirada1) {
		
		// Si "tirada1" es UNO, introducimos el valor 1 en "dado1"
		case "UNO" -> {
			yield 1;
		}
		
		// Si "tirada1" es DOS, introducimos el valor 2 en "dado1"
		case "DOS" -> {
			yield 2;
		}
		
		// Si "tirada1" es TRES, introducimos el valor 3 en "dado1"
		case "TRES" -> {
			yield 3;
		}
		
		// Si "tirada1" es CUATRO, introducimos el valor 4 en "dado1"
		case "CUATRO" -> {
			yield 4;
		}
		
		// Si "tirada1" es CINCO, introducimos el valor 5 en "dado1"
		case "CINCO" -> {
			yield 5;
		}
		
		// Si "tirada1" es SEIS, introducimos el valor 6 en "dado1"
		case "SEIS" -> {
			yield 6;
		}
		
		// Si no coincide con ninguno, es erróneo, mientras tanto damos el valor 0 al dado para posteriormente mostrar un error
		default -> {
			yield 0;
		}

		};
		
	// Hacemos un switch con el valor de "tirada2" igualandolo a "dado2"
	dado2 = switch (tirada2) {
		
		// Si "tirada2" es UNO, introducimos el valor 1 en "dado2"
		case "UNO" -> {
			yield 1;
		}
		
		// Si "tirada2" es DOS, introducimos el valor 2 en "dado2"
		case "DOS" -> {
			yield 2;
		}
		
		// Si "tirada2" es TRES, introducimos el valor 3 en "dado2"
		case "TRES" -> {
			yield 3;
		}
		
		// Si "tirada2" es CUATRO, introducimos el valor 4 en "dado2"
		case "CUATRO" -> {
			yield 4;
		}
		
		// Si "tirada2" es CINCO, introducimos el valor 5 en "dado2"
		case "CINCO" -> {
			yield 5;
		}
		
		// Si "tirada2" es SEIS, introducimos el valor 6 en "dado2"
		case "SEIS" -> {
			yield 6;
		}
		
		// Si no coincide con ninguno, es erróneo, mientras tanto damos el valor 0 al dado para posteriormente mostrar un error
		default -> {
			yield 0;
		}
		
		};
		
		// Imprimimos un espacio para separar el resultado y que así se vea mejor
		System.out.println("");
		
		// Comprobamos si alguno de los dados da 0
		if (dado1 == 0 || dado2 == 0) {
			
			// Si es el caso, un número se ha tenido que introducir mal, así que se lo notificamos al usuario
			System.out.println("Alguno de los números introducidos es erróneo");
			
		// Si no, todo está bien así que podemos calcular el resultado
		} else {
			
			// Calculamos la suma de ambos dados y se lo mostramos al usuario
			System.out.println("La suma de sus tiradas es: " + dado1 + " + " + dado2 + " = " + (dado1 + dado2));
			
		}
			
		// Cerramos el scanner
		sc.close();
		
	}

}
