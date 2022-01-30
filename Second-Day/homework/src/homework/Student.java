package homework;

public class Student {
	
	public Student() {
		System.out.println("Student informations added.");
	}
	
	public Student(int id, String name, int birthday) {
		this();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	int id;
	String name;
	int birthday;


}

