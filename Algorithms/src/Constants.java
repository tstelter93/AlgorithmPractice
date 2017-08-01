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
	public static final Map<String, String> ALGO_MAP;
    static{
        Hashtable<String, String> tmp = 
            new Hashtable<String, String>();
        tmp.put("1","Bubble Sort");
        tmp.put("2","Insertion Sort");
        tmp.put("3","Merge Sort");
        ALGO_MAP = Collections.unmodifiableMap(tmp);
    }
	
}
