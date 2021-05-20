package business.abstracts;

import java.util.List;

import core.abstracts.SignUpService;
import entities.concretes.Users;

public interface UserService {
	void signUp(Users user);
	void signUpWithAnotherService(String email,String password,SignUpService signUpService);
	void login(String email,String password);
	List<Users> getAll();
}
