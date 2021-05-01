
public class StudentManager extends UserManager {
	
public void GetSSchool(Student student) {
		
		System.out.println(student.getName() + " is student of " + student.getSchool());
	}
	
	public void GetIDep(Student student) {
		
		System.out.println(student.getName() + " is studying " + student.getDepartment() + " at " + student.getSchool());
	}
	
	@Override
	public void add() {
		System.out.println("Ögrenci kaydi olusturuldu.");
	}
}
