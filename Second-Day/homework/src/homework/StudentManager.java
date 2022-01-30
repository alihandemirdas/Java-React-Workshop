package homework;

public class StudentManager {
	
	public void printInformations(Student[] students) {
		for (Student student : students) {
			System.out.println("Student ID: "+student.id);
			System.out.println("Student Name: "+student.name);
			System.out.println("Student Birthday: "+student.birthday);
			System.out.println("");
		}
	}


}
