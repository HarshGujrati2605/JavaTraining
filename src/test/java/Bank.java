
public abstract class Bank {

	public int rate = 15;
	final int regcost = 200;

	 abstract void loan();

	public void credit() {
		System.out.println("Amount is credited");
	}

	public void debit() {
		System.out.println("Amount is debited");
	}
	
	

}
