package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable string "jugador1" donde guardaremos la respuesta del jugador 1
		String jugador1;
		
		// Creamos la variable string "jugador2" donde guardaremos la respuesta del jugador 2
		String jugador2;
		
		// Le pedimos al jugador 1 que introduzca su respuesta entre las que le damos a elegir, "PIEDRA", "PAPEL" o "TIJERAS"
		System.out.println("Jugador 1, introduzca PIEDRA, PAPEL o TIJERAS tal y como están escritos");
		
		// Introducimos la respuesta recibida en la variable "jugador1"
		jugador1 = sc.nextLine();
		
		// Le pedimos al jugador 2 que introduzca su respuesta entre las que le damos a elegir.
		System.out.println("Jugador 2, introduzca PIEDRA, PAPEL o TIJERAS tal y como están escritos");
		
		// Introducimos la respuesta recibida en la variable "jugador2"
		jugador2 = sc.nextLine();
		
		// Comprobamos primero si ambas respuesta son iguales
		if (jugador1.equals(jugador2)) {
			
			// Si es el caso es empate, por lo que se lo mostramos al usuario
			System.out.println("¡Empate! Ambos jugadores han escogido " + jugador1);
			
		// Ahora comprobamos todas las posibilidades en las que el jugador 1 puede ganar
		} else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERAS")
				|| jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")
				|| jugador1.equals("TIJERAS") && jugador2.equals("PAPEL")) {
					
			// Se lo mostramos al usuario
			System.out.println("¡Victoria del jugador 1! " + jugador1 + " le gana a " + jugador2);
					
		// Comprobamos todas las posibilidades en las que el jugador 2 puede ganar
		} else if (jugador2.equals("PIEDRA") && jugador1.equals("TIJERAS")
				|| jugador2.equals("PAPEL") && jugador1.equals("PIEDRA")
				|| jugador2.equals("TIJERAS") && jugador1.equals("PAPEL")) {
			
			// Se lo mostramos al usuario
			System.out.println("¡Victoria del jugador 2! " + jugador2 + " le gana a " + jugador1);
					
		// El último caso posible es que hayan introducido algún dato incorrecto, por lo que se lo notificamos
		} else {
			
			System.out.println("Alguno de los datos introducidos es incorrecto");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}
	
}

