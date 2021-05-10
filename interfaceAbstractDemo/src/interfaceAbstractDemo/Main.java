package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Abdullah Umut", "Öztürk", LocalDate.parse("1990-01-13"), "12215203460"));
	}

}
