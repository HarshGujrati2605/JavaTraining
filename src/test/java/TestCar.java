
public class TestCar {

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.engineType();
		obj.startmethod();
		obj.stopmethod();
		
		Car ref = new BMW();
		ref.engineType();
		ref.stopmethod();
		ref.startmethod(); // This method is start method wrote by Lucky

	}

}
