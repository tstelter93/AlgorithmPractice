/**
 * Custom exception class to support possiblity of faultly logic with algorithm selection.
 * @author Timothy Stelter
 *
 */
@SuppressWarnings("serial")
public class AlgorithmUnsupportedException extends Exception{

    public AlgorithmUnsupportedException() {
    	/*Default constructor*/
    }
	
	public AlgorithmUnsupportedException (String message) {
        super (message);
    }
	
}
