package atm;

import java.util.ArrayList;

public class DataSource {
    public ArrayList<Customer> getCustomerData(){
        // จำลอง database
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100, "Andy", "1234"));
        customers.add(new Customer(200, "Brian", "2345"));
        return customers;
    }
}