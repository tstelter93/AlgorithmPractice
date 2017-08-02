/**
 * 
 * Insertion sort algorithm.
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class InsertionSort extends Algorithm {
	
	private static final String NAME = "Insertion Sort";
	
	//  insertion sort, which is an efficient algorithm for sorting a SMALL number of elements.
	//
	//  The algorithm sorts the input numbers in place: it rearranges the numbers within the array 'array', 
	//      with at most a constant number of them stored outside the array at any time.
	public void useAlgorithm(int[] array) {
		int key = 0;
		int i = 0;
		
		for(int j = 0; j < array.length; j++) {
			key = array[j];
			// Insert array[j] into the sorted sequence array[0 .. j-1]
			i = j - 1;
			while(i > -1 && array[i] > key) {
				array[i+1] = array[i];
				i = i - 1;
			}
			array[i+1] = key;
		}
	}

	/**
	 * Getter for the constant NAME.  Used to help Constants class to easily integrate algoMap.
	 * @return NAME A private constant
	 */
	public String getName() {
		return NAME;
	}
	
}  //END CLASS
