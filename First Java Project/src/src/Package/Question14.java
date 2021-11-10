/*Write a program that demonstrates the switch case. Implement the following functionalities in the
cases:java
Case 1: Find the square root of a number using the Math class method.
Case 2: Display today’s date.
Case 3: Split the following string and store it in a string array.
 “I am learning Core Java”
*/



package Package;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question14 {
	
	//public static void main(String[] args) {
		
		public void swtch() {
			
			@SuppressWarnings("resource")
			
			//this is how you would pick the case
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number between 1 to 3");
			int pick = sc.nextInt();
			
			

			//variable for the square root
			int number = 144;
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();

			//switch statement
			switch (pick) {
            	case 1:
            		System.out.println("Square Root of Number: "+number + " is: "+ Math.sqrt(number));
            		break;
            	case 2:
            		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
            		break;
            	case 3: String myString = "I am learning Core Java";
                   	String[] spString = myString.split("");
                   	printArray(spString);
                   	//break;
			}
	

		}
	
		 //print the array sequence
	    static void printArray(String myArray[])
	    {
	        //get array length
	        int n = myArray.length;
	        //iterate through array and print it out
	        for (int i=0; i<n; ++i) {
	            System.out.print(myArray[i] + " ");
	        }
	        System.out.println();
	    }
}

