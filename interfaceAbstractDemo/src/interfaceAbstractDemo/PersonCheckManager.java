package interfaceAbstractDemo;

public class PersonCheckManager implements PersonCheckSerrvice {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
