
//Write a program that stores the following strings in an ArrayList and
//saves all the palindromes in another ArrayList.
//“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”, “refer”, “billy”, “did”


package Package;

import java.util.ArrayList;

public class Question8 {


	public static void Palindrome () {
		ArrayList<String> notPalin = new ArrayList<String>();
		ArrayList<String> Palin = new ArrayList<String>();
		
		notPalin.add("karan");
		notPalin.add("madam");
		notPalin.add("tom");
		notPalin.add("civic");
		notPalin.add("radar");
		notPalin.add("jimmy");
		notPalin.add("kayak");
		notPalin.add("john");
		notPalin.add("refer");
		notPalin.add("billy");
		notPalin.add("did");
		System.out.println("Question 8. Array list: " + notPalin);
		
		for (int i = 0; i < notPalin.size(); ++i) {
		
			String str = notPalin.get(i);
			String temp_a = "";
			String temp_b = "";
			int l = str.length();
			int lo = l / 2;
			
			
			for (int j = l - 1; j >= (l - 1 - (lo - 1)); --j) {
				temp_a += str.charAt(j);
			}
			
			
			for (int k = 0; k < lo; ++k) {
				temp_b += str.charAt(k);
			}
			
			
			if (temp_a.equals(temp_b)) {
				Palin.add(notPalin.get(i));
			}
			
			
		}
		System.out.println("Question 8. Palindrome list: " + Palin);
	}

}