class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance! Available Balance = " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Balance = " + balance);
    }
}

public class p113 {
    public static void main(String[] args) {

        Account a = new Account(5000);

        try {
            a.display();

            a.withdraw(2000);
            a.display();

            a.withdraw(4000); // Exception

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}