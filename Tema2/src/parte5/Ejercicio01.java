package parte5;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos la variable del numero que mostraremos y aumentaremos proximamente
		int num = 1;
		
		// Creamos un do-while 
		do {
			
			// Mostramos el numero
			System.out.println(num);
			
			// Lo aumentamos
			++num;
			
		// Repetimos mientras el número sea menor o igual a 20
		} while (num <= 20);

	}

}
