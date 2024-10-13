package parte3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Mínimo 2 pruebas, una diciendo el resultado correcto y otro el incorrecto
		
		/* Prueba 1
		 * 
		 * Valor de entrada: 92 + 80 = 172
		 * Resultado esperado: "¡Correcto! La suma: 92 + 80 tiene como resultado 172"
		 * Resultado obtenido: "¡Correcto! La suma: 92 + 80 tiene como resultado 172"
		 */
		
		/* Prueba 2
		 * 
		 * Valor de entrada: 76 + 97 = -90
		 * Resultado esperado: "¡Incorrecto! La suma: 92 + 80 tiene como resultado 173"
		 * Resultado obtenido: "¡Incorrecto! La suma: 92 + 80 tiene como resultado 173"
		 */
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la constante entera "numero1" con un numero aleatorio del 1 al 100
		final int numero1 = (int) (Math.random() * 100);
		
		// Creamos la constante entera "numero2" con un numero aleatorio del 1 al 99
		final int numero2 = (int) (Math.random() * 100);
		
		// Creamos la variable entera "respuesta" donde guardaremos la respuesta del usuario
		int respuesta;
		
		// Le mostramos al usuario los números y le pedimos el resultado de su suma
		System.out.println("Introduzca el resultado de la siguiente suma: " + numero1 + " + " + numero2);
		
		// Leemos el teclado e introducimos el valor recibido en la variable "respuesta"
		respuesta = sc.nextInt();
		
		// Comprobamos si la respuesta del usuario es igual a la suma de los numeros
		if (respuesta == (numero1 + numero2)) {
			
			// Si es el caso, es correcto, por lo que se lo indicamos al usuario
			System.out.println("¡Correcto! La suma: " + numero1 + " + " + numero2 + " tiene como resultado " + respuesta);
			
		// Si no, es incorrecto
		} else {
			
			// Se lo decimos al usuario y le mostramos el resultado real
			System.out.println("¡Incorrecto! La suma: " + numero1 + " + " + numero2 + " tiene como resultado " + (numero1 + numero2));
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
