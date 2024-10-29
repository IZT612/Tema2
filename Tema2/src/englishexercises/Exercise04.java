package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int randomNumber = (int) (Math.random() * 100);
		
		if (randomNumber == 0) {
			
			randomNumber++;
			
		}
		
		int userNumber;
		
		System.out.println("Insert a number and try to guess the random number");
		
		userNumber = sc.nextInt();
		
		while (userNumber >= 1 && userNumber <= 100 && userNumber != randomNumber) {
			
			if (userNumber < randomNumber) {
				
				System.out.println("The secret number is greater than " + userNumber);
				
			} else {
				
				System.out.println("The secret number is lower than " + userNumber);

			}
			
			System.out.println("Introduce another number");
			
			userNumber = sc.nextInt();
			
		}
		
		if (userNumber == randomNumber) {
			
			System.out.println("You guessed the number, it was " + randomNumber);
			
		} else {
			
			System.out.println("You gave up, the number was " + randomNumber);
			
		}
		
		sc.close();
		

	}

}
