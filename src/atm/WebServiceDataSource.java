package atm;

import java.util.ArrayList;

public class WebServiceDataSource implements DataSource{
    public ArrayList<Customer> getCustomerData(){
        // จำลองต่อ web service api
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(300, "แอนดี้", "1234"));
        customers.add(new Customer(300, "ไบร์อัน", "2345"));
        return customers;
    }
}
