package MyPackage;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		
		//Object INSTANTIATION:
		MyThing mt = new MyThing();
		
		System.out.println("Say hi to my object, it has a value of " + mt.mySmallNumber);
		
		mt.PrintMyValues();
	}
}
