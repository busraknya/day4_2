package coffeeProject.concretes;

import coffeeProject.abstracts.CustomerCheckService;
import coffeeProject.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
