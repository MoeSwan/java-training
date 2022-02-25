package toturials;
/**
 * <h2>toturial3 Class</h2>
 * <p>
 * Process for Displaying toturial3
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial3 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * right angle triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int i, j;
		// for loop for 1 to 10
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}