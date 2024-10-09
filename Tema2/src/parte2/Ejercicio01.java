package parte2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "nota" donde guardaremos la nota introducida por el usuario
		int nota;
		
		// Le pedimos al usuario que introduzca su nota
		System.out.println("Introduzca su nota");
		
		// Introducimos el valor recibido en la variable "nota"
		nota = sc.nextInt();
		
		// Hacemos un switch teniendo en cuenta solo el valor de la variable "nota"
		switch (nota) {
		
		// Si está entre 0 y 4 le mostramos que es insuficiente
		case 0, 1, 2, 3, 4 -> 
			System.out.println("Insuficiente");
			
		// Si es 5 le mostramos que es suficiente
		case 5 -> 
			System.out.println("Suficiente");
			
		// Si es 6 le mostramos que es un bien
		case 6 -> 
			System.out.println("Bien");
			
		// Si es 7 u 8 le mostramos que es notable
		case 7, 8 -> 
			System.out.println("Notable");
			
		// Si es 9 o 10 le mostramos que es sobresaliente
		case 9, 10 -> 
			System.out.println("Sobresaliente");
			
		// Si ninguno de los anteriores es correcto es porque se ha introducido un número que no está entre 0 y 10, y se lo mostramos al usuario
		default ->
			System.out.println("El número introducido no está entre 0 y 10");
		
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
