package oopIntro;

public class Product {
	//constructer
	//classý oluþtururken olmasýný istediðimiz þeyi yazýyoruz.
	public Product() {
		System.out.println("Ben çalýþtým.");
	}
	//Bu 2 product, imza
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //Ben çalýþtýmý yazdýrýr, yani parametresiz imzayý çalýþtýrýr.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
