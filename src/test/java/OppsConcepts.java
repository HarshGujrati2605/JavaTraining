
public class  OppsConcepts {
	
	

	public static void main(String[] args) {
		
		System.out.println("Hello Gopi");
		
		String name = new String("Gopi");
		String nametwo = new String("Gopi");
		String namethree ="Gopi";
		String namefour = "Gopi";
		
		System.out.println(name.equals(nametwo));
		System.out.println(name == nametwo);
		
		System.out.println(namethree.equals(namefour));
		System.out.println(namethree == namefour);
		System.out.println(nametwo == namefour);
		
		String sent = "This is Indore";
		String sent2 = "This is Indore";
//		System.out.println(sent.toUpperCase());
//		System.out.println(sent.toLowerCase());
//		System.out.println(sent.trim().length());
		System.out.println(sent.replaceAll(" ", "*"));
		
		StringBuffer a = new StringBuffer("This is Indore");
		System.out.println(a.reverse());
		
		System.out.println(sent.charAt(13));
		System.out.println(sent.replace(" ", "").indexOf('I'));
		System.out.println(sent.replace(" ", "").substring(6 , 12));
		String[] arr = sent.split(" ");
		System.out.println(arr.length);
		System.out.println(arr[2]);
		
		
		
		
		String b = "Indore";
		String c = "indore";
		
		System.out.println(b.equals(c));
       
	}

}
