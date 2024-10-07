package parte1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable num donde se introducirá el número dado por el usuario
		double num;
		
		// Le pedimos al usuario un nñumero, con decimales o no
		System.out.println("Introduzca un número, tenga decimales o no ");
		
		// Introducimos el valor recibido en la variable num
		num = sc.nextDouble();
		
		// Vemos si el número es mayor que menos uno y menor que uno y a su vez no es igual a cero
		if ((num > -1 && num < 1) && num != 0) {
			
			// Si se cumple le mostrará al usuario que es casi-cero
			System.out.println("El número es un número casi-cero");
		
		// Si no se cumple pasará a lo siguiente
		} else {
			
			// Le mostrará al usuario que NO es casi-cero
			System.out.println("El número NO es un número casi-cero");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
