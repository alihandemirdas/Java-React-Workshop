
public class InstructorManager extends UserManager{
	
	
	
	public void GetIBranch(Instructor instructor) {
		
		System.out.println(instructor.getName() + " is a " + instructor.getBranch() + " instructor. He will do best for you.");
	}
	
	public void GetIYear(Instructor instructor) {
		
		System.out.println(instructor.getName() + " has been an instructor for " + instructor.getYear() + " years.");
	}
	
	

}
