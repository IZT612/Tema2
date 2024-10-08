package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String jugador1;
		
		String jugador2;
		
		System.out.println("Jugador 1, introduzca PIEDRA, PAPEL o TIJERAS tal y como están escritos");
		
		jugador1 = sc.nextLine();
		
		System.out.println("Jugador 2, introduzca PIEDRA, PAPEL o TIJERAS tal y como están escritos");
		
		jugador2 = sc.nextLine();
		
		if (!)
		
		} else if (jugador1.equals(jugador2)) {
			
			System.out.println("¡Empate! Ambos jugadores han escogido " + jugador1);
			
		} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERAS")
				|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")
				|| (jugador1.equals("TIJERAS") && jugador2.equals("PAPEL")) {
					
					System.out.println("¡Victoria del jugador 1! " + jugador1 + " le gana a " + jugador2);
					
		} else {	
					System.out.println("¡Victoria del jugador 2! " + jugador2 + " le gana a " + jugador1);
	}

}
