package toturials;
/**
 * <h2> Tutorial2 Class</h2>
 * <p>
 * Process for Displaying Tutorial2
 * </p>
 * 
 * @author Hp
 *
 */
public class Tutorial2 {
   /**
 * <h2> main</h2>
 * <p>
 *  the display odd number and their number sum 
 * </p>
 *
 * @param args
 * @return void
 */
public static void main(String[] args)
{
   int i,n,sum=0;
{
		    n = 5;
  System.out.println ("\nThe odd numbers are :");
  // for loop is show for odd number in 1 to 10
   for(i=1;i<=n;i++)
   {
     System.out.println (2*i-1);
     sum+=2*i-1;
   }
   System.out.println ("The Sum of odd Number " +sum);
}
}
}