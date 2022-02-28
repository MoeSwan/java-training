package toturials;
/**
 * <h2> Tutorial13 Class</h2>
 * <p>
 * Process for Displaying Tutorial13
 * </p>
 * 
 * @author Hp
 *
 */
class Tutorial13 {
	/**
	 * <h2> main</h2>
	 * <p>
	 * 	Fibonacci series and sum of two number 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int n = 100, firstTerm = 1, secondTerm = 2;
		while (firstTerm <= n) {
			System.out.print(firstTerm + ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}