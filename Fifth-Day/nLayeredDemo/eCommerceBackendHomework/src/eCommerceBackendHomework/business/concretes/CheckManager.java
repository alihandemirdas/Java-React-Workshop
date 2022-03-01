package eCommerceBackendHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceBackendHomework.business.abstracts.CustomerCheckService;
import eCommerceBackendHomework.entities.concretes.Customer;

public class CheckManager implements CustomerCheckService{

	List<String> AllEmails = new ArrayList<String>();
	
	@Override
	public boolean checkName(Customer customer) {
		if(customer.getName().isEmpty()) {
			System.out.println("Ýsim bilgisi boþ býrakýlamaz! Yeniden dene.");
			return false;
		}
		else if(customer.getName().length() <2) {
			System.out.println("Ýsim bilgisi minimum 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkSurname(Customer customer) {
		if(customer.getSurname().isEmpty()) {
			System.out.println("Soyisim bilgisi boþ býrakýlamaz! Yeniden dene.");
			return false;
		}
		else if(customer.getSurname().length() <2) {
			System.out.println("Soyisim bilgisi minimum 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		//https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
		
		if(customer.getEmail().isEmpty()) {
			System.out.println("Email bilgisi boþ býrakýlamaz! Yeniden dene.");
			return false;
		}
		else if(!pattern.matcher(customer.getEmail()).find()) {
			System.out.println("Email bilgisi, sistemdeki email formatýna uymuyor.");
	
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().isEmpty()) {
			System.out.println("Þifre bilgisi boþ býrakýlamaz! Yeniden dene.");
			return false;
		}
		else if(customer.getPassword().length() <6) {
			System.out.println("Þifre bilgisi minimum 6 karakter olmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkCurrentEmail(Customer customer) {
		if(AllEmails.contains(customer.getEmail())) {
			System.out.println("Bu email adresi ile sistemde bir hesap bulunuyor! Farklý bir email adresi ile yeniden dene.");
			return false;
		}
		else{
			AllEmails.add(customer.getEmail());
			return true;
		}
		
	}

	@Override
	public boolean isValid(Customer customer) {
		if (checkName(customer) && checkSurname(customer) && checkEmail(customer) && checkPassword(customer)
                && checkCurrentEmail(customer)) {
            return true;
        }
        return false;
	}
	
}
