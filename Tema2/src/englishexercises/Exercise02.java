package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// We create the scanner
		Scanner sc = new Scanner(System.in);
		
		// We create the variable "number", where we'll store the number introduced by the user
		int number;
		
		// We create the variable "multiplier", which will increase everytime we use it in the loop
		int multiplier = 1;

		// We ask the user for a number
		System.out.println("Introduce a number to show the multiplication table of it");
		
		// We store the number in the variable "number"
		number = sc.nextInt();
		
		// We create a loop where the multiplier will increase everytime until it's bigger than 10, showing the multiplication table of it
		while (multiplier <= 10) {
			
			System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
			
			multiplier++;
			
		}
		
		// We close the scanner
		sc.close();

	}

}
