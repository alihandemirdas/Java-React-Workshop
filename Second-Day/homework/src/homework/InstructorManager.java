package homework;

public class InstructorManager {
	
	public void addToSystem(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Instructor ID: "+instructor.id);
			System.out.println("Instructor Name: "+instructor.name);
			System.out.println("Instructor Branch: "+instructor.branch);
			System.out.println("");
		}
	}
}
