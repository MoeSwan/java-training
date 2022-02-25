package toturials;
/**
 * <h2> toturial4 Class</h2>
 * <p>
 * Process for Displaying toturial4
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial4 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * can't display for odd number
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args){
		//for loop right angle triangle for number 1
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(j);
				}
		//for loop right angle triangle for even number
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}
	}
}