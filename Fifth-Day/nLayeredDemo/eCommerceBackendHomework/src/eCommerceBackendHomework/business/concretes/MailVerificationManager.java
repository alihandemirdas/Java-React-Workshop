package eCommerceBackendHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackendHomework.business.abstracts.CustomerVerificationService;
import eCommerceBackendHomework.entities.concretes.Customer;

public class MailVerificationManager implements CustomerVerificationService{

	List<Customer> verifiedMails = new ArrayList<Customer>();
	
	@Override
	public void sendToVerifyMail(Customer customer) {
		verifiedMails.add(customer);
		System.out.println("Doðrulama maili gönderildi: " + customer.getEmail());;
		
	}

	@Override
	public void verifyMail(Customer customer) {
		System.out.println(customer.getEmail() + " mail adresi basarýyla doðrulandý!");
	}

	@Override
	public boolean checkVerifyAccount(Customer customer) {
		if (verifiedMails.contains(customer)){
            return true;
        }
        return false;
	}
	
}
