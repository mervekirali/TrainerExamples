package MyPackage;

public class MyThing {
	
	
	
	/*Ways to name variables and classes in Java:
	 * Camel Case(variables): firstLetterLowerCase
	 * Pascal Case(classes): Capitalize first letter of every word, no spaces
	 * 
	 * Alternate naming strategies
	 * Snake Case: under_scores_seperating_words
	 * Kebab Case: hypens-seperating-words
	 * 
	 * 
	 * NO NUMBERS
	 * 
	 */
	
	//PRIMITIVE DATA TYPES
	//Whole numbers
	byte myByte = 1; //8 bits, half of a short
	short mySmallNumber = 5; //Half of an int. 16 bits
	int myWholeNumber; //short for integer. 32 bits. whole numbers only
	long myBigNumber; //64 bit,  twice as large as int
	
	//Decimal numbers
	float myDecimal = 1.05f; //floating-point number or decimal number. 64 bits. notoriously inaccurate. must use f, otherwise java thinks that it is double
	double myMorePreciseDecimal = 1.06; //64 bits, double precision decimal number
	
	//True or false
	boolean myTrueOrFalse; // 1 byte or 8 bits
	
	//Character
	char myCharacter; //16 bits, stores ASCII unless otherwise specified
	
	//Reference - holds the memory object of some object
	Object o; //References are 32 bits on a x86 (32-bit machine) and 64 bits on a 64 bit machine
	
	//My First Method
	public void PrintMyValues() { 
		System.out.println("My values are: " + myByte + ", " + mySmallNumber + ", " + myDecimal);
		
	}

}
