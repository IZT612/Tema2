package parte1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable numero donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Le pedimos al usuario que introduzca un numero entre 0 y 99999
		System.out.println("Introduzca un número entre 0 y 99999");
		
		// Introducimos el valor recibido en la variable numero
		numero = sc.nextInt();
		
		// Primero verificamos si el numero introducido cumple con los requisitos
		if (numero < 0 || numero > 99999) {
		
			// En caso de que no se cumplan, se lo notificamos al usuario
			System.out.println("El número introducido es mayor a 99999 o inferior a 0");
		
		// Ahora para comprobar si tiene 1 cifra, basta con restarle 10 y ver si el resultado es negativo
		} else if ((numero - 10) < 0) {
			
			// En caso de ser así se lo mostramos al usuario
			System.out.println("El número introducido tiene 1 cifra");
			
		// Y siguiendo el ejemplo anterior, lo hacemos con las demás posibilidades, comprobando si tiene 2 cifras
		} else if ((numero - 100) < 0) {
			
			// Se lo mostramos al usuario
			System.out.println("El número introducido tiene 2 cifras");
			
		// Comprobamos si tiene 3 cifras
		} else if ((numero - 1000) < 0) {
			
			// Se lo mostramos al usuario
			System.out.println("El número introducido tiene 3 cifras");
			
		// Comprobamos si tiene 4 cifras
		} else if ((numero - 10000) < 0) {
			
			// Se lo mostramos al usuario
			System.out.println("El número introducido tiene 4 cifras");
			
		// El único caso que es posible ahora si ninguno de los anteriores ha funcionado, es que tenga 5 cifras
		} else {
			
			// Se lo mostramos al usuario
			System.out.println("El número introducido tiene 5 cifras");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
