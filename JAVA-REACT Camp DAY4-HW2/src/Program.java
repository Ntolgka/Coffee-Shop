import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.*;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws Exception {

    BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
    customerManager.Save(new Customer(1, "NTOLGKA", "NALMPANT", new Date(2000, 12, 5), "99000000000"));

    }
}
