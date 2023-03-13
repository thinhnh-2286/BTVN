package intenface_vehicle;

public class Xe_dap extends Vihicle implements Tax{
	
	public Xe_dap(String name, float amount) {
		super(name, amount);
	}

	
	@Override
	public void display_data() {
		System.out.println("Name: "+ name);
		System.out.println("Xe dap khong tinh thue");
		System.out.println("Total amount xe dap: "+ amount);
		System.out.println("----------------------");

	}

	

}
