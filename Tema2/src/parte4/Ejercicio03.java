package parte4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable "numero" donde guardaremos el numero introducido por el usuario 
		int numero;
		
		// Declaramos la variable "resultado" donde guardaremos la suma de los números, y le damos el valor de 0 para inicializarla
		double suma = 0;
		
		// Declaramos la variable "contador" donde guardaremos la cantidad de números que introduce el usuario
		int contador = 0;
		
		// Le pedimos al usuario que introduzca un número y le explicamos como funciona el programa
		System.out.println("Introduzca números positivos para calcular su media, introduzca un número negativo para detener el programa y mostrar el resultado");
		
		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Creamos un bucle con la condicion de que numero sea mayor o igual a 0
		while (numero >= 0) {
			
			// Sumamos el numero introducido por el usuario a la variable "suma"
			suma += numero;
			
			// Le sumamos 1 a contador
			contador++;
			
			// Pedimos un nuevo numero antes de finalizar el bucle
			System.out.println("Introduzca números positivos para sumarlos todos al final, introduzca un número negativo para detener el programa y mostrar el resultado");
			
			// Le damos a "numero" el valor introducido por el usuario
			numero = sc.nextInt();
			
		}
		
		// Creamos un condicional por si el resultado es 0
		if (suma == 0) {
			
			// E indicamos al usuario que no ha introducido realmente ningún número positivo
			System.out.println("No ha introducido ningún número positivo, por lo que el resultado se podría considerar 0, y por ende, la media, también sería 0");
			
		// Si es distinto a 0 procedemos
		} else {
			
			// Y le mostramos al usuario la media
			System.out.println("La media es: " + (suma / contador));
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
