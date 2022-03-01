package eCommerceBackendHomework.business.abstracts;

import java.util.List;

import eCommerceBackendHomework.entities.concretes.Customer;

public interface CustomerService {
	void signUp(Customer customer) {};
	void login(Customer customer) {};
	
}