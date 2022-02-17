package test1;

/**
 * <h2> Car Class</h2>
 * <p>
 * Process for Displaying Car
 * </p>
 * 
 * @author Hp
 *
 */
public class Car extends Inheritance {
	 private String modelName = "Mustang";
	  public static void main(String[] args) {
	    Car myFastCar = new Car();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
}
