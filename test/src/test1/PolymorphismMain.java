package test1;

/**
 * <h2> PolymorphismMain Class</h2>
 * <p>
 * Process for Displaying PolymorphismMain
 * </p>
 * 
 * @author Hp
 *
 */
public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism MyPolymorphism =new Polymorphism();
		Polymorphism myDog = new Dog();
		MyPolymorphism.animalSound();
		myDog.animalSound();
	}

}
