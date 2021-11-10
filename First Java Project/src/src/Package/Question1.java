

package Package;



/* Bubble sort on the following integer array: 1,0,5,6,3,2,3,7,9,8,4
 * 
 * Bubble Sort Algorithm (repeatedly compares adjacent items, swap the larger ones to the right)
 * 
 * bubbleSort(array)
 *   for i <- 1 to indexOfLastUnsortedElement-1
 *     if leftElement > rightElement
 *       swap leftElement and rightElement
 * end bubbleSort
 * 
 */

public class Question1 {
	
	public static void bubbleSort(int array[]) {
		int size = array.length;
		
		//loop to access each array element
		for (int i = 0; i < size - 1; i++) //i is an outer loop 
			
			//loop to compare array elements
			for (int j = 0; j < size - i - 1; j++) //j is an inner loop which means it is the body of another loop
				
				//compare two adjacent elements
				//change  > to < to sort in descending order
				if(array[j] > array[j + 1 ]) {
					
					
					//swapping occurs if elements
					//are not in the intended order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;	
				}
						
	}
	
	
	}

