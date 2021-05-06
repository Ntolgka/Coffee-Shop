package Concrete;

import Abstract.*;
import Adapters.MernisServiceAdapter;
import Entities.Customer;
import Mernis.*;
import Adapters.*;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {

        if (customerCheckService.CheckIfRealPerson(customer)) {

            super.Save(customer);
        }

        else {

            System.err.println("Not a valid person.");

        }

    }

}
