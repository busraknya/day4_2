package coffeeProject;

import coffeeProject.abstracts.BaseCustomerManager;
import coffeeProject.adapters.MernisServiceAdapter;
import coffeeProject.concretes.StarbucksCustomerManager;
import coffeeProject.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Büþra", "Konya", 2001 , 11111111111L));
		
	}

}


