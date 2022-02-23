package toturials;
/**
 * <h2> toturial5 Class</h2>
 * <p>
 * Process for Displaying toturial5
 * </p>
 * 
 * @author Hp
 *
 */
public class Toturial5 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	*'s triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]) {
		int n = 6;
		//for loop is decrease star
		for (int i = n; i > 0; i--) {
			for (int spc = n - i; spc > 0; spc--) {
				System.out.print(" ");
			}
			//for loop to show star numbers
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}