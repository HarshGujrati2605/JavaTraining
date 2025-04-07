
public class DayTwoJavaConcepts {
	 static String reversesentence  = "" ;

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String str = "IAmJavaEngineer";
		char[] chrr = str.toCharArray();
		System.out.println(chrr.length);
		for(char cr: chrr) {
			System.out.println(cr);
			
			
		}
		
		char[] crone = {'H', 'E', 'L' , 'L' , 'O'};
		
		String strone = new String(crone);
		System.out.println(strone);
		
	    String a = "ar";
	    String b = "arr";
	    System.out.println(a.compareTo(b));
	    
	    String revresestr = "";
	    
	    for(int i = str.length()-1 ; i>=0 ; i--) {
	    	revresestr= revresestr + str.charAt(i);
	    	
	    }
	    
	    System.out.println(revresestr);
	    
	    
	    String sentence = "I Love India";
	    String[] arr = sentence.split(" ");
	    System.out.println(arr[2]);
	    //String reversesentence  =" " ;
	    for(int i =0 ; i<arr.length; i++) {
	    	System.out.println(arr[i].length());
	    	for(int j = arr[i].length()-1 ; j>=0 ; j--) {
	    		reversesentence = reversesentence + arr[i].charAt(j);
	    	}
	    	reversesentence += " ";
	    }
	    System.out.println(reversesentence);
	    
	   //day 3
	    
	    //Break for loop
	    
	    for(int i =1 ; i<=5 ; i++) {
	    	if(i == 2) {
	    		continue;
	    	}
	    	else {
	    		System.out.println(i);
	    	}
	    }
	}

}
