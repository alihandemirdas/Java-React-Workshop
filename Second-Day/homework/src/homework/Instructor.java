package homework;

public class Instructor {
	
	public Instructor() {
		System.out.println("Instructor informations added.");
	}
	
	public Instructor(int id, String name, String branch) {
		this();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	int id;
	String name;
	String branch;
	
	
}
