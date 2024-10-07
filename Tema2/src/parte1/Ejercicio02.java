package parte1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable num1 donde guardaremos el primer numero introducido por el usuario
		int num1;
		
		// Creamos la variable num2 donde guardaremos el segundo numero introducido por el usuario
		int num2;
		
		// Le pedimos al usuario que introduzca el primer numero
		System.out.println("Introduzca el primer número");
		
		// Introducimos el valor recibido en la variable num1
		num1 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor recibido en la variable num2
		num2 = sc.nextInt();
		
		// Comprobamos si ambos numeros son iguales en un condicional
		if (num1 == num2) {
			
			// En caso de ser cierto, le muestra al usuario que ambos números son iguales
			System.out.println("Ambos números son iguales");
			
		// En caso de no cumplirse, pasa a lo siguiente
		} else {
			
			// Y le muestra al usuario que los números no son iguales
			System.out.println("Los números no son iguales");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
