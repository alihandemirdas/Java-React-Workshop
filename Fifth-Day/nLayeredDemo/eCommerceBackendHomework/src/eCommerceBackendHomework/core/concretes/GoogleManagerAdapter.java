package eCommerceBackendHomework.core.concretes;

import eCommerceBackendHomework.core.abstracts.LoginService;
import eCommerceBackendHomework.entities.concretes.Customer;
import eCommerceBackendHomework.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService{

	@Override
	public void login(Customer customer) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.loginWithGoogle(customer.getEmail());
		
	}
	
	
}
