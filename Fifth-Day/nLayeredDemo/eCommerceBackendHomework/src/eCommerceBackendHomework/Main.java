package eCommerceBackendHomework;

import eCommerceBackendHomework.business.abstracts.CustomerService;
import eCommerceBackendHomework.business.concretes.CheckManager;
import eCommerceBackendHomework.business.concretes.CustomerManager;
import eCommerceBackendHomework.business.concretes.MailVerificationManager;
import eCommerceBackendHomework.core.concretes.GoogleManagerAdapter;
import eCommerceBackendHomework.dataAccess.concretes.HibernateCustomerDao;
import eCommerceBackendHomework.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new GoogleManagerAdapter(), 
				new CheckManager(), new MailVerificationManager());
		
		Customer customer = new Customer(1,"Alihan","Demirdaþ","alihandemirdas@gmail.com","123456");
		customerService.signUp(customer);
	}

}
