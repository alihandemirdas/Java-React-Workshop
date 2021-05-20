import business.concretes.UserManager;
import core.concretes.SignUpServiceAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.Users;

public class Main {

	public static void main(String[] args) {

		Users user1 = new Users(1, "Alihan", "Demirdas", "alihan@gmail.com", "12345");
		Users user2 = new Users(2, "Engin", "Demirog", "engin@gmail.com", "123456");
		Users user3 = new Users(3,"Admin","Bey","admin@gmail.com","1234567");
			
		UserManager userManager = new UserManager(new HibernateUserDao());
			
		userManager.signUp(user1);
		userManager.signUp(user2);
			
		userManager.login("yeniuye@gmail.com","234567");
			 
		userManager.signUpWithAnotherService("yeniuye1@gmail.com","123467",new SignUpServiceAdapter());
		
	}

}
