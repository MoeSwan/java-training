package test1;

public class ControlStatements {

	public static void main(String[] args) {
		/*conditional statement*/
		// if statement
		int x1 = 20;
		int y1 = 18;
		if (x1 > y1) {
		  System.out.println("x is greater than y");
		}
		
		// else if statement 
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//nested if 
		int age=20;  
		int weight=80;    
		if(age>=18){    
		if(weight>50){  
		System.out.println("You are eligible to donate blood");  
		        } 
		    }
		
		//switch statement 
		int months = 1;
		switch (months) {
		  case 1:
		    System.out.println("December");
		    break;
		  case 2:
		    System.out.println("Feburary");
		    break;
		  default:
		    System.out.println("Did't show months");
		}
		
		
		/*looping statement */
		//for loop 
		for (int i = 0; i < 10; i++) {
			  System.out.println(i);
		}
		
		//for each loop 
		String[] phones = {"Iphone", "Samsung", "Mi", "Pixel"};
		for (String i : phones) {
		  System.out.println(i);
		}
		
		//while loop 
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		//do while
		int i1 = 0;
		do {
		  System.out.println(i1);
		  i1++;
		}
		while (i1 < 5);

		/*jump statement*/
		//break 
		for (int a = 0; a < 10; a++) {
			  if (a == 4) {
			    break;
			  }
			  System.out.println(a);
			}
		//continue
		for (int x = 0; x < 10; x++) {
			  if (x == 4) {
			    continue;
			  }
			  System.out.println(x);
			}

	}

}
