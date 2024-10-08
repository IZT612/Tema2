package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "num1" donde guardaremos el primer número introducido por el usuario
		int num1;
		
		// Creamos la variable entera "num2" donde guardaremos el segundo número introducido por el usuario
		int num2;
		
		// Creamos la variable entera "num3" donde guardaremos el tercer número introducido por el usuario
		int num3;
		
		// Le pedimos al usuario que introduzca el primer número
		System.out.println("Introduzca el primer número");
		
		// Introducimos el valor recibido en la variable "num1"
		num1 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el segundo número
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor recibido en la variable "num2"
		num2 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el tercer número
		System.out.println("Introduzca el tercer número");
		
		// Introducimos el valor recibido en la variable "num3"
		num3 = sc.nextInt();
		
		// Primero verificamos si al sumar "num1" y "num2" nos da "num3"
		if ((num1 + num2) == num3) {
			
			// Si es el caso, se lo mostramos al usuario
			System.out.println("Entre estos números: " + num1 + " + " + num2 + " = " + num3);
			
		// Luego verificamos si al sumar "num1" y "num3" nos da "num2"
		} else if ((num1 + num3) == num2) {
			
			// Si es el caso, se lo mostramos al usuario
			System.out.println("Entre estos números: " + num1 + " + " + num3 + " = " + num2);
			
		// Luego verificamos si al sumar "num2" y "num3" nos da "num1"
		} else if ((num2 + num3) == num1) {
			
			// Si es el caso, se lo mostramos al usuario
			System.out.println("Entre estos números: " + num2 + " + " + num3 + " = " + num1);
			
		// Finalmente, el único caso posible que queda, es que no haya ninguna combinación posible entre esos 3 números recibidos
		} else {
			
			// Se lo mostramos al usuario
			System.out.println("Ninguno de los números puede combinarse con otro para dar como resultado el restante.");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
