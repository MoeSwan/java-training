package toturials;
/**
 * <h2> Tutorial10a Class</h2>
 * <p>
 * Process for Displaying Tutorial10a
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial10a {
	/**
	 * <h2> main</h2>
	 * <p>
	 *  total average with array 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		double[] arr = { 3, 4, 5, 7, 9 };
		double total = 0;
		//to calculate for array number
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		double average = total / arr.length;
		System.out.format("The average is:" + average);
	}
}