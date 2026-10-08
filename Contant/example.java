
abstract class ATM {

    abstract void withdraw(double amount);
    
    abstract void deposit(double amount);
}
 
class SBIATM extends ATM {

    private double balance = 10000;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;  
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class example {

    public static void main(String[] args) {

        SBIATM user = new SBIATM();

        user.deposit(5000);

        user.withdraw(3000);

        user.showBalance();
    }
}
