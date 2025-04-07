import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day5ConceptsJava {

	public static ArrayList<String> mergeList(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> mergedList = new ArrayList<String>(list1); // Initialize with list1
		mergedList.addAll(list2); // Add all elements from list2
		return mergedList;
	}

	public static ArrayList<String> removeDuplicateElements(ArrayList<String> list) {
		HashSet<String> uniqueelements = new HashSet<String>(list);

		return new ArrayList<String>(uniqueelements);

	}

	public static void countRepeatedElements(ArrayList<String> list) {

		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for (String elements : list) {
			count.put(elements, count.getOrDefault(elements, 0) + 1);
		}
		for (String elekeys : count.keySet()) {
			if (count.get(elekeys) > 1) {
				System.out.println(elekeys + "appears " + count.get(elekeys) + "times");
			}
		}

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

//		System.out.println("Merge list is" + mergeList(Cars, Bikes));
//
//		
//		System.out.println("List after removing duplicate elements" + removeDuplicateElements(Cars));
//	
//		
    	countRepeatedElements(Bikes);

		Set<String> uniquebikes = new HashSet<String>(Bikes);
		
		

		for (String bike : uniquebikes) {
			System.out.println(bike + "Count is : " + Collections.frequency(Bikes, bike));

		}

	}

}
