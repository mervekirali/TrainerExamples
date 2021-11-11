/*Write a program that defines an interface having the following methods: addition,
subtraction, multiplication, and division. Create a class that implements this interface and provides 
appropriate functionality to carry out the required operations. Hard code two operands in a test
class having a main method that calls the implementing class.*/



package Package;


	public class OperationsMainClass15 extends OperationsTestClass15 {

		public void calcMachine() {
	    //public static void main(String[] args) {

	        OperationsTestClass15 calculator = new OperationsMainClass15();
	        double operand1 = 3;
	        double operand2= 4;

	        System.out.println("Numbers are: "+operand1+ " and " +operand2);
	        System.out.println("Addition: "+ calculator.addition(operand1,operand2));
	        System.out.println("Subtraction: "+ calculator.subtraction(operand1,operand2));
	        System.out.println("Multiplication: "+ calculator.multiplication(operand1,operand2));
	        System.out.println("Division: "+ calculator.division(operand1,operand2));
	    }
		}
	


