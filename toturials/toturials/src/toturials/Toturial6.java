package toturials;
/**
 * <h2> Toturial6 Class</h2>
 * <p>
 * Process for Displaying Toturial6
 * </p>
 * 
 * @author Hp
 *
 */
public class Toturial6 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	sand clock pattern.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int i, j, k;
		int rows = 7;
		//for loop is numbers to show for row
		for (i = 1; i <= 7; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		// for loop is decrease numbers for row
		for (i = rows - 1; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}
}