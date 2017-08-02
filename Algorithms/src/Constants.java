import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 
 * Constants file.  We don't want magic numbers.
 * 
 * @author Timothy Stelter
 * @version v8117
 */
public final class Constants {
    
	private Constants() {
		/*Nothing to instantiate*/
	}

	/*Public constant(s)*/
	public static final int ZERO                 = 0;
	public static final int ARRAY_SIZE_MIN_LIMIT = 2;
	public static final int ARRAY_SIZE_MAX_LIMIT = 10000000;
	public static final Map<String, Object> ALGO_MAP;
    static{
        Hashtable<String, Object> tmp = 
            new Hashtable<String, Object>();
        tmp.put("1", new BubbleSort());
        tmp.put("2", new InsertionSort());
        tmp.put("3", new MergeSort());
        ALGO_MAP = Collections.unmodifiableMap(tmp);
    }
	
}
