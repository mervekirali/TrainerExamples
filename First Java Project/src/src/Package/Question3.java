
//Reversing a string without using temp variable or reverse()

package Package;


public class Question3 {
	
	public String myString(char []str, int start, int end) {
		
		//iterate loop 
		while (start < end) {
			
			//XOR for swapping the variable 
			str[start] ^= str[end];
			str[end] ^= str[start];
			str[start] ^= str[end];
			
			++start;
			--end;
			
		}
		return String.valueOf(str);
	
		
	}
	


	

}
