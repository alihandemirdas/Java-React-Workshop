
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Dersi","Bu kurs ile Java uzmaný olacaksýnýz.","Engin Demiroð","10$");
		
		Course course2 = new Course(2,"C# Dersi","Bu kurs ile C# uzmaný olacaksýnýz.","Engin Demiroð","11$");
		
		Users user = new Users(1,"Alihan","Demirdas","alihan@mail.com","12345");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registerForCourse(user, course1);
		courseManager.registerForCourse(user, course2);
		
		courseManager.cancelForCourse(user, course1);
		courseManager.cancelForCourse(user, course2);
		
		
		
		

	}

}
