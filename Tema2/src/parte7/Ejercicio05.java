package parte7;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Creamos un do-while para que introduzca el valor correcto
		do {
			
			// Le pedimos que introduzca un número del 1 al 20
			System.out.println("Introduzca un número del 1 al 20");
			
			// Introducimos el valor en la variable "numero"
			numero = sc.nextInt();
			
		// Se repetirá hasta que introduzca un valor válido (entre 1 y 20)
		} while (numero < 1 || numero > 20);
		
		// Creamos un bucle for que irá generando números del 1 hasta alcanzar el número introducido por el usuario
		for (int numeroIntermedio = 1 ; numeroIntermedio <= numero ; numeroIntermedio++ ) {
			
			// Creamos otro for el cual se encargará de que repitamos el print del número tantas veces como el número indique
			for (int numeroRepeticion = 1 ; numeroRepeticion <= numeroIntermedio ; numeroRepeticion++) {
				
				// Mostramos el número (con un espacio para evitar confusión en los números de 2 cifras)
				System.out.print(numeroIntermedio + " ");
				
			}
			
			// Imprimimos un espacio para separar los números
			System.out.println();
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
