package parte1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable double "nota" donde guardaremos la nota introducida por el usuario
		double nota;
		
		// Le pedimos al usuario que introduzca su nota
		System.out.println("Introduzca su nota.");
		
		// Introducimos el valor recibido en la variable "nota"
		nota = sc.nextDouble();
		
		// Primero comprobamos si la nota introducida es correcta, es decir, si esta entre 0 y 10
		if (nota < 0 || nota > 10) {
			
			// Si es el caso, notificamos al usuario de su error
			System.out.println("Debe introducir una nota del 0 al 10");
			
		// Comprobamos si la nota está entre 0 y 5 (5 no incluido)
		} else if (nota >= 0 && nota < 5) {
			
			// Notificamos al usuario que su nota es insuficiente
			System.out.println(nota + " = INSUFICIENTE");
			
		// Comprobamos si la nota está entre 5 y 6 (6 no incluido)
		} else if (nota >= 5 && nota < 6) {
			
			// Notificamos al usuario que su nota es suficiente
			System.out.println(nota + " = SUFICIENTE");
			
		// Comprobamos si la nota está entre 6 y 7 (7 no incluido)
		} else if (nota >= 6 && nota < 7) {
			
			// Notificamos al usuario que su nota es un bien
			System.out.println(nota + " = BIEN");
			
		// Comprobamos si la nota está entre 7 y 9 (9 no incluido)
		} else if (nota >= 7 && nota < 9) {
			
			// Notificamos al usuario que su nota es un notable
			System.out.println(nota + " = NOTABLE");
			
		// El único caso restante es que la nota esté entre 9 y 10, ambos incluidos
		} else {
			
			// Notificamos al usuario que su nota es insuficiente
			System.out.println(nota + " = SOBRESALIENTE");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
