//Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers
//from the array. Use the enhanced FOR loop for printing out the numbers.

package Package;

public class Question12 {
	 //public static void main(String[] args) {
	 public void evenNumber()   { 
	       int number [] = new int[100];
	      
	       //Storing 1 to 100 in Array
	       for (int i=1; i<=100; i++) {
	           number [i-1] = i;
	       }
	       
	       System.out.println("Even numbers from 1-100:");
	      
	       //Showing Even Number using For Each Loop
	       for (int j:number) {
	           if(j%2 == 0)
	        	   
	               System.out.println(j);
	       }
}
}
