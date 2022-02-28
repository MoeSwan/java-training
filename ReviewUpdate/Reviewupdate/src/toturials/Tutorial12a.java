package toturials;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * <h2> Tutorial12a Class</h2>
 * <p>
 * Process for Displaying Tutorial12a
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial12a {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	the specified key in a HashMap
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]) {
		// HashMap two variabiles
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(0, "Yellow");
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		for (Entry<Integer, String> x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}