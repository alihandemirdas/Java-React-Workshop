package inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Inheritance - Miras
		IndividualCustomer alihan = new IndividualCustomer();
		alihan.id = 1;
		alihan.firstName = "Alihan";
		alihan.lastName = "Demirdaþ";
		alihan.nationalIdentity = "12345678900";
		alihan.customerNumber = "1";
		
		CorporateCustomer bank = new CorporateCustomer();
		bank.id = 2;
		bank.customerNumber = "2";
		bank.companyName = "Halkbank";
		bank.taxNumber = "2";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {alihan,bank};
		customerManager.addMultiple(customers);
		
	
	}

}
