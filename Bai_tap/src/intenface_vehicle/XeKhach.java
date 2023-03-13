package intenface_vehicle;

public class XeKhach  extends Vihicle implements Tax{
	protected int type;
	public XeKhach(String name, double amount,int type) {
		super(name, amount);
		this.type = type;
	}
	@Override
	public void display_data() {
		System.out.println("Name: "+ name);
		if (type >=5) {
			System.out.println("Xe ô tô khách >= 5 chổ: VAT = 10%, thuế trước bạ 20% và thuế tiêu thụ đặc biệt 30%");
			amount = (amount + (amount * 0.1) + (amount * 0.2) + (amount * 0.3));
			System.out.println("Total amount ô tô khách: "+amount );
			System.out.println("--------------------------");
		}
		else {
			System.out.println("Xe ô tô khách < 5 chổ: VAT = 10%, thuế trước bạ 20% và thuế tiêu thụ đặc biệt 50% ");
			amount = (amount + (amount * 0.1) + (amount * 0.2) + (amount * 0.5));
			System.out.println("Total amount ô tô khách: "+amount );
			System.out.println("--------------------------");
		}
	
		
	}

}
