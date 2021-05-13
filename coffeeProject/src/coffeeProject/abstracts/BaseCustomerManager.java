package coffeeProject.abstracts;

import coffeeProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db : "+customer.getFirstName());
		
	}

}
