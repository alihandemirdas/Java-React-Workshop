package core.concretes;

import GoogleService.GoogleRegisterManager;
import core.abstracts.SignUpService;

public class SignUpServiceAdapter implements SignUpService{

	@Override
	public void SignUpWithAnotherAccount(String email, String password) {
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(email, password);
	}

}
