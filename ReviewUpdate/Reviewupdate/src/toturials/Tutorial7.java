package toturials;

/**
 * <h2> Toturial7 Class</h2>
 * <p>
 * Process for Displaying Toturial7
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial7 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	Diamond pattern 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int rows = 5;
		int alphabet = 65;
		//Character is for 5 row and column loop 
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print((char) (alphabet + j));
			}
			//decrease character for loop 
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int l = rows - i; l >= 0; l--) {
				if (l != rows)
					System.out.print((char) (alphabet + l));
			}
			System.out.println();
		}
		//increase character for loop 5 row and column
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print((char) (alphabet + j));
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int l = rows - i; l >= 0; l--) {
				if (l != rows)
					System.out.print((char) (alphabet + l));
			}
			System.out.println();
		}
	}
}