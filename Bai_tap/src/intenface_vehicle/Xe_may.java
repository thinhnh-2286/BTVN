package intenface_vehicle;

public class Xe_may extends Vihicle implements Tax{
	
	public Xe_may(String name, double amount) {
		super(name, amount);
	}

	@Override
	public void display_data() {
		System.out.println("Name: "+ name);
		System.out.println("Thue xe may VAT 5% và thue truoc ba 10%");
		amount = (amount - (amount * 0.1) + (amount * 0.05));
		System.out.println("Total amount xe may: "+amount );
		System.out.println("--------------------------");

	}

	

}
