/*Create a notepad file called Data.txt and enter the following:
Mickey:Mouse:35:Arizona
Hulk:Hogan:50:Virginia
Roger:Rabbit:22:California
Wonder:Woman:18:Montana
Write a program that would read from the file and print it out to the screen in the following format:
Name: Mickey Mouse
Age: 35 years
State: Arizona State*/


package Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question20 {

	public void loadData() {
		
		Scanner read;
		ArrayList<Person> people = new ArrayList<Person>();
		
		try {
			read = new Scanner (new File("Data.txt"));
			read.useDelimiter(":|\\n");
			
			while (read.hasNext()) {
				Person p = new Person();
				p.firstName = read.next();
				p.lastName = read.next();
				p.age = Integer.parseInt(read.next());
				p.state = read.next();
				
				people.add(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Person p : people) {
			System.out.println("Name: " + p.firstName + " " + p.lastName);
			System.out.println("Age: " + p.age);
			System.out.println("State: " + p.state);
		}
	}
}

class Person {
	String firstName, lastName, state;
	int age;
}



