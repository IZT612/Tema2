package parte6;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos una variable "num" donde guardamos los números que comprobaremos si son impares o pares
		int num = 0;
		
		// Creamos una variable "sumaTotal" donde guardaremos la suma de los números que necesitemos (los impares)
		int sumaTotal = 0;
		
		/* Creamos un bucle for con un contador "i" con valor 10, el cual 
		 * se repetirá mientras que "i" no sea 0, sin incremento ni 
		 * reducción ya que no siempre se da, solo en un caso */
		for (int i = 10 ; i != 0 ; ) {
			
			// Incrementamos el número
			num++;
			
			// Comprobamos si el número es impar
			if (num % 2 != 0) {
				
				// Si es el caso lo sumamos a "sumaTotal"
				sumaTotal += num;
				
				// Reducimos el contador
				i--;
				
			}
			
		}
		
		// Mostralos la suma total de los números impares
		System.out.println("La suma de todos los números impares da como resultado " + sumaTotal);
		
	}

}
