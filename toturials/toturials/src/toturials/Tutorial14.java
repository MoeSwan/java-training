package toturials;
/**
 * <h2> Tutorial14 Class</h2>
 * <p>
 * Process for Displaying Tutorial14
 * </p>
 * 
 * @author Hp
 *
 */
class Tutorial14 {
	/**
	 * <h2> main</h2>
	 * <p>
	 *  to show two name for yes or no palindrome 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]) {
		String str, rev = "";
		str = "gg";
		String str1 = "abba";
		// palindrome for first name
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
		// palindrome for second name
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str1.charAt(i);
		if (str1.equals(rev))
			System.out.println(str1 + " is a palindrome");
		else
			System.out.println(str1 + " is not a palindrome");
	}
}