
//Write a program to compute N factorial

package Package;

public class Question4 {
	
	public void NFactorial(int n) {
		
		int num = n;
		
		long NFactorial = 1;
		
		for (int i = 1; i <= num; i++) {
			
			NFactorial *= i;
			
		}
		
		System.out.println("the factorial of " + num + " is " + NFactorial);
			
	
}
	
}
