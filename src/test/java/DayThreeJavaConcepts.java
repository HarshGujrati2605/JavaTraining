
public class DayThreeJavaConcepts {

	public static void main(String[] args) {
		/**
		 * Agenda: Break and continue in for loop 
		 * 
		 * The if-else statement in Java is used to execute different blocks of code
		 * based on conditions.
		 * 
		 * QA. check if a number is positive and even
		 * 
		 * QA . Check if a number is in a range (10-20)
		 * 
		 * 
		 
		 * 
		 *  while Loop - Basic Syntax
		 *  
		 *  QA.  Write a program to print all even numbers from 1 to 20 using a while loop.

         while (condition) {
         // Code to execute
           }
           
           
		 * 
		 * 
		 Sum of First 10 Natural Numbers
		 
		 The do-while loop guarantees at least one execution, even if the condition is false.
		 
		 QA.  reverse the integer 389 to 983
		 **/
		
//		
//		for(int i = 1 ;  i<=10 ; i++) {
//			
//			if(i==6) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
//		
//		
//		int number = 9;
//		
//		if(number % 2 ==0) {
//			System.out.println("Number is even");
//		}
//		else {
//			System.out.println("Number is odd");
//		}
//		
//		
//		
//		int  i =1;
//		
//		while(i<=10) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
//		
//        
		
		//sum of first 20 natural number
		
		int sum = 0;
		
		int num = 20;
	     
		int j =1;
		
		while(j<=num) {
			sum +=  j;
			j++;
			//System.out.println(sum);
		}
		
		System.out.println(sum);

	

	}

}
