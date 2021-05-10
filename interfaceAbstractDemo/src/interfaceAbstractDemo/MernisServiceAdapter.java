package interfaceAbstractDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckSerrvice {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean b = false;
		try {
			b = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(), customer.dateOfBirth.getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

}
