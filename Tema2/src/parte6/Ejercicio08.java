package parte6;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero1" donde guardaremos el primer numero introducido por el usuario
		int numero1;
		
		// Creamos la variable "numero2" donde guardaremos el segundo numero introducido por el usuario
		int numero2;
		
		// Creamos la variable "mayor" donde guardaremos el número más grande de los 2 anteriores
		int mayor;
		
		// Creamos la variable "menor" donde guardaremos el número más pequeño de los 2 anteriores
		int menor;
		
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca el primer número");
		
		// Introducimos el valor recibido en la variable "numero1"
		numero1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor recibido en la variable "numero2"
		numero2 = sc.nextInt();
		
		// Comprobamos si "numero1" es mayor a "numero2"
		if (numero1 > numero2) {
			
			// Si es el caso, introducimos "numero1" como el mayor, y "numero2" como el menor
			mayor = numero1;
			menor = numero2;
			
		// Si no, comprobamos si "numero2" es mayor a "numero1"
		} else if (numero2 > numero1) {
			
			// Si es el caso, introducimos "numero2" como el mayor, y "numero1" como el menor
			mayor = numero2;
			menor = numero1;
			
		// Si tampoco es el caso, solo queda que ambos sean iguales
		} else {
			
			// Ponemos cualquiera de los 2 números como mayor y menor
			mayor = numero1;
			menor = numero1;
			
		}
		
		/* Creamos un bucle for donde empezamos a contar los números desde 
		 *el menor, y lo iremos aumentando 1 cada iteración, se repetirá 
		 *siempre que "numeros" todavía sea menor al número más grande 
		 *("mayor") y mientras que ni mayor ni menor sean iguales */
		for (int numeros = menor ; numeros <= mayor && menor != mayor ; numeros++) {
			
			// Mostramos el número
			System.out.println(numeros);
			
		}
		
		// Si ambos son iguales entramos al condicional
		if (mayor == menor) {
			
			// Y le informamos al usuario
			System.out.println("Ambos números son iguales, por lo que entre ellos realmente no hay ningún número");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
		

	}

}
