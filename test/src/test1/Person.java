package test1;

/**
 * <h2> person Class</h2>
 * <p>
 * Process for Displaying person
 * </p>
 * 
 * @author Hp
 *
 */
public class Person extends Modifiers {
  /**
 * <h2> main</h2>
 * <p>
 * 
 * </p>
 *
 * @param args
 */
public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Person myObj = new Person(); 
    
    System.out.println("Name: " + myObj.fname + myObj.lname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Email: " + myObj.email);
  
  }
}

