

class Account {
    private double balance;

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {

        Account acc = new Account();

        // acc.balance = 5000 // NOT ALLOWED (set via methods)

        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
