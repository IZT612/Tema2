package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		// We create the scanner
		Scanner sc = new Scanner(System.in);
		
		// We create the variable "height" where we'll store the height introduced by the user
		int height;
		
		// We create the variable "maxHeight" where we'll store the tallest height
		int maxHeight = Integer.MIN_VALUE;
		
		// We create the variable "minHeight" where we'll store the shortest height
		int minHeight = Integer.MAX_VALUE;
		
		// We ask the user to insert a height
		System.out.println("Insert the height of a student");
		
		// We store the height introduced in the variable "height"
		height = sc.nextInt();
		
		// We create a loop in which we'll enter if the height doesn't equal zero
		while (height != 0) {
			
			// If the height is higher than the current tallest height, we store it in the "maxHeight" variable
			if (height > maxHeight) {
				
				maxHeight = height;
				
			}
			
			// And now we check if the height is lower thant the current lowest height
			if (height < minHeight) {
				
				minHeight = height;
				
			}
		
			// We ask the user to introduce a height again
			System.out.println("Insert the height of a student");
			
			// We store it in the variable "height"
			height = sc.nextInt();
			
		}
			
		
		//
		
		if (maxHeight == Integer.MAX_VALUE) {
			
			System.out.println("You didn't insert any height");
			
		} else {
		
			System.out.println("The lowest height is " + minHeight);
			System.out.println("The tallest height is " + maxHeight);
		
		}
		
		sc.close();

	}

}
