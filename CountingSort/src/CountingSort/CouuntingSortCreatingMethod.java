package CountingSort;

import java.util.Scanner;

//This exercise sure-cases that I am able to create a counting sort method, instead of writing the whole code inside the main method

public class CouuntingSortCreatingMethod {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		//.1. Prompt the user for the number of values they would like to have.
		System.out.println("How may numbers would you like to havein your array? ");
		int arraySize= scan.nextInt();
		
		while(arraySize<=0) {
			System.out.println("Invalid array size, enter a number greater than 0");
			arraySize= scan.nextInt();
		}
		
		//2. Create an array of the size entered by user
		
		int[] numbers=new int[arraySize];
		
		//3. Prompt user to enter values in the array.
		System.out.println("Enter numbers in the array: ");
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("Enter number in index "+ i+": ");
		
			numbers[i]=scan.nextInt();		
		}
		
				
		//4. Print the values of an unsorted array
		System.out.println("Unsorted array: ");
		for(int i=0; i<numbers.length;i++) {		
			System.out.println(numbers[i]);			
		}
		
		//5. Call the method that will sort the values in the array through counting sort
		countingSort(numbers);
		
		//6. print the sorted array
		System.out.println("Sorted array: ");
		for(int i=0; i<numbers.length;i++) {		
			System.out.println(numbers[i]);			
		}

	}
	 
	public static void countingSort(int[] numbers) {
		
		//1. Find a maxim value, know the range of numbers
		int max=numbers[0];
		
		for(int i=1; i<numbers.length;i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
					
		}
				
		//2. Create the count array, that will count the  occurrences  for each number
		int[] count= new int[max+1];
		
		for(int i=0; i<numbers.length; i++) {
			
			count[numbers[i]]++;
			
			
		}
		
		//3. Put the number back in the sorted order
		
		int index=0;
		
		for(int number=0; number<count.length  ; number++) {
			
			System.out.println(number+ " appears "+ count[number] +" times. ");
			
			while(count[number]>0) {
			
			numbers[index]=number;
			
			index++;
			count[number]--;
			
			}
		}
		
		
		
	}

}
