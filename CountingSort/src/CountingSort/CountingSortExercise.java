package CountingSort;

public class CountingSortExercise {

	public static void main(String[] args) {
		
		int[] numbers= {4, 2, 2, 8, 3, 3, 1};
		
		System.out.println("Unsorted array: ");
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);			
		}
		
		System.out.println("Sorted array");
		countingSort(numbers);
		for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);	
		}
	}
	
	
	public static void countingSort(int[] numbers){
		
		//1, Find the maximum value
		int max=numbers[0];
		
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>max) {
				max=numbers[i];				
			}
		}
		
		//2. After finding the maximum, we know the range of numbers, also the new array.
		//2.1. create a counting sort, that will count the number of occurences for each value.
		
		int[] count=new int[max+1];
		
		for(int i=0; i<numbers.length;i++) {
		count[numbers[i]]++;
		}
		
			
		//3. Put the sorted numbers back into the sorting array
		int index=0;
		
		for(int number=0; number<count.length; number++) {
		while(count[number]>0) {		
			numbers[index]=number;
			index++;
			count[number]--;			
		}		
	}
				
	}

}
