package parte5;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "num" donde guardaremos el numero introducido por el usuario, el numero hasta el que se suma
		int num;
		
		// Creamos la variable "contador" donde iremos viendo hasta que número hay que sumar
		int contador = 0;
		
		// Creamos la variable "resultado" donde vamos guardando cada suma hasta que acabe el programa
		int resultado = 0;
		
		// Le pedimos al usuario un numero
		System.out.println("Introduzca un número");
		
		// Introducimos el valor recibido en la variable "num"
		num = sc.nextInt();
		
		// Creamos un do-while
		do {
			
			// El resultado será el resultado de la suma anterior más el contador más 1
			resultado = resultado + contador + 1;
			
			// Aumentamos el contador
			contador++;
			
		// Todo esto mientras el contador sea menor al número
		} while (contador < num);
		
		// Le mostramos al usuario el resultado
		System.out.println("La suma de todos los números del 1 a " + num + " es: " + resultado);

		// Cerramos el scanner
		sc.close();
		
	}

}
