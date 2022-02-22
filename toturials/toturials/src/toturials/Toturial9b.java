package toturials;
import java.util.Scanner;
/**
 * <h2> toturial9b Class</h2>
 * <p>
 * Process for Displaying toturial9b
 * </p>
 * 
 * @author Hp
 *
 */
public class Toturial9b {
	/**
	 * <h2> main</h2>
	 * <p>
	 *  the largest number find in three number
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int a, b, c, largest, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		d = a > b ? a : b;
		largest = c > d ? c : d;
		System.out.println("The largest number is: " + largest);
	}
}