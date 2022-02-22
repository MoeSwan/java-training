package toturials;
import java.util.Scanner;
/**
 * <h2> toturial9c Class</h2>
 * <p>
 * Process for Displaying toturial9c
 * </p>
 * 
 * @author Hp
 *
 */
public class Toturial9c {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	leap years to find 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		//if condition is leap years
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
	}
}