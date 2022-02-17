package test1;
/**
 * <h2> Bike Class</h2>
 * <p>
 * Process for Displaying Bike
 * </p>
 * 
 * @author Hp
 *
 */
public abstract class Bike{
   abstract void run();
 

 public static void main(String args[]){
  Bike obj = new Honda();
  obj.run();
 }
 }
