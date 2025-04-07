import java.util.ArrayList;
import java.util.Iterator;

public class Day4JavaConcepts {
	
	/** 
	 * 
	 * A List is an ordered collection that allows duplicate elements.

Unlike arrays, lists are dynamic (they can grow and shrink in size).

Lists in Java are implemented via:

ArrayList (most commonly used)

Conversion of Array To ArrayList in Java  using rrays.asList(geeks);

Iterating Over a List

Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
    
    Use ArrayList when:

You need fast random access (get(index)).

You have many read operations and fewer insertions/removals.

Memory efficiency is important.

Use LinkedList when:

You frequently insert/delete elements at the beginning or middle.

You don't need fast random access but care about efficient modifications.


	 */

	public static void main(String[] args) {
		
//		ArrayList<String> cars = new ArrayList<String>();
//		cars.add("Swift");
//		cars.add("Thar");
//		cars.add("Balleno");
//		
//		
//		Iterator<String> it = cars.iterator();
//		//System.out.println(it.hasNext());
//		System.out.println(cars);
//		while(it.hasNext()) {
//			if(it.next() == "Thar") {
//				it.remove();
//			}
//		//	System.out.println(it.next());
//			
//			
//			
//		}
//		System.out.println(cars);
		
		ArrayList<String> cars = new ArrayList<String>();
        cars.add("Thar");
        cars.add("tata");
        cars.add("tata");
        cars.add("tata");
        cars.add("swift");
        cars.add("Baleno");
        cars.add("tata");
        
    //  QA.  // Remove the last tata and also give the count of tata in the list.
        
        System.out.println(cars.size());
        System.out.println(cars);
        
//        cars.remove(1);
//        System.out.println(cars);
        
//        cars.remove("Thar");
//        System.out.println(cars);
        
//           
//        for(int i =0 ; i<cars.size(); i++) {
////        	System.out.println(cars.get(i));
//        	if(cars.get(i) == "swift") {
//        		cars.remove(i);
//        		System.out.println("Swift is removed");
//        		break;
//        	}
//        }
//        System.out.println(cars);
//        
//        for(String car: cars) {
//        	System.out.println(car);
//        	if(car == "swift") {
//        		cars.remove("swift");
//        		System.out.println(cars);
//        		break;
//        	}
//        }
//        
//        System.out.println(cars);
//        cars.remove("bus");
//        System.out.println(cars.size() - 1);
//       System.out.println(cars.set(1, "Indica"));
//        System.out.println(cars);
        
        for(int i =0; i< cars.size(); i++) {
        	
        	if(cars.get(i)== "tata") {
        		cars.set(i, "Indica");
        	}
        }
        System.out.println(cars);
       String str = "Tata In";
       String strtwo = "Tata";
       System.out.println(str.equals(strtwo));

	}

}
