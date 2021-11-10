/*Write a program having a concrete ;subclass that inherits three abstract methods from a
superclass. Provide the following three implementations in the subclass corresponding to the
abstract methods in the superclass:
1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if
any are found.
2. Convert all of the lower case characters to uppercase in the input string, and return
the result.
3. Convert the input string to integer and add 10, output the result to the console.
Create an appropriate class having a main method to test the above setup.*/


package Package;

import java.util.Scanner;

public class Question18 extends Q18StringAbstract{
	public Question18(String myString) {

        this.myString = myString;
    }

    @Override
    public boolean isUpperCase() {
        String lowerString = myString.toLowerCase();
        //this checks if when myString is casted to lowercase
        boolean equal = lowerString.equals(myString);

        //if they are equal then myString doesn't have uppercase letters
        if(equal){
            return false;
        }else{
            //if they are not equal then myString did have upper case letters
            return true;
        }
    }

    @Override
    public String convertToUpper() {
        //this just cast myString to all uppercase letters
        return myString.toUpperCase();
    }

    @Override
    public int convertToInt() {
        int num = 10;
        //since a string is scanned to add an integer to the string
        //type cast character by character
        for(int i = 0; i<myString.length();i++){
            num = num + (int)myString.charAt(i);
        }
        return num;
    }
}

	


