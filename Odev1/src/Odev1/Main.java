package Odev1;

public class Main {

	public static void main(String[] args) {
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Save();
//		
//		Customer customer = new Customer();
//		customer.id = 1;
//		
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();
//		
//		Company company = new Company();
//		company.taxNumber = "123456";
//		company.companyName = "arçelik";
//		company.id = 100;
//		CustomerManager customerManager2 = new CustomerManager(company);
//		
//		Person person = new Person();
//		person.nationalIdentity = "123";
//		person.firstName = "engin";
//		person.lastName = "demiroğ";
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();
		
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.save();
		
		
	}

}
