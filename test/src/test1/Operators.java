package test1;

public class Operators {

	public static void main(String[] args) {
		/*Arithmetic Operators*/
		// addition operator
		int num1=10;
		int num2=10,
		result = num1+num2;
		System.out.println("Total number is "+result);
		
		// Subtraction operator
		byte num3=99;
		int num4=33;
		result = num3-num4;
		System.out.println("subtract number is "+ result);
		
		//Multiplication operator
		 int num5 = 5;
		 int num6 = 3;
		 System.out.println("multiplication number is "+num5 * num6);
		
		//Division operator
		  int num7 = 12;
		  int num8 = 3;
		  System.out.println("division number is "+num7 / num8);
		  
		 //Modulus operator
		  int num9 = 5;
		  int num10 = 2;
		  System.out.println("modulus number is "+num9 % num10);
		  
		 // Increment operator
		  int num11 = 5;
		  num11++;
		  System.out.println("increment number is "+num11);
		  
		 //Decrement operator
		  int num12 = 5;
		  num12--;
		  System.out.println("decrement number is "+num12);
		  
		  
		  
		  /*Java Assignment Operators*/
		  //equal 
		  int x1 = 5;
		  System.out.println("equal to "+x1);
		  
		  //total and equal
		  int x2 = 5;
		  x2 += 3;
		  System.out.println("total and equal to"+x2);

		  //subtract and equal
		  int x3 = 5;
		  x3 -= 3;
		  System.out.println("subtract and equal to "+x3);
		    
		  //multiplication 
		  int x4 = 5;
		  x4 *= 3;
		  System.out.println("multiplication and equal to "+x4);
		  
		  //Divide AND assignment operator
		  double x5 = 5;
		  x5 /= 3;
		  System.out.println("Divide AND assignment operator "+x5);
		    
		 //Modulus AND assignment operator
		  int x6 = 5;
		  x6 %= 3;
		  System.out.println("Modulus AND assignment operator "+x6);
		  
		 //Bitwise AND assignment operator.
		  int x7 = 5;
		  x7 &= 3;
		  System.out.println("Bitwise AND assignment operator "+x7);
		  
		 //bitwise inclusive OR and assignment operator.
		  int x8 = 5;
		  x8 |= 3;
		  System.out.println("bitwise inclusive OR and assignment operator "+x8);
		  
		 //bitwise exclusive OR and assignment operator.
		  int x9 = 5;
		  x9 ^= 3;
		  System.out.println("bitwise exclusive OR and assignment operator "+x9);
		  
		 //Right shift AND assignment operator.
		  int x10 = 5;
		  x10 >>= 3;
		  System.out.println("Right shift AND assignment operator "+x10);
		  
		 //Left shift AND assignment operator.
		  int x11 = 5;
		  x11 <<= 3;
		  System.out.println("Left shift AND assignment operator "+x11);
		  
		  
		  
		  /*Java Comparison Operators*/
		  //Equal to
		  int x12 = 5;
		  int y13 = 3;
		  System.out.println(x12 == y13);
		  
		  //Not equal
		  int x14 = 5;
		  int y15 = 3;
		  System.out.println(x14 != y15);
		  
		  //Greater than
		  int x16 = 5;
		  int y17 = 3;
		  System.out.println(x16 > y17);
		  
		  //Less than
		  int x18 = 5;
		  int y19 = 3;
		  System.out.println(x18 < y19);
		  
		  //Greater than or equal to
		  int x20 = 5;
		  int y21 = 3;
		  System.out.println(x20 >= y21);
		  
		  //Less than or equal to
		  int x22 = 5;
		  int y23 = 3;
		  System.out.println(x22 <= y23);
		  
		  
		  //Java Logical Operators
		  //Logical and
		  int x24 = 5;
		  System.out.println(x24 > 3 && x24 < 10);
		  
		  //Logical or
		  int x25 = 5;
		  System.out.println(x25 > 3 || x25 < 4);
		  
		  //Logical not
		  int x26 = 5;
		  System.out.println(!(x26 > 3 && x26 < 10));

	}

}
