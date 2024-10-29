package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// The scanner is created
		Scanner sc = new Scanner(System.in);
		
		// We start the variable "number" to store the user's input
		int number;
		
		// We ask the user to write a number
		System.out.println("Write a number to know if it's even or odd, write a negative number to close the program");
		
		// We store the number entered in the variable "number"
		number = sc.nextInt();
		
		// We create a loop if the number is equal or greater than zero
		while (number >= 0) {
			
			// If the module of the number and two equals zero, it means that the number is even
			if ((number % 2) == 0) {
				
				// We show the result to the user
				System.out.println("The number " + number + " is even");
				
			// If it's not zero, then it's an odd number
			} else {
				
				// We show the result to the user
				System.out.println("The number " + number + " is odd");
				
			}
			
			// We ask him for a number again
			System.out.println("Write a number again to know if it's even or odd, write a negative number to close the program");
			
			//And we store the number inside the variable "number"
			number = sc.nextInt();
		}
		
		// Once the loop is finished, we show the user that this is the end of the program
		System.out.println("End of program");
		
		// We close the scanner
		sc.close();

	}

}
