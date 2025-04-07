
public class Cars extends Vechile{

	public Cars(String brand, String model, int quantitysold) {
		super(brand, model, quantitysold);
		System.out.println("The brand name is " + " " + brand);
	}
	
	public static void printModel(String modelname)
	{
		System.out.println("Model of car is "+ modelname);
	}

	
	
	public static void main(String[] args) {
		
		Cars obj = new Cars("Honda", "civic", 1);
		obj.printModel("Honda");
		
		
		
		

	}

}
