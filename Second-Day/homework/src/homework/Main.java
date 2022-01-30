package homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Alihan",2002);
		Student student2 = new Student();
		student2.id = 2;
		student2.name = "Akif";
		
		Student[] students = {student1, student2};
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.name = "Engin";
		instructor1.branch = "Software";
		Instructor instructor2 = new Instructor(2,"Kerem","Software");
		
		Instructor[] instructors = {instructor1,instructor2};
		
		StudentManager studentManager = new StudentManager();
		studentManager.printInformations(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToSystem(instructors);
	}

}
