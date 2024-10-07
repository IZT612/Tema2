package parte1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable num1 donde guardaremos el primer numero introducido por el usuario
		int num1;
		
		// Creamos la variable num1 donde guardaremos el segundo numero introducido por el usuario
		int num2;
		
		// Le pedimos al usuario que introduzca el primer numero para ordenar de menor a mayor
		System.out.println("Introduzca el primer número para ordenar de menor a mayor");
		
		// Introducimos el valor recibido en la variable num1
		num1 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor recibido en la variable num2
		num2 = sc.nextInt();
		
		// Vemos si num1 es menor que num2
		if (num1 < num2) {
			
			// En ese caso le mostramos al usuario los numeros ordenados, num1 < num2
			System.out.println(num1 + " < " + num2);
		
			// Si no se cumple, vemos esta vez si num2 es menor que num1
		} else if (num2 < num1) {
			
			// De ser así le mostramos al usuario los números ordenados correctamente, num2 < num1
			System.out.println(num2 + " < " + num1);
		
		// Si nada de lo anterior se cumple ejecutamos lo siguiente
		} else {
			
			// La única opción posible ahora es que ambos sean iguales, asi que se lo mostramos al usuario
			System.out.println(num1 + " = " + num2);
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
