package Package;

import java.util.Scanner;

public class Q18AbstractMain extends Question18 {
	
	public Q18AbstractMain(String myString) {
        super(myString);
    }

    public static void main(String[] args) {
        String input;
        Question18 userInput;
        Scanner one = new Scanner(System.in);
        System.out.println("Enter String: " );
        while (true) {
            try {
                input = one.nextLine();
                userInput = new Question18(input);
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Please enter numeric value");
            }
        }

        boolean checkUpper = userInput.isUpperCase();
        if(checkUpper){
            System.out.println("1.)" + input + " Does have uppercase Letters");
        }else{
            System.out.println("1.)" +input+" Does NOT have uppercase Letters");
        }

        String toUpper = userInput.convertToUpper();
        System.out.println("2.)" + input + " -> Converted to UpperCase: " + toUpper);

        int addTen = userInput.convertToInt();
        System.out.println("3.)" + input + " + 10 = " + addTen);


    }
	
	

}
