package CountingSort;

public class CountingSortExercise2 {

	public static void main(String[] args) {

		int[] numbers={5, 1, 4, 1, 3, 5, 2, 4};
		
		//1. Print an unsorted array
		System.out.println("Unsorted array: ");
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);		
		}
		
		
		System.out.println("Sorted array: ");
		//2. Call the method that sorts the array
		countingSort(numbers);
		
		//3. Print the sorted array
		for(int i =0; i<numbers.length; i++){
			System.out.println(numbers[i]);		
		}
		
		
	}
	
	public static void countingSort(int[] numbers) {
		
		//1. Find the maximum
		int max=numbers[0];
		
		for(int i=1;i<numbers.length; i++) {
			if (numbers[i]>max) {
				max=numbers[i];			
			}		
		}
		
		
		//2. create a counting array that will count the number of occurrences for each number
		int[] count=new int[max+1];
			
		//3. Increment the counting sort
		System.out.println("Counting in progress: ");
		for(int i=0;i<numbers.length;i++) {	
			
		count[numbers[i]]++;
		}
		
		//4. Putting values in the array in sorted order
		int index=0;
		
		for(int number=0; number<count.length; number++) {
			System.out.println(number + " appears " + count[number]+ " times");
			
			while(count[number]>0) {
			numbers[index]=number;
			index++;
			count[number]--;
			
			}
		}
			
	}

}
