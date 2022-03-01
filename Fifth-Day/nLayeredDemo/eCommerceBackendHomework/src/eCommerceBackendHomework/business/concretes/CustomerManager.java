package eCommerceBackendHomework.business.concretes;

import java.util.List;

import eCommerceBackendHomework.business.abstracts.CustomerCheckService;
import eCommerceBackendHomework.business.abstracts.CustomerService;
import eCommerceBackendHomework.business.abstracts.CustomerVerificationService;
import eCommerceBackendHomework.core.concretes.GoogleManagerAdapter;
import eCommerceBackendHomework.dataAccess.abstracts.CustomerDao;
import eCommerceBackendHomework.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	private CustomerCheckService customerCheckService;
	private CustomerVerificationService customerVerificationService;
	private GoogleManagerAdapter googleManagerAdapter;
	
	
	public CustomerManager(GoogleManagerAdapter googleManagerAdapter, CustomerCheckService customerCheckService, CustomerVerificationService customerVerificationService) {
		super();
		this.googleManagerAdapter = googleManagerAdapter;
		this.customerCheckService = customerCheckService;
		this.customerVerificationService = customerVerificationService;
	}

	@Override
	public void signUp(Customer customer) {
		if(customerCheckService.isValid(customer)) {
			customerVerificationService.sendToVerifyMail(customer);
			customerVerificationService.verifyMail(customer);
			googleManagerAdapter.login(customer);
		}
		else {
			System.out.println("Bir hata oluþtu, lütfen bilgilerinizi güncelleyip yeniden deneyiniz.");
		}
		
	}

	@Override
	public void login(Customer customer) {
		if(customerVerificationService.checkVerifyAccount(customer)) {
			System.out.println("Sisteme giriþ yapýldý.");
		}
		else {
			System.out.println("Sisteme giriþ yapýlamadý.");
		}
		
	}

	

}
