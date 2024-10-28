package parte7;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables "numeroA" y "numeroB" donde guardamos los numeros introducidos por el usuario
		int numeroA;
		int numeroB;
		
		// Creamos la variable "mayor" donde guardaremos el número más grande
		int mayor;
		
		// Creamos la variable "mcm" donde guardaremos el mínimo comun multiplo
		int mcm = 0;
		
		// Creamos la variable booleana "hayMcm" donde guardaremos si se ha encontrado un minimo comun multiplo
		boolean hayMcm = false;
		// Creamos un do-while para que introduzca un número correcto

		// Creamos un do-while para que introduzca un número correcto
		do {
			
			// Le pedimos al usuario el primer numero
			System.out.println("Introduzca el primer número, tenga en cuenta que el 0 no es válido ya que no posee mínimo común múltiplo");
			
			// Lo guardamos en la variable "numeroA"
			numeroA = sc.nextInt();
			
		// Se repetirá hasta que introduzca un número distinto a 0
		} while (numeroA == 0);
		

		// Creamos un do-while para que introduzca un número correcto
		do {
			
		// Le pedimos al usuario el primer numero
		System.out.println("Introduzca ahora el segundo número, tenga en cuenta que el 0 no es válido ya que no posee mínimo común múltiplo");
		
		// Lo guardamos en la variable "numeroB"
		numeroB = sc.nextInt();
		
		// Se repetirá hasta que introduzca un número distinto a 0
		} while (numeroB == 0);
		
		// Si el número A es mayor al número B lo ponemos como mayor
		if (numeroA > numeroB) {
			
			mayor = numeroA;
			
		// Si es al contrario, el B será mayor
		} else if (numeroB > numeroA) {
			
			mayor = numeroB;
			
		// Si no es el caso, son iguales, solo hay un posible minimo comun multiplo
		} else {
			
			mayor = 0;
			mcm = numeroA;
			hayMcm = true;
			
		}
		
		/* Creamos un bucle for, con un contador que empieza como el mayor de los 2, y se repite hasta que haya minimo 
		 * comun multiplo, tambien vamos incrementando el contador +1 por cada iteracion */
		
		for (int i = mayor ; !hayMcm ; i++) {
			
			// Comprobamos si el número es divisible entre los dos números y entramos al condicional si es el caso
			if (i % numeroA == 0 && i % numeroB == 0) {
				
				// El minimo comun multiplo será el contador
				mcm = i;
				
				// Hemos encontrado minimo comun multiplo asi que ponemos "hayMcm" como true
				hayMcm = true;
				
			}
			
		}
		
		// Le mostramos al usuario el minimo comun multiplo
		System.out.println("El mínimo común múltiplo es: " + mcm);
		
		// Cerramos el scanner
		sc.close();

	}

}
