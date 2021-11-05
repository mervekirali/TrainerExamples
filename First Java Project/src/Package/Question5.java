/* Write a substring method that accepts a string str and an integer idx and returns the substring
** contained between 0 and idx-1 inclusive. Without using any of the existing substring methods in
** the String, StringBuilder, or StringBuffer APIs.
*/

package Package;

public class Question5 {
	
	public void subString(String str, int idx) {
		
		String newString = "";
		
		for (int i = 0; i < idx; i++) {
			
			newString += str.charAt(i);
			
		}
		
		System.out.println(newString);
			
	}
	
}
