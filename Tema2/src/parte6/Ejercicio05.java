package parte6;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "factorial" donde guardaremos el resultado del factorial (inicializada a 1 para evitar problemas en futuras operaciones)
		int factorial = 1;
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Le pedimos al usuario que introduzca un número para calcular su factorial
		System.out.println("Introduzca un número para calcular su factorial");
		
		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		/* Creamos un bucle for con una variable "i" inicializada a 1, que 
		 * se incrementará +1 por cada iteración, y se repetirá mientras 
		 * "i" sea menor o igual al número del usuario */
		for (int i = 1 ; i <= numero ; i++) {
			
			// Igualamos "factorial" a "factorial" por "i", lo que al repetirse x veces, nos dará el resultado del factorial de x número
			factorial *=  i; 
			
		}
		
		// Le mostramos al usuario el factorial del numero que introdujo
		System.out.println("El factorial de " + numero + " es: " + factorial);

		// Cerramos el scanner
		sc.close();
		
	}
	

}
