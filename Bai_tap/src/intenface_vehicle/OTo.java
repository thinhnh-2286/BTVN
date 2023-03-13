package intenface_vehicle;

public class OTo extends Vihicle implements Tax {
	public OTo(String name, double amount) {
		super(name, amount);
	}

	@Override
	public void display_data() {
		System.out.println("Name: "+ name);
		System.out.println("Thue xe may VAT 10% và thue truoc ba 2%");
		amount = (amount - (amount * 0.1)+ (amount * 0.02));
		System.out.println("Total amount o to: "+amount );
		System.out.println("--------------------------");
		
	}
}
