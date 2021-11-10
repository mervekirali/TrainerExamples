//Write a program that would access two float-variables from a class that exists in another
//package. Note, you will need to create two packages to demonstrate the solution.



//Question 11
package Package;

import AnotherPackage.Class2;

	
	public class Class1 {

	   public static void main(String[] args) {
	       Class2 cls2 = new Class2();
	       System.out.println("Float Variable 1: "+cls2.var1);
	       System.out.println("Float Variable 2: "+cls2.var2);
	   }

	}

	
