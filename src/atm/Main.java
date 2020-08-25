package atm;

public class Main {
    public static void main(String[] args) {
        Customer peter = new Customer(1, "Peter", "1234");
        Customer nancy = new Customer(2, "Nancy", "1234");
        peter.getAccount().deposit(100);
        nancy.getAccount().withDraw(100);
        nancy.getAccount().transfer(peter.getAccount(), 100);
        System.out.println(peter);
        System.out.println(nancy);
        Customer johndo = new Customer(3, "Johndo", "1234");
        System.out.println(johndo);
        System.out.println(johndo.checkPin("1234"));
        Bank bank = new Bank("KTB");
        bank.addCustomer(peter);
        bank.addCustomer(nancy);
        bank.addCustomer(johndo);
        System.out.println(bank.findCustomer(3));
        System.out.println(bank);

        ATM atm = new ATM(bank);
        atm.validateCustomer(2, "1234");
        atm.deposit(1000);
        atm.transfer(1,20);
        System.out.println(peter);
        System.out.println(nancy);
    }
}
