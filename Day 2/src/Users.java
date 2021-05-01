
public class Users {
	int id;
	String name;
	String surname;
	String email;
	String password;
	
	public Users() {
		
		System.out.println();
	}
	
	public Users(int id, String name, String surname, String email, String password) {
		
		this();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		
	}
}
