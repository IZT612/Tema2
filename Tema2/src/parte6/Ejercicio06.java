package parte6;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
			
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "nota" donde guardaremos las notas introducidas por el usuario
		int nota;
		
		// Creamos la variable "suspensos" donde guardaremos todos los alumnos suspensos
		int suspensos = 0;
		
		/* Creamos un bucle for, con la variable "i" como contador, el cual
		 * se repetirá mientras que "i" sea menor que 5, y al final de cada 
		 * iteración a "i" se le suma 1 */
		for (int i = 0 ; i < 5 ; i++) {
			
			// Le pedimos al usuario la nota del alumno
			System.out.println("Introduzca la nota del alumno, podrá introducir " + (5 - i) + " nota/s más");
			
			// Introducimos el valor recibido en la variable "nota"
			nota = sc.nextInt();
			
			// Comprobamos si la nota es menor a 5
			if (nota < 5) {
				
				// Si es el caso incrementamos la variable "suspensos"
				suspensos++;
				
			}
			
		}
		
		// Comprobamos si la cantidad de suspensos es de 0
		if (suspensos == 0) {
			
			// Si es el caso se lo mostramos al usuario
			System.out.println("No hay ningún suspenso");
			
		// Si no es el caso, entramos en el else
		} else {
			
			// Donde le mostramos al usuario la cantidad de suspensos que hay
			System.out.println("Hay " + suspensos + " suspensos");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
