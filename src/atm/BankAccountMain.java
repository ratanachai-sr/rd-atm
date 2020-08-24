package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount peter = new BankAccount(1, "Peter", "Saving");
        BankAccount nancy = new BankAccount(2, "Nancy", "Saving", 1000);
        peter.deposit(100);
        nancy.withDraw(100);
        nancy.transfer(peter, 100);
        System.out.println(peter);
        System.out.println(nancy);
        Customer johndo = new Customer(3, "Johndo", "1234");
        System.out.println(johndo);
    }
}
