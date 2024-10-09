package parte2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos una variable string "letraCarnet" donde guardaremos la letra del carnet que el usuario introduzca
		String letraCarnet;
		
		// Le pedimos al usuario que introduzca la letra del carnet para ver de que vehículo se trata
		System.out.println("Introduzca la letra del carnet para saber de que vehículo se trata");
		
		// Introducimos la respuesta recibida en la variable "letraCarnet"
		letraCarnet = sc.nextLine();
		
		// Hacemos un switch según "letraCarnet"
		switch (letraCarnet) {
		
		// Si es "E" es un remolque y lo mostramos
		case "E" -> {
			System.out.println("Remolque");
		}
		
		// Si es "D" es un autobús y lo mostramos
		case "D" -> {
			System.out.println("Autobús");
		}
		
		// Si está entre "C1" y "C5" es un camión y lo mostramos
		case "C1", "C2", "C3", "C4", "C5" -> {
			System.out.println("Camión");
		}
		
		// Si es "A" es una motocicleta y lo mostramos
		case "A" -> {
			System.out.println("Motocicleta");
		}
		
		// Si es "B1" o "B2" es un automóvil y lo mostramos
		case "B1", "B2" -> {
			System.out.println("Automóvil");
		}
		
		// Si no es el caso, ha introducido uno no conocido o erróneo
		default -> {
			System.out.println("Categoría no contemplada");
		}
		
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
