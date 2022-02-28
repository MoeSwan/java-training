package toturials;

import java.util.Arrays;

/**
 * <h2> Tutorial10b Class</h2>
 * <p>
 * Process for Displaying Tutorial10b
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial10b {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	remove first number in array number 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36 };
		System.out.println("Original Array : " + Arrays.toString(my_array));
		// Remove the first element of the array
		int removeIndex = 0;
		for (int i = removeIndex; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
		System.out.println("After removing the second element: " + Arrays.toString(my_array));
	}
}