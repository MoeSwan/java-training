package test1;

/**
 * <h2>Bike Class</h2>
 * <p>
 * Process for Displaying Bike
 * </p>
 * 
 * @author Hp
 *
 */
public abstract class Bike {

	/**
	 * <h2>run</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 */
	abstract void run();

	/**
	 * <h2>main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
	}
}
