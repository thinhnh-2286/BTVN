package intenface_vehicle;
public class Vihicle {
	String name;
	double amount;
	
	public Vihicle(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public void display_data(String name, double amount) {
		System.out.println("Data info:");
		System.out.println("- Name: \t" + name);
		System.out.println("- Amount: \t\t" + amount);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
