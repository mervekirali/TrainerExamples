
//Sort two employees based on their name, department, and age using the Comparator interface

package Package;


import java.util.*;




	
	class Employee {
	
	String name, department;
	int age;
	
	//Constructor
	
	public Employee(String name, String department, int age) {
		
		this.name = name;
		this.department = department;
		this.age = age;
			
	}
	
	//Used to print employee details in main()
	

	public String toString()
	
	{
		return this.name + " " + this.department + " " + this.age;
		
	}
	
}


class sortByAge implements Comparator<Employee> {
	
	public int compare(Employee a, Employee b)
	
	{
		return a.age - b.age;	
		
	}			
}
class sortByName implements Comparator<Employee> {
	
	public int compare(Employee a, Employee b)
	
	{
		return a.name.compareTo(b.name);
		
		
	}		
}
	
class sortByDept implements Comparator<Employee> {
		
	public int compare(Employee a, Employee b)
		
	{
		return a.department.compareTo(b.department);
			
			
	}	
}


	public class Question7 {
	
		public static void Sort() {
		

				ArrayList<Employee> ar = new ArrayList<Employee>();
			
			ar.add(new Employee("HR", "Kate Spade", 26));
			ar.add(new Employee("IT", "Donna Karan", 35));
			ar.add(new Employee("Finance", "Calvin Klein", 49));
			
			System.out.println("Question 7: ");
			
			
			System.out.println("Unsorted");
			for (int i = 0; i < ar.size(); i++)
			    System.out.println(ar.get(i));
			
			Collections.sort(ar, new sortByAge());
			
			System.out.println("\nSorted by age");
			for (int i = 0; i < ar.size(); i++)
			    System.out.println(ar.get(i));
			
			Collections.sort(ar, new sortByName());
			
			System.out.println("\nSorted by name");
			for (int i = 0; i < ar.size(); i++)
			    System.out.println(ar.get(i));
			
			Collections.sort(ar, new sortByDept());
			
			System.out.println("\nSorted by department");
			for (int i = 0; i < ar.size(); i++)
			    System.out.println(ar.get(i));


}
}






