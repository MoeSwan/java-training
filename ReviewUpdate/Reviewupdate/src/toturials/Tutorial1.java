package toturials;
/**
 * <h2> Toturial1 Class</h2>
 * <p>
 * Process for Displaying Toturial1
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial1 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	display number 1 to 100.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int n = 100;
		System.out.print("Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}