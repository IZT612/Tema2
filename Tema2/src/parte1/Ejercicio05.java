package parte1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable num1 donde guardaremos el primer numero introducido por el usuario
		int num1;
		
		// Creamos la variable num2 donde guardaremos el segundo numero introducido por el usuario
		int num2;

		// Creamos la variable num3 donde guardaremos el tercer numero introducido por el usuario
		int num3;
		
		// Le pedimos al usuario que introduzca el primer numero para ordenar de mayor a menor junto a los siguientes
		System.out.println("Introduzca el primer número para ordenar de mayor a menor");
		
		// Introducimos el valor recibido en la variable num1
		num1 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor recibido en la variable num2
		num2 = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el tercer numero
		System.out.println("Introduzca el tercer número");
		
		// Introducimos el valor recibido en la variable num3
		num3 = sc.nextInt();
		
		// Comprobamos si num1 es mayor que num2 y num2 y num3 son iguales
		if (num1 > num2 && num2 == num3) {
			
			// Le mostramos al usuario el siguiente orden: num1 > num2 = num3
			System.out.println(num1 + " > " + num2 + " = " + num3);
			
		// Comprobamos si num2 y num3 son iguales y si num2 es mayor a num1
		} else if (num2 == num3 && num2 > num1) {
			
			// Se lo mostramos al usuario
			System.out.println(num2 + " = " + num3 + " > " + num1);
			
		// Comprobamos si num2 es mayor a num1 y si num1 y num3 son iguales
		} else if (num2 > num1 && num1 == num3) {
		
			// Se lo mostramos al usuario
			System.out.println(num2 + " > " + num1 + " = " + num3);
			
		} else if (num1 == num3 && num1 > num2) {
			
			System.out.println(num1 + " = " + num3 + " > " + num2);
			
		// Comprobamos si num1 y num3 son iguales y si num1 es mayor a num2
		} else if (num1 == num3 && num1 > num2) {
			
			// Se lo mostramos al usuario
			System.out.println(num1 + " = " + num3 + " > " + num2);
		
		// Comprobamos si num3 es mayor a num2 y si num2 y num1 son iguales
		} else if (num3 > num2 && num2 == num1) {
			
			// Se lo mostramos al usuario
			System.out.println(num3 + " > " + num1 + " = " + num2);
			
		// Comprobamos si num1 y num2 son iguales y si num1 es mayor a num3
		} else if (num1 == num2 && num1 > num3) {
			
			// Se lo mostramos al usuario
			System.out.println(num1 + " = " + num2 + " > " + num3);
			
		// Comprobamos si todos los numeros son iguales
		} else if (num1 == num2 && num1 == num3) {
			
			// Se lo mostramos al usuario
			System.out.println(num1 + " = " + num2 + " = " + num3);			
		}
		
		// Comprobamos si el num1 es mayor al num2 y si num2 es mayor a num3
		else if (num1 > num2 && num2 > num3) {
			
			// Le mostramos al usuario el siguiente orden: num1 > num2 > num3
			System.out.println(num1 + " > " + num2 + " > " + num3);
			
		// Comprobamos si el num1 es mayor al num3 y si num3 es mayor a num2
		} else if (num1 > num3 && num3 > num2) {
			
			// Le mostramos al usuario el siguiente orden: num1 > num3 > num2
			System.out.println(num1 + " > " + num3 + " > " + num2);
			
		// Comprobamos si el num3 es mayor al num2 y si num2 es mayor a num1
		} else if (num3 > num2 && num2 > num1) {
			
			// Le mostramos al usuario el siguiente orden: num3 > num2 > num1
			System.out.println(num3 + " > " + num2 + " > " + num1);
			
		// Comprobamos si el num3 es mayor al num2 y si num1 es mayor a num2
		} else if (num3 > num2 && num1 > num2) {
			
			// Le mostramos al usuario el siguiente orden: num3 > num1 > num2
			System.out.println(num3 + " > " + num1 + " > " + num2);
			
		// Comprobamos si el num2 es mayor al num1 y si num1 es mayor a num3
		} else if (num2 > num1 && num1 > num3) {
			
			// Le mostramos al usuario el siguiente orden: num2 > num1 > num3
			System.out.println(num2 + " > " + num1 + " > " + num3);
			
		// Comprobamos si el num1 es mayor al num3 y si num3 es mayor a num
		} else if (num2 > num3 && num3 > num1) {
			
			// Le mostramos al usuario el siguiente orden: num2 > num3 > num1
			System.out.println(num2 + " > " + num3 + " > " + num1);
			
		} 
		
		// Cerramos el scanner
		sc.close();

	}

}
