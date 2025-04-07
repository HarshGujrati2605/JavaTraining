
public class TestBank {

	public static void main(String[] args) {
	     HDFC obj = new HDFC();
	     obj.credit();
	     obj.funds();
	     obj.loan();
	     
	     Bank obj2 = new HDFC();   // dynamic polymorphism
	     obj2.loan();
	     
	    // Bank obj3 = new Bank()   // we cannot able to create the objects of abstract classes
	     
	     

	}

}
