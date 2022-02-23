package toturials;
import java.util.HashMap;
/**
 * <h2> Tutorials12c Class</h2>
 * <p>
 * Process for Displaying Tutorials12c
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorials12c {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	mapping for the specified key.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]) {
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		hash_map.put("Red", 1);
		hash_map.put("Green", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);
		// print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Is key 'Red' exists?");
		if (hash_map.containsKey("Red")) {
			// key exists
			System.out.println("yes! - " + hash_map.get("Red"));
		} else {
			// key does not exists
			System.out.println("no!");
		}
		System.out.println("\n2. Is key 'Yellow' exists?");
		if (hash_map.containsKey("Yellow")) {
			System.out.println("yes! - " + hash_map.get("yellow"));
		} else {
			System.out.println("no!");
		}
	}
}