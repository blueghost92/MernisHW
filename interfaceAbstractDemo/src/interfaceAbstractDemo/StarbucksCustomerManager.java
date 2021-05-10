package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {

	BaseCustomerManager base = new BaseCustomerManager() {
	};

	PersonCheckSerrvice personCheckService;

	public StarbucksCustomerManager(PersonCheckSerrvice personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (personCheckService.checkIfRealPerson(customer)) {
			base.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
