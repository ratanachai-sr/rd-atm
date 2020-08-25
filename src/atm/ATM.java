package atm;

public class ATM {
    private Bank bank;
    private Customer currentCustomer;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void validateCustomer(int id, String pin){
        Customer matchCustomer = bank.findCustomer(id);
        if (matchCustomer != null && matchCustomer.checkPin(pin)){
            currentCustomer = matchCustomer;
        }
    }

    public void deposit(double amount){
        currentCustomer.getAccount().deposit(amount);
    }

    public void withdraw(double amount){
        currentCustomer.getAccount().withDraw(amount);
    }

    public void transfer(int getId, double amount){
        Customer getCustomer = bank.findCustomer(getId);
        if (getCustomer != null){
            currentCustomer.getAccount().withDraw(amount);
            getCustomer.getAccount().deposit(amount);
        }
    }

    public double getBalance(){
        return currentCustomer.getAccount().getBalance();
    }

    public void end(){
        currentCustomer = null;
    }
}