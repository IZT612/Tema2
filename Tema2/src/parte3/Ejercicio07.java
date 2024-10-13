package parte3;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Mínimo 4 casos, 1 donde ningun requisito del descuento se cumpla, 2 donde solo uno se cumpla, y otro donde todos se cumplan
		
		/* Prueba 1
		 * 
		 * Valores de entrada ---> 2km 1 dia
		 * Resultado esperado ---> "El precio del billete será de 5.0€"
		 * Resultado obtenido ---> "El precio del billete será de 5.0€"
		 */
		
		/* Prueba 2
		 * 
		 * Valores de entrada ---> 2km 8 dias
		 * Resultado esperado ---> "El precio del billete será de 5.0€"
		 * Resultado obtenido ---> "El precio del billete será de 5.0€"
		 */
		
		/* Prueba 3
		 * 
		 * Valores de entrada ---> 802km 1 dia
		 * Resultado esperado ---> "El precio del billete será de 2005.0€"
		 * Resultado obtenido ---> "El precio del billete será de 2005.0€"
		 */
		
		/* Prueba 4
		 * 
		 * Valores de entrada ---> 802km 8 dias
		 * Resultado esperado ---> "El precio del billete será de 1403.5€"
		 * Resultado obtenido ---> "El precio del billete será de 1403.5€"
		 */
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "dias" donde guardaremos los dias de estancia del usuario
		int dias;
		
		// Creamos la variable entera "distancia" donde guardaremos los km que recorrerá el usuario
		int distancia;
		
		// Creamos la variable double "precio" donde guardaremos el precio del billete
		double precio;
		
		// Le pedimos al usuario los kilometros que va a recorrer
		System.out.println("Introduzca los kilometros a recorrer");
		
		// Introducimos el valor recibido en la variable "distancia"
		distancia = sc.nextInt();
		
		// Le pedimos al usuario los dias de estancia
		System.out.println("Introduzca los días de estancia");
		
		// Introducimos el valor recibido en la variable "dias"
		dias = sc.nextInt();
		
		// Calculamos el precio según la distancia a recorrer
		precio = distancia * 2.5;
		
		// Si los días de estancia superan los 7 y recorre más de 800km aplicamos un descuento del 30%
		if (dias > 7 && distancia > 800) {
			
			precio = precio * 0.7;
			
		}
		
		// Le mostramos al usuario el precio de su billete
		System.out.println("El precio del billete será de " + precio + "€");
		
		// Cerramos el scanner
		sc.close();

	}

}
