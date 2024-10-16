package parte4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "altura" donde guardaremos la altura introducida por el usuario
		int altura;
		
		// Creamos la variable "recordAltura" donde guardaremos la altura más alta introducida por el usuario
		int recordAltura = 0;
		
		// Le pedimos al usuario que introduzca la altura del árbol en centímetros
		System.out.println("Introduzca la altura del árbol en centímetros");
		
		// Introducimos el valor recibido en la variable "altura"
		altura = sc.nextInt();
		
		// Creamos un bucle mientras que la altura sea mayor a 0
		while (altura > 0) {
			
			// Si la altura es mas grande al record entramos en el condicional
			if (altura > recordAltura) {
				
				// Y guardamos el nuevo record de altura
				recordAltura = altura;
				
			// Si no es el caso, cerramos sin modificar nada
			}
			
			// Le pedimos al usuario que introduzca la altura de otro árbol
			System.out.println("Introduzca la altura de otro árbol en centímetros, introduzca uno negativo para finalizar");
			
			// Introducimos el valor recibido en la variable "altura"
			altura = sc.nextInt();
			
		}
		
		// Si el record de altura es 0 entramos en el condicional
		if (recordAltura == 0) {
			
			// Y le informamos al usuario que no ha introducido ningúna altura válida
			System.out.println("No se ha introducido la altura de ningún árbol");
			
		// Si no es el caso, procedemos
		} else {
			
			// Y le mostramos al usuario el record de altura
			System.out.println("La altura del árbol más grande es de " + recordAltura + " centímetros");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
