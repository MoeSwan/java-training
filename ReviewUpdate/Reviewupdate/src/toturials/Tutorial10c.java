package toturials;
import java.util.ArrayList;
import java.util.List;
/**
 * <h2> Tutorial10c Class</h2>
 * <p>
 * Process for Displaying Tutorial10c
 * </p>
 *
 * @author Hp
 *
 */
public class Tutorial10c {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	covert array list for name
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// Add array to the list
		list.add("Phython");
		list.add("JAVA");
		list.add("PHP");
		list.add("Perl");
		list.add("C#");
		// Convert ArrayList to Array
		String[] array = list.toArray(new String[0]);
		// Print the array
		for (String s : array) {
			System.out.println(s);
		}
	}
}