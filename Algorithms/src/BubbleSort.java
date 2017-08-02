/**
 * 
 * Bubblesort algorithm.
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class BubbleSort extends Algorithm{

	private static final String NAME = "Bubble Sort";
	
	// Using List to allow 
	public void bubbleSortAlgorithm(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				
				if(array[i] > array[j]) {
					// swap
				}
			}
		}
		
	}

	/**
	 * Getter for the constant NAME.  Used to help Constants class to easily integrate algoMap.
	 * @return NAME A private constant
	 */
	public String getName() {
		return NAME;
	}
	
}
