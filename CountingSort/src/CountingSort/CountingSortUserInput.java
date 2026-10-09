package CountingSort;

import java.util.Scanner;

public class CountingSortUserInput {

	public static void main(String[] args) {

		//1. Prompt the user for array size
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int arraySize=scan.nextInt();
		
		int[] numbers=new int[arraySize];
		
		while(arraySize<=0) {
			System.out.println("Invalid number, enter a number that is greater than 0 ");
			arraySize=scan.nextInt();
		}
						
		//2. Prompt the user for array values
		
		System.out.println("Enter numbers in the array");		
		for(int i=0; i<numbers.length;i++) {
					
			System.out.println("Enter number in index "+i+": ");
			
			numbers[i]=scan.nextInt();
		}
		
		//3. Print an unsorted array
		System.out.println("Unsorted array: ");
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i] );
		}
				
		//4. Print the sorted array
		System.out.println("Sorted array: ");
		
		//4.1 Call the counting sort
		countingSort(numbers);
		
		//4.2 Print the sorted array
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);						
		}
		
	}
	
	public static void countingSort(int[] numbers) {
		
		//1. Find maximum
		int max=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max) {
			max=numbers[i];}
			
		}
		
		//2. Create a counting array to count the occurrence of each number occurrence
		int[] count=new int[max+1];
		
		//3. Increment count
		for(int i=0; i<numbers.length; i++) {			
			count[numbers[i]]++;
			
		} 
		
		//4. Put the numbers back in the array in sorted order
		
		int index=0;
		
		for(int number=0; number<count.length; number++) {
			System.out.println( number + " appears "+ count[number] + " times");
			
			while(count[number]>0){
				numbers[index]=number;
					
			index++;
			count[number]--;
		}
	}
						
	}
	
}
