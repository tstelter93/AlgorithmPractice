/**
 * MeregeSort that follows a DIVIDE AND CONQUER Algorithm structure.
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class MergeSort extends Algorithm{
	
	private static final String NAME = "Merge Sort";
	
	/**
	 * 
	 * Divide:  Divide the n-element sequence to be stored into two subsequences of n/2 elements each.
	 * 
	 * Conquer: Sort the two subsequences recursively using merge sort.
	 * 
	 * Combine: Merge the two sorted subsequences to produce the sorted answer.
	 * 
	 * @param array
	 */
	public void useAlgorithm(int[] array) {
		System.out.println("Work-in-progress...");
	}
	
	/**
	 *  p <= q < r
	 *  
	 *  subarrays = array[p..q]
	 *  array[q+1..r] is sorted
	 *  full array sorted = array[p..r]
	 *  
	 *  Merge is O(n), where n = r - p + 1 is total elements being merged
	 *  
	 * @param array
	 * @param p
	 * @param q
	 * @param r
	 */
	// NEEDS TESTING
	public void merge(int[] array, int p, int q, int r) {
		int subarrayOneSize = q - p + 1;
		int subarrayTwoSize = r - q;
		
		int[] leftArray  = new int[subarrayOneSize + 1];
		int[] rightArray = new int[subarrayTwoSize + 1];

		for(int i = 1; i < subarrayOneSize; i++) {
			leftArray[i] = array[p + i - 1];
		}
		
		for(int j = 1; j < subarrayOneSize; j++) {
			rightArray[j] = array[q + j];
		}
		
		leftArray[subarrayOneSize + 1]  = -1;
		rightArray[subarrayTwoSize + 1] = -1;
		
		int tempOne = 1;
		int tempTwo = 1;
		
		for(int k = p; k < r; k++) {
			
			if(leftArray[tempOne] <= rightArray[tempTwo]) {
				array[k] = leftArray[tempOne];
			} else {
				array[k] = rightArray[tempTwo];
				tempTwo = tempTwo + 1;
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
