package parte4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero;
		
		// Creamos la variable "contador" donde guardaremos los numeros que ha introducido el usuario
		int contador = 0;
		
		// Creamos la variable "sumaPositivos" y lo igualamos a 0, aquí guardaremos la suma de los números positivos
		int sumaPositivos = 0;
		
		// Creamos la variable "sumaNegativos" y lo igualamos a 0, aquí guardaremos la suam de los números negativos
		double sumaNegativos = 0;
		
		// Creamos la variable "contadorNegativos" y lo igualamos a 0, aquí guardaremos la cantidad de números negativos introducidos
		int contadorNegativos = 0;
		
		// Creamos la variable "contadorCeros" y lo igualamos a 0, aquí guardaremos la cantidad de ceros que ha introducido el usuario
		int contadorCeros = 0;
		
		// Le informamos al usuario como funciona el programa y le pedimos que introduzca uno 
		System.out.println("Introduzca un número, podrá introducir hasta 10 números, los positivos se sumarán, con los negativos se hará una media, y los ceros se contarán");

		// Introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Aumentamos el contador ya que este sería el primer número
		contador++;
		
		// Creamos un bucle mientras el contador sea menor a 10
		while (contador < 10) {
			
			// Aumentamos el contador
			contador++;
			
			// Si el número es positivo entramos al condicional
			if (numero > 0) {
				
				// Y sumamos el número a la variable "sumaPositivos"
				sumaPositivos += numero;
			
			// Si el número es negativo entramos al condicional
			} else if (numero < 0) {
				
				// Aumentamos el contador de números negativos
				contadorNegativos++;
				
				// Sumamos el número a "sumaNegativos"
				sumaNegativos += numero;
				
			// La única opción que queda es que sea 0
			} else {
				
				// Aumentamos el contador de ceros
				contadorCeros++;
				
			}
			
			// Le pedimos al usuario que introduzca otro numero
			System.out.println("Introduzca otro número, recuerde que los positivos se sumarán, con los negativos se hará una media, y los ceros se contarán");

			// Introducimos el valor recibido en "numero"
			numero = sc.nextInt();
			
		}
		
		// Si la suma de positivos es igual a 0 entramos al condicional
		if (sumaPositivos == 0) {
			
			// Informamos al usuario que no ha introducido números positivos
			System.out.println("No se han introducido números positivos");
			
		// Si no, procedemos con normalidad
		} else {
			
			// Le mostramos al usuario la suma de los positivos
			System.out.println("La suma de todos los positivos es: " + sumaPositivos);
			
		}
		
		// Si la suma de negativos es igual a 0 entramos al condicional
		if (sumaNegativos == 0) {
			
			// Le informamos al usuario que no ha introducido números negativos
			System.out.println("No se han introducido números negativos");
			
		//Si no, procedemos con normalidad
		} else {
			
			// Le mostramos al usuario la media de todos los números negativos introducidos 
			System.out.println("La media de los negativos es: " + (sumaNegativos / contadorNegativos));

		}
		
		// Si el contador de ceros es 0 entramos al condicional
		if (contadorCeros == 0) {
			
			// Le informamos al usuario que no ha introducido ceros
			System.out.println("No se han introducido ceros");
			
		// Si no, procedemos con normalidad
		} else {
			
			// Y le mostramos al usuario cuantos ceros ha introducido
			System.out.println("Se han introducido " + contadorCeros + " ceros");

		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
