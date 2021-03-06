import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
/*Import was throwing an error.  But constant usage works without import anyways?*/
// import static Constants.*;

/**
 * 
 * This class collects user input for what algorithm to run and what parameters to be set
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class CMDGui {
	
	/*Class fields*/
	private int arraySize;
	private static int algoSelection;
	
	/**
	 * The Constructor
	 */
	public CMDGui() {
		super();
		arraySize = 10;
		algoSelection = 0;
	}
	
	/**
	 * Starts the GUI to collect needed algorithmic information
	 */
	public void startGui() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************************" 
				+ "\n*Algorithm Timer"
				+ "\n*"
				+ "\n*"
				+ "\n*****************************************************\n");
		
		/*Print out the algorithm list*/
		System.out.println("Pick an algorithm from the list to use:");
		Set<String> keys = Constants.ALGO_MAP.keySet();
		Iterator<String> itr = keys.iterator();
		
		String key = "";
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println(key + ")" + Constants.ALGO_MAP.get(key).getClass().getName());
		}
		
		/*Handler for algorithm selection*/
		boolean algoFlag = true;
		while(algoFlag) {
			Integer algoValue = scan.nextInt();
			if(algoValue.intValue() <= Constants.ALGO_MAP.size() 
					&& algoValue.intValue() > Constants.ZERO) {
				algoSelection = algoValue;
				System.out.println("Selection: " + Constants.ALGO_MAP.get(algoValue.toString()).getClass().getName() 
				    + "\n");
				algoFlag = false;
			} else {
				System.out.println("Invalid Value.  Please submit a valid value between 1 and " 
			        + Constants.ALGO_MAP.size() + ":  ");
			}
		}
		
		/*User input for array size to sort*/
		System.out.println("Please enter the size of the array.  "
		+ "\nNOTE: The array value must be between 2 and 10,000,000:  ");
		
		boolean valueFlag = true;
		while(valueFlag) {
			Integer arrayValue = scan.nextInt();
			if(arrayValue.intValue() <= Constants.ARRAY_SIZE_MAX_LIMIT 
					&& arrayValue.intValue() >= Constants.ARRAY_SIZE_MIN_LIMIT) {
				setArraySize(arrayValue);
				System.out.println("Array Size:  " + arrayValue 
			        + "\n");
				valueFlag = false;
			} else {
				System.out.println("Invalid Value.  Please submit a valid value between 2 and 10,000,000:  ");
			}
		}
		
		/*Close off the I/O scanner*/
		scan.close();
	}
	
	/**
	 * Outputs the runtime calculations of the specified algorithm + input information
	 * @throws AlgorithmUnsupportedException 
	 */
	public void algorithmGo() throws AlgorithmUnsupportedException {
		/*Setting up the random number generator and array to be sorted*/
		Random rand = new Random();
		int newNum = 0;
		int[] array = new int[arraySize];
		
		/*Loop used to create Array of random values*/
		for(int i = 0; i < array.length; i++) {
			newNum = rand.nextInt(12000);
			array[i] = newNum;
		}
		
		// Take user choice and instantiate that algorithm class.
		if((algoSelection <= Constants.ZERO) || (algoSelection > Constants.ALGO_MAP.size())) {
			throw new AlgorithmUnsupportedException("Error in algorithm selection.");
		} else {
			//TODO: issue STILL with getting the correct type from the HashTable.
			//TODO: Figure out how to cast maybe?
			Set<String> keys = Constants.ALGO_MAP.keySet();
			String name = Constants.ALGO_MAP.get(algoSelection).getClass().getName();
			Object tmp = Constants.ALGO_MAP.get(algoSelection);
			
//			if(tmp instanceof Algorithm) {
//				
//			}
			/* Setup timing scheme and run the algorithm.  
			 * Make the variables final to avoid potential changes
			 */
			final long startTime = System.currentTimeMillis();
		
			// merge.mergeSortAlgorithm(array);
			
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
	// getters and ?setters? to use information in printout

	/**
	 * Returns the value of arraySize
	 * @return Returns the value of arraySize
	 */
	public int getArraySize() {
		return arraySize;
	}

	/**
	 * Sets the value of arraySize
	 * @param arraySize Size of the static array to sort
	 */
	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
} //END CLASS
