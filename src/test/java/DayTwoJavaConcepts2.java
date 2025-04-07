
public class DayTwoJavaConcepts2 {

	public static void main(String[] args) {
		
		char[] chr = {'H' , 'E' , 'L' , 'L' , 'O'};
		String word = new String(chr);
        System.out.println(word);
        
        String str = "ILoveIndia";
        char[] chrr =  str.toCharArray();
        for(int i =1 ; i <=5 ; i++) {
        	System.out.println("India");
        }
        System.out.println(chrr);
        
        for(char cr :chrr) {
        	System.out.println(cr);
        }
        System.out.println(chrr.length);
        
        String strone = "Indore";
        
        int size = strone.length();
        
        String reversestring = "";
        
        for(int i = size -1 ; i>=0 ; i--) {
        	
        	reversestring = reversestring + strone.charAt(i);
        	
        }
        
        System.out.println(reversestring);
        
        
        String sentence = "I love Indore";
        
        String[] arr = sentence.split(" ");
        System.out.println(arr.length);
        String reversenew = "";
        for(int i = 0 ; i<arr.length ; i++) {
        	for(int j = arr[i].length()-1  ; j>=0 ; j--) {
        		reversenew = reversenew + arr[i].charAt(j);	
        	} 
        	reversenew = reversenew + " ";
        }
        
        System.out.println(reversenew);
        
        
        
	}
	
	

}
