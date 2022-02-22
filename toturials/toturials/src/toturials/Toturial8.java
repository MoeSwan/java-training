package toturials;
/**
 * <h2> Toturial8 Class</h2>
 * <p>
 * Process for Displaying Toturial8
 * </p>
 * 
 * @author Hp
 *
 */
public class Toturial8 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * right pattern for characters 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int rows = 9;
		int alphabet = 65;
		int a = 1;
		//increase characters number for row
		for (int i = 1; i <= rows / 2 + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (alphabet + (a * j) - 1) + " ");
			}
			System.out.println();
			a++;
		}
		//Decrease character number for row
		for (int i = 1; i <= rows / 2; i++) {
			for (int j = 1; j <= rows / 2 + 1 - i; j++) {
				System.out.print((char) (alphabet + (a * j) - 1) + " ");
			}
			System.out.println();
			a++;
		}
	}
}
