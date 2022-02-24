
public class Gamer {
	
	public Gamer() {
		
	}
	
	public Gamer(String nationalID, String firstName, String lastName, String birthday) {
		super();
		this.nationalID = nationalID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	
	String nationalID; // We generally use String for integers if we wont do math operations
	String firstName;
	String lastName;
	String birthday;
	
	
	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
