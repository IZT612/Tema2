package parte2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable double "numero1" donde guardaremos el primer numero introducido por el usuario
		double numero1;
		
		// Creamos la variable double "numero2" donde guardaremos el segundo numero introducido por el usuario
		double numero2;
		
		// Creamos la variable string "opcion" donde guardaremos la opción que el usuario introduzca para saber que operacion realizar
		String opcion;
		
		// Le pedimos al usuario que introduzca el primer número
		System.out.println("Introduzca el primer número");
		
		// Introducimos el número recibido en la variable "numero1"
		numero1 = sc.nextDouble();
		
		// Le pedimos al usuario que introduzca el segundo número
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el número recibido en la variable "numero2"
		numero2 = sc.nextDouble();
		
		// Le indicamos al usuario que seleccione una opción de las siguientes
		System.out.println("Ahora introduzca la opción de la operación que quiere realizar: A, B, C o D");
		
		// Opción A: Suma de los números
		System.out.println("A. Sumar los números");
		
		// Opción B: Resta de los números
		System.out.println("B. Restar los números");
		
		// Opción C: Multiplicación de los números
		System.out.println("C. Multiplicar los números");
		
		// Opción D: División de los números
		System.out.println("D. Dividir los números");
		
		// Leemos del teclado la opción escrita y la introducimos en la variable "opcion"
		opcion = sc.next();
		
		// Creamos un pequeño espacio entre las opciones y la respuesta para que se vea mejor
		System.out.println("");
		
		// Hacemos un switch según la opción introducida en "opcion"
		switch (opcion) {
		
		// Si es A, sumamos los números y se lo mostramos
		case "A" ->
		System.out.println("La suma de los números es: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		
		// Si es B, restamos los números y se lo mostramos
		case "B" ->
		System.out.println("La resta de los números es: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));		
		
		// Si es C, multiplicamos los números y se lo mostramos
		case "C" ->
		System.out.println("La multiplicación de los números es: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		
		// Si es D, primero tenemos que comprobar si la división es posible
		case "D" -> {
			
			// Comprobamos si el divisor es igual a 0, si es el caso no se podrá completar
			if (numero2 == 0) {
				
				// Así que se lo mostramos al usuario
				System.out.println("El segundo número es igual a 0, no se puede completar la división");
				
			// Si no lo es, se puede completar
			} else {
				
				// La calculamos y se lo mostramos al usuario
				System.out.println("La división de los números es: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				
			}
			
		}
		
		// Si no es ninguna de las anteriores, le decimos al usuario que lo que ha introducido no existe
		default ->
		System.out.println("Se ha introducido una opción inexistente");
		
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
