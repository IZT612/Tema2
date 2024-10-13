package parte3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Se necesitan minimo 6 casos, 3 para poner las horas, minutos y segundos erroneos, y los otros 3 casos posibles si los datos son correctos
		
		/* Prueba 1 
		 * 
		 * Valores de entrada ---> -2 horas  2 minutos 2 segundos
		 * Respuesta esperada ---> "Las horas introducidas son erróneas"
		 * Respuesta obtenida ---> "Las horas introducidas son erróneas"
		 */
		
		/* Prueba 2 
		 * 
		 * Valores de entrada ---> 2 horas  -2 minutos 2 segundos
		 * Respuesta esperada ---> "Los minutos introducidos son erróneos"
		 * Respuesta obtenida ---> "Los minutos introducidos son erróneos"
		 */
		
		/* Prueba 3
		 * 
		 * Valores de entrada ---> 2 horas  2 minutos -2 segundos
		 * Respuesta esperada ---> "Los minutos introducidos son erróneos"
		 * Respuesta obtenida ---> "Los minutos introducidos son erróneos"
		 */
		
		/* Prueba 4
		 * 
		 * Valores de entrada ---> 2 horas  2 minutos 2 segundos
		 * Respuesta esperada ---> "Las horas, minutos y segundos quedan así: 2 horas, 2 minutos y 3 segundos"
		 * Respuesta obtenida ---> "Las horas, minutos y segundos quedan así: 2 horas, 2 minutos y 3 segundos"
		 */
		
		/* Prueba 5
		 * 
		 * Valores de entrada ---> 2 horas  2 minutos 59 segundos
		 * Respuesta esperada ---> "Las horas, minutos y segundos quedan así: 2 horas, 3 minutos y 0 segundos"
		 * Respuesta obtenida ---> "Las horas, minutos y segundos quedan así: 2 horas, 3 minutos y 0 segundos"
		 */
		
		/* Prueba 6
		 * 
		 * Valores de entrada ---> 2 horas  59 minutos 59 segundos
		 * Respuesta esperada ---> "Las horas, minutos y segundos quedan así: 3 horas, 0 minutos y 0 segundos"
		 * Respuesta obtenida ---> "Las horas, minutos y segundos quedan así: 3 horas, 0 minutos y 0 segundos"
		 */

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable entera "horasUser" que guardará las horas que introduzca el usuario
		int horasUser;
		
		// Creamos la variable entera "minutosUser" que guardará los minutos que introduzca el usuario
		int minutosUser;
		
		// Creamos la variable entera "segundosUser" que guardará los segundos que introduzca el usuario
		int segundosUser;
		
		// Creamos la variable entera "horas" donde guardaremos las horas finales 
		int horas;
		
		// Creamos la variable entera "minutos" donde guardaremos los minutos finales 
		int minutos;
		
		// Creamos la variable entera "segundos" donde guardaremos los segundos finales 
		int segundos;
		
		// Le pedimos al usuario que introduzca las horas
		System.out.println("Introduzca las horas");
		
		// Introducimos el valor recibido en la variable "horasUser"
		horasUser = sc.nextInt();
		
		// Le pedimos al usuario que introduzca los minutos
		System.out.println("Introduzca los minutos");
		
		// Introducimos el valor recibido en la variable "minutosUser"
		minutosUser = sc.nextInt();
		
		// Le pedimos al usuario que introduzca los segundos
		System.out.println("Introduzca los segundos");
		
		// Introducimos el valor recibido en la variable "segundosUser"
		segundosUser = sc.nextInt();
		
		// Pasamos todos los datos introducidos por el usuario a sus variables definitivas
		horas = horasUser;
		minutos = minutosUser;
		segundos = segundosUser;
		
		// Comprobamos uno a uno si alguno de los numeros introducidos fue erróneo, primero con las horas
		if (horas < 0 ) {
			
			System.out.println("Las horas introducidas son erróneas");
			
		// Luego con los minutos
		} else if (minutos < 0 || minutos > 59) {
			
			System.out.println("Los minutos introducidos son erróneos");
			
		// Y finalmente con los segundos
		} else if (segundos < 0 || segundos > 59) {
			
			System.out.println("Los segundos introducidos son erróneos");
			
		// En caso de estar todo correcto podemos proceder
		} else {
			
			// Comprobamos si los segundos son 59
			if (segundos == 59) {
				
				// Si es el caso, comprobamos si los minutos también lo son
				if (minutos == 59 ) {
					
					// Si es el caso sumamos una hora, y establecemos el resto como 0
					horas = horas + 1;
					minutos = 0;
					segundos = 0;
					
				// Si no, simplemente sumamos un minuto y establecemos los segundos como 0
				} else {
					
					minutos = minutos + 1;
					segundos = 0;
					
				}
				
			// Si los segundos no son 59, simplemente sumamos 1 a los segundos
			} else {
				
				segundos = segundos + 1;
				
			}
			
			// Le mostramos al usuario el resultado final
			System.out.println("Las horas, minutos y segundos quedan así: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}	

}
