package intro;

public class Main {

	public static void main(String[] args) {
		
		//Don't Repeat Yourself! - DRY
		//camelCase
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.56;
		double dolarBugun = 8.55;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu + "'ne giriþ yapýldý.");
		System.out.println("Dünün Dolar Fiyatý : " + dolarDun);
		System.out.println("Bugünün Dolar Fiyatý : " + dolarBugun);
		
		if(dolarDun < dolarBugun)
		{	
			dustuMu = false;
			System.out.println("Dolar yükseldi.");
		}
		
		else if(dolarDun > dolarBugun)
		{
			dustuMu = true;
			System.out.println("Dolar düþtü.");
		}
		
		else
		{
			System.out.println("Dolar fiyatý dün ile ayný.");
		}
		
		//Array,
		System.out.println("Kredi bilgileri yükleniyor.");
		String[] krediler = {"Hýzlý Kredi","Konut Kredisi","Taþýt Kredisi","Çiftçi Kredisi","Emekli Kredisi"};
		
		for(int i=0; i<krediler.length; i++)
		{
			System.out.println(i+1 + ".Kredi Türü: " + krediler[i]);
		}
		
		//foreach
		for(String kredi : krediler)
		{
			System.out.println(kredi);
		}
		
		//deðer tip, int,double,boolean
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//referans tip, dizi,class,interface,abstract class
		//string referans tip olsa da deðer tip gibi çalýþýr
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		
		
		
		
	}

}
