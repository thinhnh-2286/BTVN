package Animals;

public class Cat extends Animal {
	private String color;
	private float tall;
	
	public void Cat_display_data(String name, int age, String type,String color,float tall) {
		super.display_data(name, age, type);
		System.out.println("- Color is: \t" + color);
		System.out.println("- Tall  is: \t" + tall + " met");
		System.out.println("-----------------------");

	}
	
	public Cat(String name, int age, String type, String color, float tall) {
		super(name, age, type);
		this.color = color;
		this.tall = tall;

	
	}
}
