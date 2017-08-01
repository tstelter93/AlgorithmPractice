import java.awt.List;
import java.util.Random;

/**
 * 
 * This class collects user input for what algorithm to run and what parameters to be set
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class CMDGui {
	
	private List algorithms = new List();
	
	public CMDGui() {
		super();
	}
	
	/**
	 * Creates the list of available algorithms and stores them in a list
	 */
	public static void createList(){
		// How to grab what algorithms have been made?  Switch statement?  Hardcoded?
		// Script to find the names?
	}
	
	/**
	 * Starts the GUI to collect needed algorithmic information
	 */
	public void startGui() {
		// Begin using scanners here
		// use the createlist function here to find all the algorithms to use.
	}
	
	/**
	 * Outputs the runtime calculations of the specified algorithm + input information
	 */
	public void algorithmGo() {
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
	// getters and ?setters? to use information in printout
	
	
} //END CLASS
