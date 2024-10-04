package Parte1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable num donde guardaremos el número introducido por el usuario
		int num;
		
		// Le pedimos al usuario que introduzca un número para ver si es par o impar
		System.out.println("Introduzca un número para ver si es par o impar");
		
		// Introducimos el valor recibido en la variable num
		num = sc.nextInt();
		
		// Vemos si el resto del número entre 2 es igual a cero para entrar al condicional
		if ((num % 2) == 0) {
			
			// En caso de ser verdad, le decimos al usuario que el número es par
			System.out.println("El número es par");
			
		// Si no se cumple pasamos a lo siguiente
		} else {
			
			// La única opción que queda es que sea impar, así que se lo mostramos al usuario.
			System.out.println("El número es impar");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
