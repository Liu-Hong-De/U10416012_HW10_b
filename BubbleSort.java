//U10416012 劉宏德
import java.util.*;
 
public class BubbleSort {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
 
		// ask user to input how many number they want to do the bubble sort
		System.out.print("Input number of integers to sort: ");
		int n = input.nextInt();
 
		// judge this array's length
		int array[] = new int[n];
		
		// ask user enter the number
		System.out.println("Enter " + n + " integers you want to do the bubble sort:");
 
		// put the number which the user input into the array
		for (int c = 0; c < n; c++) {
			array[c] = input.nextInt();
		}
		//change the quene of the user input number
		for (int c = 0; c < ( n - 1 ); c++) {
			for (int d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d + 1]) {
					int swap = array[d];
					array[d] = array[d + 1];
					array[d + 1] = swap;
				}
			}
		}
 
		System.out.println("the answer of bubble sort is");
 
		//print the answer
		for (int c = 0; c < n; c++) 
			System.out.println(array[c]);
	}
}
