
public class Vechile {
	
	
	String brand;
	String model;
	int quantitysold;
	
	public Vechile(String brand) {
		this.brand = brand;	
	}
	
	public Vechile(String brand, String model, int quantitysold) {
	
     	this.brand = brand;
		this.model = model;
		this.quantitysold = quantitysold;
	}

	public static void printBrand(String brand) {
		System.out.println("Barnd name" + brand);
	}
	
	public static void printModel(String modelname)
	{
		System.out.println("Model is "+ modelname);
	}
	
	public static void quantity(int quantity) {
		System.out.println("Vechile sold number is" + quantity);
	}
	

	public static void main(String[] args) {
	
		
		
		
		
		

	}

}
