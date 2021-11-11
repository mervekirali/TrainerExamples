
/*Display the triangle on the console as follows using any type of loop. Do NOT use a simple
//group of print statements to accomplish this.
0
1 0
1 0 1
0 1 0 1*/

package Package;

public class Question13 {
	
	
	
	public void triangle() {
	
	System.out.println("Displaying the triangle:");
	int count = 1;
    for (int i=1;i<=4;i++){
        for (int j=0;j<i;j++){
            if (count%2!=0) {
                System.out.print("0");
            }
            else {
                System.out.print("1");
            }
            count++;
        }
        
        System.out.print("\n");
    }  
}
}
	
