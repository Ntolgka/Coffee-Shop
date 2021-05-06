package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.*;

public class MernisServiceAdapter implements CustomerCheckService {



    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {

        HFJKPSPublicSoap client = new HFJKPSPublicSoap();

        return client.TCKimlikNoDogrula(
                Long.parseLong(customer.getTCKN()),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getBirthDate().getYear()
        );

    }
}
