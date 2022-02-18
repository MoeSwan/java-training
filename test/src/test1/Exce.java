package test1;

/**
 * <h2> Exce Class</h2>
 * <p>
 * Process for Displaying Exce
 * </p>
 * 
 * @author Hp
 *
 */
public class Exce {
	  /**
	 * <h2> main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 */
	public static void main(String[ ] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	  }
	}
