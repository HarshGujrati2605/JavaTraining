import java.util.HashMap;
import java.util.Map;

public class Day7Concepts {


	public static int firstRepeatingCharacter(String str) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();

		for (char cr : str.toCharArray()) {

			count.put(cr, count.getOrDefault(cr, 0) + 1);

		}

		for (int i = 0; i < str.length(); i++) {

			if (count.get(str.charAt(i)) == 1) {
				return i;
				
			}
		}

		return -1;

	}
	
	protected static  void printname(String name) {
		System.out.println("Your name is " + name);
	}
	


	public static void main(String[] args) {
		
		int result =firstRepeatingCharacter("eeeeellltcodel");
		System.out.println(result);
		
		

	}

}
