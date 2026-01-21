class Account {
    private final String accNo;
    private final String name;
    private String address;
    private String phno;
    private final String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {

    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }
}

public class Inheritance1 {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                "SA101", "Pratiksha", "Pune", "9999999999", "01-01-2002");
        sa.deposit(5000);
        sa.withdraw(1500);

        System.out.println("Savings Account Balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount(
                "LA201", "Pratiksha", "Pune", "9999999999", "01-01-2002");
        la.balance = 10000; // loan amount
        la.payEMI(3000);

        System.out.println("Loan Account Balance: " + la.getBalance());
    }
}
