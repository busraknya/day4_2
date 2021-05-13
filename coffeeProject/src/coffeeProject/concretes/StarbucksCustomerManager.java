package coffeeProject.concretes;

import coffeeProject.abstracts.BaseCustomerManager;
import coffeeProject.abstracts.CustomerCheckService;
import coffeeProject.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Kullanýcý bulunamadý.");
		}
		
	}

	
}
