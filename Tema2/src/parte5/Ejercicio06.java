package parte5;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "jugador1" donde guardaremos la elección del jugador 1
		String jugador1;
		
		// Creamos la variable "jugador2" donde guardaremos la elección del jugador 2
		String jugador2;
		
		// Creamos la variable "repetir" donde guardaremos la respuesta al preguntar si quieren repetir
		String repetir;
		
		// Creamos un do-while que englobe todo para poder repetir la partida proximamente
		do {
			
			// Creamos un do-while
			do {
				
				// Le pedimos al jugador 1 que introduzca su elección
				System.out.println("Jugador 1: Elija piedra, papel o tijeras");
				
				// Introducimos su elección en "jugador1"
				jugador1 = sc.nextLine();
				
			// Si la elección es errónea, se repetirá hasta que sea válida
			} while (!jugador1.equalsIgnoreCase("piedra") && !jugador1.equalsIgnoreCase("papel") && !jugador1.equalsIgnoreCase("tijeras"));
			
			// Creamos un do-while
			do {
				
				// Le pedimos al jugador 2 que introduzca su elección
				System.out.println("Jugador 2: Elija piedra, papel o tijeras");
				
				// Introducimos su elección en "jugador"
				jugador2 = sc.nextLine();
				
			// Si la elección es errónea, se repetirá hasta que sea válida
			} while (!jugador2.equalsIgnoreCase("piedra") && !jugador2.equalsIgnoreCase("papel") && !jugador2.equalsIgnoreCase("tijeras"));
			
			// Vemos todas las posibilidades en las que gana el jugador 1
			if ((jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("tijeras")) || (jugador1.equalsIgnoreCase("tijeras") && jugador2.equalsIgnoreCase("papel")) || (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("piedra"))) {
				
				// Le mostramos a los usuarios el resultado, donde jugador 1 gana
				System.out.println("El jugador 1 ha ganado, ya que " + jugador1.toLowerCase() + " le gana a " + jugador2.toLowerCase());
				
			// Vemos todas las posibilidades en las que gana el jugador 2
			} else if ((jugador2.equalsIgnoreCase("piedra") && jugador1.equalsIgnoreCase("tijeras")) || (jugador2.equalsIgnoreCase("tijeras") && jugador1.equalsIgnoreCase("papel")) || (jugador2.equalsIgnoreCase("papel") && jugador1.equalsIgnoreCase("piedra"))) {
				
				// Le mostramos a los usuarios el resultado, donde jugador 2 gana
				System.out.println("El jugador 2 ha ganado, ya que " + jugador2.toLowerCase() + " le gana a " + jugador1.toLowerCase());
			
			// La única opción restante es que sea empate	
			} else {
				
				// Notificamos que han quedado empate
				System.out.println("Empate, ya que ambos jugadores escogieron " + jugador1.toLowerCase());
				
			}
			
			// Le decimos al usuario que si quiere repetir, introduzca "S"
			System.out.println("Introduzca 'S' si quiere repetir la partida");
			
			// Guardamos el resultado en la variable "repetir"
			repetir = sc.nextLine();
			
		// Si "repetir" es "S", la partida se repetirá
		} while (repetir.equalsIgnoreCase("S"));
		
		// Cerramos el scanner
		sc.close();

	}

}
