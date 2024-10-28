package parte7;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Creamos un bucle do-while para guardar el valor de "numero"
		do {
			
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número que marcará la base y altura del triángulo, el mínimo es de 2");
			
			// Introducimos el valor en la variable "numero"
			numero = sc.nextInt();
			
		// Se repetirá mientras el número sea igual o menor a 1 (el mínimo para ser un triángulo debe ser de 2)
		} while (numero <= 1);
		
		/* Creamos un bucle for para las filas, dentro de este iremos viendo que colocar en cada fila, al terminar una 
		 * fila, se incrementará y seguirá con la siguiente, y así hasta completarlas todas, es decir, hasta igualar el 
		 * número del usuario */
		for (int fila = 1 ; fila <= numero ; fila++) {
			
			/* Creamos un bucle for para los espacios en blanco a colocar al inicio de cada fila, para así centrar los 
			 * puntos que pintarán nuestro triángulo.
			 * La fórmula es sencilla: Si a la altura le restamos la fila en la que nos encontramos, sabremos cuantos 
			 * espacios hay que colocar, por lo que hacemos un bucle que se repita esa cantidad de veces imprimiendo un 
			 * espacio en la misma linea constantemente */
			for (int espacios = 0 ; espacios != numero - fila ; espacios++) {
				
				// Imprimimos el espacio EN LA MISMA LÍNEA
				System.out.print(" ");
				
			}
			
			/* Creamos un último bucle for para los puntos que hay que colocar.
			 * Los puntos a colocar coinciden con el número de la fila, por lo que es simple, hacemos un bucle que 
			 * imprima puntos y que este se repita hasta imprimir la misma cantidad de puntos que el número introducido 
			 * por el usuario */
			for (int puntos = 0 ; puntos != fila ; puntos++) {
				
				// Imprimimos el punto EN LA MISMA LÍNEA (añadimos un espacio para no romper la estructura del triángulo)
				System.out.print("* ");
				
			}
			
			// Al final de cada línea pasamos a la siguiente mediante un println
			System.out.println();
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
