package Animals;

public class Dog extends Animal {
	private String color;
	private float height;

	
	public Dog(String name, int age, String type, String color, float height) {
		super(name, age, type);
		this.color = color;
		this.height = height;

	}
	public void Dog_display_data(String name, int age, String type,String color,float height) {
		super.display_data(name, age, type);
		System.out.println("- Color is: \t" + color);
		System.out.println("- Height is: \t" + height + "kg");
		System.out.println("-----------------------");
	}
	
}
