package Package;



import java.util.Arrays;


public class Driver {
	
	public static void main(String[] args) {
		
		
		//Question 1
		int[] data = { 1,0,5,6,3,2,3,7,9,8,4 };
		
		Question1.bubbleSort(data);
	
		System.out.println("Sorted Array in Ascending Order: "); 
		
		System.out.println(Arrays.toString(data)); 
		
		
		
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
		
		//Question 6
		Question6 even = new Question6();
		
		even.isEven(0);
		
		
		//Question 7
		Question7 q7 = new Question7();
		q7.Compare();
		
		
		//Question 8
		Question8.Palindrome();
		
		
		//Question 9
		Question9.Prime();		
				
		
		//Question 10
		Question10 qten = new Question10();
		qten.Compare(8, 9);
		
		
		//Question 11
		Question11 q11 = new Question11();
		q11.printNums();
		
		
		//Question 12
		Question12 q12 = new Question12();
		q12.evenNumber();
		
		
		//Question 13
		Question13 q13 = new Question13();
		q13.triangle();
		
		
		//Question 14
		Question14 q14 = new Question14();
		q14.swtch();
		
		
		//Question 15
		OperationsMainClass15 q15 = new OperationsMainClass15();
		q15.calcMachine();
		
		
		//Question 16
		if (args.length > 0)
			System.out.println(args[0].length());
		
		
		//Question 17
		Question17 q17 = new Question17();
		q17.calcInterest();
		
		
		//Question 18
		Question18_Subclass q18 = new Question18_Subclass();
		System.out.println(q18.hasUppercaseLetter("Merve Kirali"));
		System.out.println(q18.hasUppercaseLetter("training"));
		System.out.println(q18.hasUppercaseLetter("such a beautiful day"));
		System.out.println(q18.hasUppercaseLetter("SUCH A BEAUTIFUL DAY"));
		
		System.out.println(q18.toUpperCase("where is earth"));
		
		System.out.println(q18.stringToInt("Mia"));
		
		
		//Question 19
		Question19 q19 = new Question19();
		q19.arrayListPrimes();
		
		
		//Question 20
		Question20 q20 = new Question20();
		q20.loadData();
	
		
		
		}

	
	}	

