package parte3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Se deben hacer minimo 8 pruebas, para cuando el valor no está entre 0 y 9999, y por si el número es capicúa o no con todas las cifras posibles, 1, 2, 3 y 4
		/* Prueba 1
		 * 
		 * Valor de entrada ---> 99999
		 * Resultado esperado ---> "El número introducido no está entre 0 y 9999"
		 * Resultado obtenido ---> "El número introducido no está entre 0 y 9999"
		 */ 

		/* Prueba 2
		 * 
		 * Valor de entrada ---> 8
		 * Resultado esperado ---> "El número introducido: 8 es capicúa debido a que es tan solo de un dígito"
		 * Resultado obtenido ---> "El número introducido: 8 es capicúa debido a que es tan solo de un dígito"
		 */

		/* Prueba 3
		 * 
		 * Valor de entrada ---> 18
		 * Resultado esperado ---> "El número introducido: 18 no es capicúa"
		 * Resultado obtenido ---> "El número introducido: 18 no es capicúa"
		 */

		/* Prueba 4
		 * 
		 * Valor de entrada ---> 44
		 * Resultado esperado ---> "El número introducido: 44 es capicúa"
		 * Resultado obtenido ---> "El número introducido: 44 es capicúa"
		 */

		/* Prueba 5
		 * 
		 * Valor de entrada ---> 983
		 * Resultado esperado ---> "El número introducido: 983 no es capicúa"
		 * Resultado obtenido ---> "El número introducido: 983 no es capicúa"
		 */

		/* Prueba 6
		 * 
		 * Valor de entrada ---> 181
		 * Resultado esperado ---> "El número introducido: 181 es capicúa"
		 * Resultado obtenido ---> "El número introducido: 181 es capicúa"
		 */

		/* Prueba 7
		 * 
		 * Valor de entrada ---> 1987
		 * Resultado esperado ---> "El número introducido: 1987 no es capicúa"
		 * Resultado obtenido ---> "El número introducido: 1987 no es capicúa"
		 */

		/* Prueba 8
		 * 
		 * Valor de entrada ---> 4994
		 * Resultado esperado ---> "El número introducido: 4994 es capicúa"
		 * Resultado obtenido ---> "El número introducido: 4994 es capicúa"
		 */

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "numero" donde guardaremos el numero que el usuario introduzca
		int numero;
		
		// Le pedimos al usuario que introduzca un numero 
		System.out.println("Introduzca un número entre 0 y 9999 para indicarle si es capicúa o no");
		
		// Leemos el teclado e introducimos el valor recibido en la variable "numero"
		numero = sc.nextInt();
		
		// Primero comprobamos si el número esta entre 0 y 9999
		if (numero > 9999 || numero < 0 ) {
			
			// Si es el caso, se lo informamos al usuario
			System.out.println("El número introducido no está entre 0 y 9999");
			
		// Si no, podemos seguir con normalidad, cmprobando si el número es de un solo digito
		} else if (numero < 10) {
			
			// Si es de un solo digito es capicúa obligatoriamente, por lo que se lo notificamos al usuario
			System.out.println("El número introducido: " + numero + " es capicúa debido a que es tan solo de un dígito");
			
		// Si no, verificamos si el número tiene 2 cifras
		} else if (numero >= 10 && numero < 100) {
			
			// Comprobamos si la primera y última cifra son iguales 
			if ((numero / 10) == (numero % 10)) {
				
				// Si es el caso, será capicúa, asi que se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " es capicúa");
				
			// Si no, no es capicúa
			} else {
				 // Se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " no es capicúa");
				
			}
			
		// Si no, comprobamos si  el número tiene 3 cifras
		} else if (numero >= 100 && numero < 1000) {
			
			// Si el primer y último número son iguales serán capicúa independientemente del numero intermedio
			if ((numero / 100) == (numero % 10)) {
				
				// Se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " es capicúa");
				
			// Si no, no será capicúa
			} else {
				
				// Se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " no es capicúa");
				
			}
			
		// La única opción restante es que sea de 4 cifras
		} else {
			
			// Comprobamos si el primer número es igual al último, y si el segundo es igual al tercero
			if ((numero / 1000) == (numero % 10) && ((numero - ((numero / 1000) * 1000)) / 100) == ((numero - ((numero / 100) * 100)) / 10)) {
				
				// Si es el caso, será capicúa, se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " es capicúa");
				
			// Si no, el número no es capicúa
			} else {
				
				// Se lo notificamos al usuario
				System.out.println("El número introducido: " + numero + " no es capicúa");
				
			}
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
