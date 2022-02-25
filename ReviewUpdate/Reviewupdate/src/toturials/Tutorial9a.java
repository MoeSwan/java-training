package toturials;
import java.util.Scanner;
/**
 * <h2>Toturial9a Class</h2>
 * <p>
 * Process for Displaying Toturial9a
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial9a {
	/**
	 * <h2>main</h2>
	 * <p>
	 * user input show positive and negative numbers
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number:");
		number = scan.nextInt();
		scan.close();
		// if condition for positive
		if (number > 0) {
			System.out.println(number + " number of positive");
		}
		// else if condition for negative
		else if (number < 0) {
			System.out.println(number + " number of negative");
		}
		// else if condition for zero number
		else if (number == 0) {
			System.out.println(number + " number is zero");
		}
	}
}