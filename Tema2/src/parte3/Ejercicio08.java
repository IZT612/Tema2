package parte3;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Necesitamos minimo 4 casos, 2 con el mes de febrero en un año bisiesto y otro que no lo es, otro con un mes cualquiera independientemente del año, y otro con un mes incorrecto
		
		/* Prueba 1
		 * 
		 * Valores de entrada ---> mes 4 año 1
		 * Resultado esperado ---> "El mes introducido tiene 30 días"
		 * Resultado obtenido ---> "El mes introducido tiene 30 días"
		 */
		
		/* Prueba 2
		 * 
		 * Valores de entrada ---> mes 2 año 1
		 * Resultado esperado ---> "El mes introducido tiene 28 días"
		 * Resultado obtenido ---> "El mes introducido tiene 28 días"
		 */
		
		/* Prueba 3
		 * 
		 * Valores de entrada ---> mes 2 año 4
		 * Resultado esperado ---> "El mes introducido tiene 29 días"
		 * Resultado obtenido ---> "El mes introducido tiene 29 días"
		 */
		
		/* Prueba 4
		 * 
		 * Valores de entrada ---> mes 13 año 1
		 * Resultado esperado ---> "El mes introducido es incorrecto"
		 * Resultado obtenido ---> "El mes introducido es incorrecto"
		 */
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos una variable entera "mes" para guardar el número del mes que introduzca el usuario
		int mes;
		
		// Creamos una variable entera "año" para guardar el año que introduzca el usuario
		int año;
		
		// Creamos una variable entera "cantidadDias" para guardar la cantidad de dias que tiene el mes que el usuario introdujo
		int cantidadDias;
		
		// Creamos un booleano que indica si el año es bisiesto
		boolean bisiesto;
		
		// Le pedimos al usuario que introduzca el número del mes del que desea saber la cantidad de dias
		System.out.println("Introduzca el número del mes del que desea saber la cantidad de días");
		
		// Guardamos el valor recibido en la variable "mes"
		mes = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el año
		System.out.println("Introduzca el año también");
		
		// Guardamos el valor recibido en la variable "año"
		año = sc.nextInt();
	
		// Primero comprobamos si el año es divisible entre 100, esto se debe a que cuando un año es divisible entre 100 hay una pequeña excepción para saber si es bisiesto o no
		if ((año % 100) == 0) {
			
			// Si lo es, le damos al boolean bisiesto el resultado tras comprobar si el año es divisible entre 4 y 400 a la vez
			bisiesto = ((año % 4) == 0  && (año % 400 == 0));
			
		// Si no es divisible entre 100, comprobamos si es bisiesto o no como de costumbre
		} else {
			
			// Comprobando si es divisible entre 4 únicamente
			bisiesto = (año % 4) == 0;
			
		}
		
		// Creamos un switch con "mes" el cual dará distintos valores a "cantidadDias"
		cantidadDias = switch (mes) {
		
		// Si es el primer mes, enero tiene 31 días
		case 1 -> {
			yield 31;
		}
		
		// Si es el segundo mes, febrero tiene 28 días en años normales, y 29 en años bisiestos
		case 2 -> {
			if (bisiesto) {
				yield 29;
			}	else {
			yield 28;
		}
		}
		
		// Si es el tercer mes, marzo tiene 31 días
		case 3 -> {
			yield 31;
		}
		
		// Si es el cuarto mes, abril tiene 30 días
		case 4 -> {
			yield 30;
		}
		
		// Si es el quinto mes, mayo tiene 31 días
		case 5 -> {
			yield 31;
		}
		
		// Si es el sexto mes, junio tiene 30 días
		case 6 -> {
			yield 30;
		}
		
		// Si es el septimo mes, julio tiene 31 dias
		case 7 -> {
			yield 31;
		}
		
		// Si es el octavo mes, agosto tiene 31 dias
		case 8 -> {
			yield 31;
		}
		
		// Si es el noveno mes, septiembre tiene 30 dias
		case 9 -> {
			yield 30;
		}
		
		// Si es el decimo mes, octubre tiene 31 dias
		case 10 -> {
			yield 31;
		}
		
		// Si es el undécimo mes, octubre tiene 30 dias
		case 11 -> {
			yield 30;
		}
		
		// Si es el duodecimo mes, diciembre tiene 31 dias
		case 12 -> {
			yield 31;
		}
		
		// Si no es ninguno de los anteriores, le aplicamos 0 para indicar error más adelante
		default -> {
			yield 0;
		}
	
		};
		
		// Si la cantidad de días es 0, el mes introducido debe haber sido erroneo
		if (cantidadDias == 0) {
			
			// Se lo indicamos al usuario
			System.out.println("El mes introducido es incorrecto");
			
		// Si no, procedemos
		} else {
			
			// Le mostramos al usuario la cantidad de dias que tiene el mes introducido en el año introducido
			System.out.println("El mes introducido tiene " + cantidadDias + " días");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
