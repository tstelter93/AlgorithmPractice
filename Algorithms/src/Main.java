import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int newNum = 0;
		int[] array = new int[10000000];
		
		// Used to create Array of random values
		for(int i = 0; i < array.length; i++) {
			newNum = rand.nextInt(12000);
			array[i] = newNum;
		}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Initialize my Algorithm class
		
		//InsertionSort insert = new InsertionSort();
		//BubbleSort    bubble = new BubbleSort();
		MergeSort     merge  = new MergeSort();
		
		// Current Algorithm
		
		String name = merge.name;
		
		// Time said algorithm
		
		final long startTime = System.currentTimeMillis();
	
		merge.mergeSortAlgorithm(array);
		
		final long endTime = System.currentTimeMillis();
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Printouts
		System.out.println("Algorithm is: " + name);
		System.out.println("Size of Array is: " + array.length);
		System.out.println("---------------------------------------------------");
		System.out.println("Start time (milli): " + (startTime));
		System.out.println("End   time (milli): " + (endTime));
		System.out.println("Total execution time (milli): " + (endTime - startTime) );
		System.out.println("---------------------------------------------------");

	}

}
