//Write a program that would access two float-variables from a class that exists in another
//package. Note, you will need to create two packages to demonstrate the solution.



//Question 11
package Package;

import AnotherPackage.*;

	
	public class Question11 {
		
		
		NumbersClass test = new NumbersClass();
		float otherPackNum1 =  test.num1;
		float otherPackNum2 = test.num2;
		
		public void printNums() {
			System.out.println(otherPackNum1 + " " + otherPackNum2);
		}

	  

	}

	
