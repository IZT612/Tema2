package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "dia" donde guardaremos el numero introducido por el usuario que representa un dia de la semana
		int dia;
		
		// Le pedimos al usuario que introduzca un número entre 1 y 7, representando los días de la semana
		System.out.println("Introduzca un número entre 1 y 7 para indicarle que día de la semana es");
		
		// Introducimos el valor recibido en la variable "dia"
		dia = sc.nextInt();
		
		// Hacemos un switch teniendo en cuenta el valor de la variable "dia"
		switch (dia) {
		
		// Si "dia" equivale a 1, le mostramos al usuario el día correspondiente de la semana: Lunes
		case 1 ->
			System.out.println("Lunes");
			
			// Si "dia" equivale a 2, le mostramos al usuario el día correspondiente de la semana: Martes
		case 2 ->
			System.out.println("Martes");
			
			// Si "dia" equivale a 3, le mostramos al usuario el día correspondiente de la semana: Miércoles
		case 3 ->
			System.out.println("Miércoles");
			
			// Si "dia" equivale a 4, le mostramos al usuario el día correspondiente de la semana: Jueves
		case 4 ->
			System.out.println("Jueves");
			
			// Si "dia" equivale a 5, le mostramos al usuario el día correspondiente de la semana: Viernes
		case 5 ->
			System.out.println("Viernes");
			
			// Si "dia" equivale a 6, le mostramos al usuario el día correspondiente de la semana: Sábado
		case 6 ->
			System.out.println("Sábado");
			
			// Si "dia" equivale a 7, le mostramos al usuario el día correspondiente de la semana: Domingo
		case 7 ->
			System.out.println("Domingo");
			
			// Si ninguno de los anteriores se cumple debe ser porque el número introducido no esta entre 1 y 7, por lo que se lo mostramos al usuario
		default ->
			System.out.println("El número introducido no está entre 1 y 7");
		
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
