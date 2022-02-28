package toturials;
import java.util.Collections;
import java.util.ArrayList;
/**
 * <h2> Tutorial11b Class</h2>
 * <p>
 * Process for Displaying Tutorial11b
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial11b {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	swap array list 
	 * </p>
	 *
	 * @param a
	 * @return void
	 */
	public static void main(String a[]) {
		// Create the Array List
		ArrayList<String> ArrList = new ArrayList<String>();
		// add the values in Array List
		ArrList.add("Red");
		ArrList.add("Green");
		ArrList.add("Black");
		ArrList.add("White");
		ArrList.add("Pink");
		// display Array List before swap
		System.out.println("Before Swap the ArrayList ");
		System.out.println(ArrList);
		// Swapping the elements at 0 and 2 indices
		Collections.swap(ArrList, 0, 2);
		// display Array List after swap
		System.out.println("After Swap the ArrayList");
		System.out.println(ArrList);
	}
}