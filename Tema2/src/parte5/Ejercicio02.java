package parte5;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos la variable del numero que mostraremos y aumentaremos proximamente
		int num = 1;
		
		// Creamos un do-while 
		do {
			
			// Si el numero es par entramos al condicional
			if ((num % 2) == 0) {
				
				// Mostramos el numero
				System.out.println(num);
				
			}
			
		// Incrementamos el numero
		++num;
			
		// Repetimos mientras el número sea menor o igual a 200
		} while (num <= 200);

	}

}