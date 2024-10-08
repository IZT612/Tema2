package parte1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable donde guardaremos el valor de "a"
		int valorA;
		
		// Creamos la variable donde guardaremos el valor de "b"
		int valorB;
		
		// Creamos la variable donde guardaremos el valor de "c"
		int valorC;
		
		// Creamos la variable donde guardaremos el resultado tras seguir la suma en la ecuación
		double resultado1;
		
		// Creamos la variable donde guardaremos el resultado tras seguir la resta en la ecuación
		double resultado2;
		
		// Le pedimos al usuario que introduzca el valor de "a"
		System.out.println("Introduzca el valor de 'a' para calcular x");
		
		// Introducimos el valor recibido en la variable valorA
		valorA = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el valor de "b"
		System.out.println("Introduzca el valor de 'b'");
		
		// Introducimos el valor recibido en la variable valorB
		valorB = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el valor de "c"
		System.out.println("Introduzca el valor de 'c'");
		
		// Introducimos el valor recibido en la variable valorC
		valorC = sc.nextInt();
		
		// Verificamos si la parte que se encuentra en la raíz cuadrada es menor a cero, es decir, es negativo
		if ((valorB * valorB - 4 * valorA * valorC) < 0) {
			
			// En caso de ser así, no se podrá completar la ecuación por lo que se lo notificamos al usuario
			System.out.println("Se ha encontrado un error durante la ecuación: No se puede hacer la raíz cuadrada de un número negativo");
			
		// Si se puede continuar, verificamos ahora si "a" es igual a 0, ya que en ese caso puede ser una ecuación de primer grado o no ser una ecuación si quiera
		} else if (valorA == 0) {
			
			// Si el valor de b también es 0, solo quedaría c, que es un número sin más
			if (valorB == 0) {
				
				// Notificamos al usuario que ni si quiera es una ecuación
				System.out.println("Esto ni si quiera es una ecuación, es solo... un número... el " + valorC + "...");
				
				// Si b no es 0, es una ecuación de primer grado
			} else {
				
				// Calculamos el resultado en esta ecuación de primer grado
				resultado1 = -valorC / valorB;
				
				// Se lo notificamos al usuario, justificando que no sería una ecuación de segundo grado
				System.out.println("Esto ni si quiera es una ecuación de segundo grado, sin embargo el resultado es: x = " + resultado1);
				
			}
			
		// Si no hay anomalías, calculamos todo de forma normal
		} else {
			
			// Calculamos la ecuación siguiendo la suma y lo introducimos en la variable resultadoPositivo
			resultado1 = ((-valorB + Math.sqrt(valorB * valorB - 4 * valorA * valorC )) / (2 * valorA));
			
			// Calculamos la ecuación siguiendo la resta y lo introducimos en la variable resultadoNegativo	
			resultado2 = ((-valorB - Math.sqrt(valorB * valorB - 4 * valorA * valorC )) / (2 * valorA));
			
			// Le mostramos al usuario el resultado obtenido siguiendo la suma como x1
			System.out.println("x1 = " + resultado1);
			
			// Le mostramos al usuario el resultado obtenido siguiendo la resta como x2
			System.out.println("x2 = " + resultado2);
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
