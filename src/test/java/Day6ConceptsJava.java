import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Day6ConceptsJava {
	// count of specific elements of set

	
	public static void countRepeatedElementsInList(ArrayList<String> list) {
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for(String elements : list) {
			
			count.put(elements, count.getOrDefault(elements, 0)+1);
			
			
		}
		
		
		for(String keys: count.keySet()) {
			
			if(count.get(keys)>1) {
				
				System.out.println(keys + " "+ "Repeated" + " " + count.get(keys)+ " " + "times");
			}
			
			
			
		}
		
		
		
	}
	
	
	  
	  
	
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> list){
		
		HashSet<String> uniqueelements = new HashSet<String>(list);
		
		return new ArrayList<String>(uniqueelements);
		
	}
	
	


	public static void main(String[] args) {
		
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Swift");
		Cars.add("Tata");
		Cars.add("Swift");
		Cars.add("Thar");
		Cars.add("Baleno");
		Cars.add("Tata");
		Cars.add("Swift");
		
		ArrayList<String> Bikes = new ArrayList<String>();
		Bikes.add("Pulsar");
		Bikes.add("Apache");
		Bikes.add("Pulsar");
		Bikes.add("Shine");
		Bikes.add("R15");
		Bikes.add("Bullet");
		Bikes.add("Pulsar");
		
		countRepeatedElementsInList(Cars);
		
		
	 
			
	
		
		
		
		
		

	}

}
