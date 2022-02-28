package toturials;
import java.util.HashMap;
/**
 * <h2> Tutorial12b Class</h2>
 * <p>
 * Process for Displaying Tutorial12b
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial12b {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	 copy mapping form the specified map to another map
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]) {
		// create two hash maps
		HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
		// first mapping value 
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Black");
		System.out.println("\nfirst map: " + hash_map1);
		// second mapping value 
		hash_map2.put(4, "White");
		hash_map2.put(5, "Blue");
		hash_map2.put(6, "Orange");
		System.out.println("\nsecond map: " + hash_map2);

		// put all values in secondmap
		hash_map2.putAll(hash_map1);
		System.out.println("\nNow second map: " + hash_map2);
	}
}