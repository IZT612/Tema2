package parte7;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Creamos la variable "cantidadPrimos" donde guardaremos la cantidad de primos que hay del 1 al numero introducido por el usuario
		int cantidadPrimos = 0;
		
		// creamos la variable booleana "primo" donde verificaremos si el numero es primo o no
		boolean primo;
		
		// Le pedimos al usuario que introduzca un numero
		System.out.println("Introduzca un número");
		
		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Creamos un bucle for donde comenzamos a contar desde el 2, y vamos incrementandolo, y se repetira mientras el numero a verificar sea menor o igual al numero del usuario
		for (int numerosPrimos = 2 ; numerosPrimos <= numero ; numerosPrimos++) {
			
			// Deducimos que todos los numeros son primos hasta demostrar lo contrario
			primo = true;
			
			// Con otro bucle for, comenzamos a contar desde el 2, y vamos incrementandolo, y se repetira mientras que sea primo y el contador no alcance el número a verificar
			for (int i = 2 ; primo && i != numerosPrimos ; i++ ) {
				
				// Si el número se puede dividir entre el contador entramos al condicional
				if (numerosPrimos % i == 0) {
					
					// Por lo que ya no es primo
					primo = false;
					
				}
				
			}
			
			// Al acabar el bucle, si sigue siendo primo, entramos al condicional
			if (primo) {
				
				// Le mostramos al usuario el número
				System.out.println(numerosPrimos);
				
				// Incrementamos en 1 la cantidad de numeros primos
				cantidadPrimos++;
			}
					
		}
		
		// Le mostramos al usuario la cantidad de numeros primos final
		System.out.println("Son " + cantidadPrimos + " números primos en total");

		
		// Cerramos el scanner
		sc.close();

	}

}
