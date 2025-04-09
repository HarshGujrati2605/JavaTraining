
public class ExceptionHandling {
	
	public static void divide(int num) throws InterruptedException {
		
		System.out.println(num);
		Thread.sleep(1000);
		
		
		
	}

	public static void main(String[] args) throws InterruptedException  {
		
//		int a[] = new int[5];
//		
//		try {
//	
//		System.out.println(a[1]);
//		int num = 5/5;
//		
//		
//		}
//		catch (IndexOutOfBoundsException | ArithmeticException e) {
//			System.out.println("Something is wrong in input");
//			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace());
//			
//		}
//		
//		finally {
//			
//			System.out.println("This code is executed in finally");
//			
//		}
//		
//		
//		
//		
//		System.out.println("Hello");
		divide(5);
		
		
	}

}
