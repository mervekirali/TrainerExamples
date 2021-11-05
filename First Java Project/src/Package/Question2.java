package Package;

//Write a program to display the first 25 Fibonacci numbers beginning at 0.
//The Fibonacci series is a series where the next term is the sum of the previous two terms.
/*Algorithm: we used for loop to 
 * print the first term of the series
 * compute next term by adding first term and second term
 * assign value of second term to first term and next term to second term 
 */



public class Question2 {
	//public static void main(String[] args) {
	public void Fibo(int n)	{
		//int n = 25, 
		int firstTerm = 0, secondTerm = 1;
		
		System.out.println("Fibonacci Series till " + n + " terms:");
		
		for (int i = 1; i <= n; ++i) {
			
			System.out.print(firstTerm + ", ");
			
			
			//compute the next term
			
			int nextTerm = firstTerm + secondTerm;
			
		    firstTerm = secondTerm;
		    
		    secondTerm = nextTerm;
		}
		}
		
	}
//}




//	Q2 f = new Q2();
//
//f.Fib(25);