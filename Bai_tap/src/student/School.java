package student;
	
public class School {
	protected  String name;
	protected  String classes;
	protected  int age;
	protected  String province;
	

	public School add_infor(String name, String classes, int age, String province) {
		this.name = name;
		this.classes = classes;
		this.age = age;
		this.province = province;
		return this;
	}


	public void display_data(){
		System.out.println("- Name of students: " + name);
		System.out.println("- Class of students:" + classes);
		System.out.println("- Age of students: " + age);
		System.out.println("- Province of students: " + province);
		System.out.println("----------------------------------------------------");

	}
}