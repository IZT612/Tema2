package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos el proceso para generar numeros aleatorios
		Random random = new Random();
		
		// Creamos la variable "numero" donde guardaremos el numeo que genere el programa
		int numero;
		
		// Creamos la variable "mayorQue" donde guardaremos el último número que nos mostró el programa al que nuestro número es mayor
		int mayorQue = 0;
		
		// Creamos la variable "menorQue" donde guardaremos el último número que nos mostró el programa al que nuestro número es menor
		int menorQue = 101;
		
		// Creamos la variable "respuesta" donde guardaremos la respuesta del usuario
		String respuesta;
		
		// Creamos un do-while
		do {
			
			// Generamos un número aleatorio entre "mayorQue" y "menorQue" e introducimos el valor en "numero"
			numero = random.nextInt(mayorQue,menorQue);
			
			// Si el número generado es igual al mínimo que puede salir entramos al if
			if (numero == mayorQue) {
				
				// Y le sumamos 1, ya que en teoría debería ser mayor que el número más pequeño posible generado aleatoriamente
				numero = mayorQue + 1;
				
			}
			
			// Le mostramos al usuario el número generado por el programa
			System.out.println("¿" + numero + "?");
			
			// Guardamos la respuesta del usuario en "respuesta"
			respuesta = sc.nextLine();
			
			// Creamos un if donde vemos si la respuesta es "menor"
			if (respuesta.equalsIgnoreCase("menor")) {
				
				// Si es el caso, el número pensado por el usuario debe ser mayor ya que el número generado por el programa es menor, guardamos el valor del número en "mayorQue"
				mayorQue = numero;
				
			}
			
			// Creamos un if donde vemos si la respuesta es "menor"
			if (respuesta.equalsIgnoreCase("mayor")) {
				
				// Si es el caso guardamos el número en "meorQue"
				menorQue = numero;
				
			}
			
		// El bucle se repite mientras la respuesta no sea igual y mientras la diferencia entre "menorQue" y "mayorQue" no sea 1
		} while (!respuesta.equalsIgnoreCase("igual") && (menorQue - mayorQue) != 1);
		
		// Si la diferencia entre "menorQue" y "mayorQue" es 1, significa que el jugador ha hecho trampas cambiando el número durante la partida, ya que no quedan posibilidades
		if ((menorQue - mayorQue) == 1) {
			
			// Le informamos al jugador que ha hecho trampas
			System.out.println("No se vale hacer trampas (o quizás se equivocó)");
			
		// Si no es el caso, significa que la respuesta fue igual, y por ende, el programa acertó
		} else {
			
			// Notificamos al usuario que el programa ha adivinado
			System.out.println("¡Adiviné!");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
