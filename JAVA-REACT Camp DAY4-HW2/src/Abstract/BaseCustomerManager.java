package Abstract;
import Entities.*;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void Save(Customer customer) throws Exception {

        System.out.println("The customer " + customer.getFirstName() + " has saved to the database!");

    }
}
