
public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("Alihan") ;
		student.setSurname("Demirdaş") ;
		student.setEmail("alihan@gmail.com");
		student.setDepartment("CENG");
		student.setSchool("NEU");
		
		Instructor instructor = new Instructor();
		
		instructor.setId(1);
		instructor.setName("Engin") ;
		instructor.setSurname("Demiroğ") ;
		instructor.setEmail("engin@gmail.com");
		instructor.setBranch("Java");
		instructor.setYear("15");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add();
		studentManager.list();
		studentManager.show(studentManager);
		studentManager.remove();
		studentManager.update();
		studentManager.GetIDep(student);
		studentManager.GetSSchool(student);
		
		instructorManager.add();
		instructorManager.list();
		instructorManager.show(instructorManager);
		instructorManager.remove();
		instructorManager.update();
		instructorManager.GetIBranch(instructor);
		instructorManager.GetIYear(instructor);
		
		
		

	}

}
