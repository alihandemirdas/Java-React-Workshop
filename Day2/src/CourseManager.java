
public class CourseManager {
	
	public void registerForCourse(Users user, Course course) {
		
		System.out.println("Merhaba " + user.name + "! "+ course.courseName + " kursuna kaydın başarıyla oluşturuldu." );
	}
	
	public void cancelForCourse(Users user, Course course) {
		
		System.out.println("Merhaba " + user.name + "! "+ course.courseName + " kursundan kaydın silindi :(");
	}
	
	
}
