package parte6;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos los numeros introducidos por el usuario
		int numero;
		
		// Creamos la variable "sumaTotal" donde iremos guardando la suma de todos los numeros para hacer la media mas tarde
		int sumaTotal = 0;
		
		/* Creamos un bucle for con la variable "i" como contador, el cual 
		 * se repetirá mientras que "i" sea menor a 10, y le sumaremos a 
		 * "i" 1 por cada iteración */
		for (int i = 0; i < 10 ; i++) {
			
			// Pedimos al usuario que introduzca un número y le mostramos cuantos números más puede introducir
			System.out.println("Puede introducir " + (10 - i) + " número/s más");
			
			// Introducimos el valor recibido en la variable "numero"
			numero = sc.nextInt();
			
			// a "sumaTotal" le sumamos el número introducido por el usuario
			sumaTotal += numero;
			
			
		}
		
		// Le mostramos al usuario la media de todos los números una vez introducidos los 10 números
		System.out.println("La media de todos los números es: " + ((double) sumaTotal / 10));
		
		// Cerramos el scanner
		sc.close();
		
	}

}
