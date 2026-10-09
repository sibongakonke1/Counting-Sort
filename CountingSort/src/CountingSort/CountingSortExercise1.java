package CountingSort;

/*We are given an array of numbers, we are supposed to sort those numbers in ascending order using Counting sort
 * 
 */

public class CountingSortExercise1 {

	public static void main(String[] args) {
		
		int[] numbers= {4, 2, 2, 8, 3, 3, 1};
		
		/*In this section of the code we will:
		 * 1. Print the unsorted array of numbers
		 * 2. Call the method that sors numbers using counting sort
		 * Print the sorted array.
		 */
		
		System.out.println("Unsorted array: ");
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		System.out.println("Sorted array: ");
		
		countingSort(numbers);
		
		for(int i=0; i<numbers.length;i++) {	
			System.out.println(numbers[i]);		
		}
		
	}
	
	public static void countingSort(int[] numbers) {
		
		//1. find the range of numbers, we will do that by finding the maximum value
		int max= numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];			
			}			
		}
				
		//2. Create a counting array
		
		int[] count=new int[max+1];
			
		//3. increment a counting ort for each number, that is counting the number of occurances for each value.
		for(int i=0;i<numbers.length;i++) {
			
			count[numbers[i]]++;
			
		}
				
		//4. put the numbers back into the arry in the sorted order.
		
		int index=0;
		
		for(int number=0; number<count.length; number++){
			
			while(count[number]>0) {
				
				numbers[index]=number;
				index++;
				count[number]--;
			
			}
			
		}
		 
		
		
	}
	
	

}
