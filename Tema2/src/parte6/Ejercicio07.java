package parte6;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el número introducido por el usuario
		int numero;
		
		// Creamos una variable boolean "primo" donde guardaremos si el número es primo o no
		boolean primo = true;
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca el número para comprobar si es primo o no");
		
		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Creamos un condicional comprobando si el número es 0 o 1
		if (numero == 0 || numero == 1) {
			
			// Si es el caso ponemos directamente que no es primo
			primo = false;
			
		}
		
		/* Creamos un bucle for con la variable "i" la cual incrementará 1 
		 * cada iteración, iniciada con 2 ya que es el primer número que 
		 * puede alterar si otro número es primo o no, con la condición de 
		 * que "i" sea menor al número y que "primo" sea true */
		for (int i = 2 ; i < numero && primo ; i++) {
			
			// Verificamos si el número es divisible entre "i"
			if (numero % i == 0) {
				
				// Si lo es, ya no puede ser primo, así que ponemos "primo" en false
				primo = false;
				
			}
			
		}
		
		// Si es primo entramos en el if
		if (primo) {
			
			// Y se lo mostramos al usuario
			System.out.println("El número " + numero + " es primo");
			
		
		// Y si no es primo, entramos en el else
		} else {
			
			// Y le mostramos que no es primo
			System.out.println("El número " + numero + " no es primo");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
