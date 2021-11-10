//Write a program to determine if an integer is even without using the modulus operator (%)

package Package;

import java.util.Scanner;

public class Question6 {
	
	public void isEven(int number) {
		
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter an integer to see if it is even or not : ");
	
	number = scan.nextInt();
	
	
	
	
	int quotient = number/2;
	
	if (quotient*2 == number) {
		
		System.out.println("Even number");
		
	}
	}
	

}
