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
		double resultadoPositivo;
		
		// Creamos la variable donde guardaremos el resultado tras seguir la resta en la ecuación
		double resultadoNegativo;
		
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
			
		// Si se puede continuar, verificamos ahora si "a" es igual a 0, ya que en ese caso ni si quiera es una ecuación de segundo grado, además en la ecuación se tendrá que dividir entre 0, cosa que no es posible
		} else if (valorA == 0) {
			
			// Se lo notificamos al usuario, justificando que no sería una ecuación de segundo grado
			System.out.println("Se ha encontrado un error durante la ecuación: 'a' no puede ser 0, ya que si es el caso no es una ecuación de segundo grado, además de que no se puede dividir entre 0");
			
		// En caso de no haber ningun error, podemos continuar con la ecuación
		} else {
			
			// Calculamos la ecuación siguiendo la suma y lo introducimos en la variable resultadoPositivo
			resultadoPositivo = ((-valorB + Math.sqrt(valorB * valorB - 4 * valorA * valorC )) / (2 * valorA));
			
			// Calculamos la ecuación siguiendo la resta y lo introducimos en la variable resultadoNegativo	
			resultadoNegativo = ((-valorB - Math.sqrt(valorB * valorB - 4 * valorA * valorC )) / (2 * valorA));
			
			// Le mostramos al usuario el resultado obtenido siguiendo la suma como x1
			System.out.println("x1 = " + resultadoPositivo);
			
			// Le mostramos al usuario el resultado obtenido siguiendo la resta como x2
			System.out.println("x2 = " + resultadoNegativo);
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
