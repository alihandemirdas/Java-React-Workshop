package inheritance;

public class CustomerManager {
	
	//Polymorphism
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " numaralý üye kaydedildi.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
}

//SOLID- O ->Open Closed Principle
//Sisteme yeni özellik eklendiðinde mevcutta bulunan hiçbir kodu deðiþtiremezsin

