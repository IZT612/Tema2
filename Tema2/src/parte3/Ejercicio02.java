package parte3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Se deben hacer mínimo 3 pruebas, para ver que ocurre con un número positivo, con el 0 y con un número negativo
		
		/* Prueba 1
		 * 
		 * Valor de entrada ---> 9
		 * Resultado esperado ---> "El valor absoluto de 9 es: 9"
		 * Resultado obtenido ---> "El valor absoluto de 9 es: 9"
		 */
		
		/* Prueba 2
		 * 
		 * Valor de entrada ---> 0
		 * Resultado esperado ---> "El valor absoluto de 0 es: 0"
		 * Resultado obtenido ---> "El valor absoluto de 0 es: 0"
		 */
		
		/* Prueba 3
		 * 
		 * Valor de entrada ---> -8
		 * Resultado esperado ---> "El valor absoluto de -8 es: 8"
		 * Resultado obtenido ---> "El valor absoluto de -8 es: 8"
		 */
		
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "numeroUser" donde guardaremos el numero introducido por el usuario
		int numeroUser;
		
		// Creamos la variable entera "numeroAbs" donde guardaremos el valor absoluto del numero introducido por el usuario
		int numeroAbs;
		
		// Le peidmos al usuario que introduzca un numero
		System.out.println("Introduzca un número para mostrarle su valor absoluto");
		
		// Leemos el teclado e introducimos el valor recibido en la variable "numeroUser"
		numeroUser = sc.nextInt();
		
		// Mediante un operador ternario comprobamos si el número del usuario es 0 o positivo, si es el caso el valor absoluto será el numero sin más, pero si es negativo, lo multiplicamos por -1 para obtener su valor absoluto 
		numeroAbs = numeroUser >= 0 ? numeroUser : numeroUser * -1;
		
		// Le mostramos al usuario el valor absoluto de su numero
		System.out.println("El valor absoluto de " + numeroUser + " es: " + numeroAbs);
		
		// Cerramos el scanner
		sc.close();
		
	}

}
