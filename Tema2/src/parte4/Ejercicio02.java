package parte4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable "numero" donde guardaremos el numero introducido por el usuario 
		int numero;
		
		// Declaramos la variable "contador" donde guardaremos la cantidad de numeros introducidos por el usuario
		int contador = 0;
		
		// Le pedimos al usuario que introduzca un número y le explicamos como funciona el programa
		System.out.println("Introduzca números positivos para contarlos y mostrar su cantidad al final, introduzca un número negativo para detener el programa y mostrar el resultado");
		
		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Creamos un bucle con la condicion de que numero sea mayor o igual a 0
		while (numero >= 0) {
			
			// Le sumamos 1 al contador
			contador++;
			
			// Pedimos un nuevo numero antes de finalizar el bucle
			System.out.println("Introduzca números positivos para contarlos y mostrar su cantidad al final, introduzca un número negativo para detener el programa y mostrar el resultado");
			
			// Le damos a "numero" el valor introducido por el usuario
			numero = sc.nextInt();
			
		}
		
		// Creamos un condicional por si el resultado es 0
		if (contador == 0) {
			
			// E indicamos al usuario que no ha introducido realmente ningún número positivo
			System.out.println("No ha introducido ningún número positivo");
			
		// Si es distinto a 0 procedemos
		} else {
			
			// Y le mostramos al usuario cuantos numeros positivos ha introducido
			System.out.println("Ha introducido " + contador + " números positivos");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}