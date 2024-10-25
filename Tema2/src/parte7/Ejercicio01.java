package parte7;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables que nos dicen la hora que introducirá el usuario
		int horas;
		int minutos;
		int segundos;
		
		// Creamos la variable "segundosSuma" donde guardaremos la cantidad de segundos a sumar
		int segundosSuma;
		
		// Hacemos un do-while para asegurarnos que el valor introducido es correcto
		do {
		
			// Le pedimos la cantidad de horas
			System.out.println("Introduzca la cantidad de horas");
			
			// Introducimos el valor recibido en "horas"
			horas = sc.nextInt();
		
		// Si el valor es incorrecto (menor a 0, o mayor o igual a 24), se repetirá
		} while (horas < 0 || horas >= 24);
		
		// Hacemos un do-while para asegurarnos que el valor introducido es correcto
		do {
			
			// Pedimos al usuario que introduzca la cantidad de minutos
			System.out.println("Introduzca la cantidad de minutos");
			
			// Introducimos el valor recibido en "minutos"
			minutos = sc.nextInt();
		
		// Se repetirá mientras el valor sea incorrecto (menor que 0 o mayor que 60)
		} while (minutos < 0 || minutos > 59);
		
		// Hacemos un do-while para asegurarnos que el valor introducido es correcto
		do {
			
			// Pedimos al usuario que introduzca la cantidad de segundos
			System.out.println("Introduzca la cantidad de segundos");
			
			// Introducimos el valor recibido en "segundos"
			segundos = sc.nextInt();
		
		// Se repetirá mientras el valor sea incorrecto (menor que 0 o mayor que 60)
		} while (segundos < 0 || segundos > 59);
		
		// Le mostramos al usuario la hora actual
		System.out.println("La hora actual es: " + horas + ":" + minutos + ":" + segundos);
		
		// Le pedimos que introduzca la cantidad de segundos a sumar
		System.out.println("Introduzca ahora la cantidad de segundos a incrementar");
		
		// Introducimos el valor recibido en "segundosSuma"
		segundosSuma = sc.nextInt();

		/* Creamos un bucle for, con el contador i el cual incrementará 
		 * cada iteración, y esta se repetirá mientras i sea menor a los 
		 * segundos a sumar, también incrementamos los segundos */
		for (int i = 0 ; i < segundosSuma ; i++) {

			segundos++;
			
			// Si los segundos son iguales a 60 entramos al condicional
			if (segundos >= 60) {
				
				// Reiniciamos la cantidad de segundos
				segundos = 0;
				
				// Incrementamos los minutos
				minutos++;

			}
			
				
			// Si los minutos son iguales a 60 entramos al condicional
			if (minutos == 60) {
				
				// Incrementamos las horas
				horas++;
				
				// Reiniciamos los minutos
				minutos = 0;
				
			}
				
				
		}
		
		// Le mostramos la nueva hora al usuario
		System.out.println("La hora actual es: " + horas + ":" + minutos + ":" + segundos);

		// Cerramos el scanner
		sc.close();

	}

}
