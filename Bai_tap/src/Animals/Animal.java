package Animals;

public class Animal {
	protected String name;
	protected int age;
	protected String type;

	public Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void display_data(String name, int age, String type) {
		System.out.println("Data info:");
		System.out.println("- Name: \t" + name);
		System.out.println("- Age: \t\t" + age + " age");
		System.out.println("- Type: \t" + type);

	}

	public static void main(String[] args) {
		Dog d1 = new Dog("A", 4, "Cho", "a", 4.5f);
		Dog d2 = new Dog("A", 4, "Cho", "a", 4.5f);
		d1.Dog_display_data("Chó 1", 4, "Cỏ", "Đen", 4.5f);
		d2.Dog_display_data("Chó 2", 4, "Cỏ", "Đen", 4.5f);

		Cat c1 = new Cat("A", 4, "Cho", "a", 4.5f);
		Cat c2 = new Cat("A", 4, "Cho", "a", 4.5f);
		c1.Cat_display_data("Mèo 1 ", 2, "Thần tài", "Vàng", 3.0f);
		c2.Cat_display_data("Mèo 2 ", 2, "Thần tài", "Vàng", 3.0f);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
