package Package;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		
		
		//Question 1
		int[] data = { 1,0,5,6,3,2,3,7,9,8,4 };
		
	
		//Call method using class name
		Question1.bubbleSort(data);
	
		
		System.out.println("Sorted Array in Ascending Order: "); 
		
		System.out.println(Arrays.toString(data)); //The toString() method returns the String representation of the object.
		//otherwise it returns the place where it is stored.
		
		
		//Question 2 
		Question2 Fi = new Question2();
		
		Fi.Fibo(25);
		
		
		
		
		
		//Question 3
		Question3 str = new Question3();
		
		String s = "why";
		
		System.out.print("\n");
		
		System.out.println(str.myString
						  (s.toCharArray(), 0, 2 ));
		
		
		
		//Question 4
		Question4 fact = new Question4();
		
		fact.NFactorial(10);
		
		
		
		//Question 5
		Question5 subStr = new Question5();
		
		subStr.subString("SpaceX", 5);
		subStr.subString("10291923", 4);
		
		
		
		
		
		
		
	}	
}
