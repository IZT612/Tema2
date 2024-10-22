package parte6;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "limite" donde guardaremos el número hasta el que contaremos que introduzca el usuario
		int limite;
		
		// Le pedimos al usuario que introduzca el numero hasta el que contar
		System.out.println("Introduzca un número para contar del 1 al número introducido");
		
		// Guardamos el valor introducido en la variable "limite"
		limite = sc.nextInt();
		
		// Creamos un bucle for con la variable "num", el cual se repetirá mientras que "num" sea menor o igual a "limite", sumandole a "num" 1 por cada iteración
		for (int num = 1; num <= limite ; num++) {
			
			// Creamos un condicional donde comprobamos si el numero es multiplo de 3
			if (num % 3 == 0)
				
			// Si es el caso le mostramos el numero al usuario, mostrando asi solo numeros multiplos de 3
			System.out.println(num);
			
		}
		
		// Cerramos el scanenr
		sc.close();

	}

}