
import java.util.Scanner;

class Account{
    protected  long  AccNo = 0;
    protected  double  amount = 0;
    protected  String name = "xxx";
    protected   String DOB = "dd-mm-yyyy";
    protected  String Addess = "xxxx";
    protected  String MobNo = "91xxxxxx00";

    public  static int i = 0;

    public  Account(){};
    public  Account(String name, String DOB, String Address, String MobNo, double  Amount){
        this.AccNo = ++i;
        this.amount = Amount;
        this.name = name;
        this.DOB = DOB;
        this.Addess = Address;
        this.MobNo = MobNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAmount(double amt){
        this.amount = amt;
    }
    public  void setDOB(String dob){
        this.DOB = dob;
    }
    public String getName(){
        return  this.name;
    }
    public double  getAmt(){
        return  this.amount;
    }
    public String  getDOB(){
        return  this.DOB;
    }
    public  long getAccNo(){
        return  this.AccNo;
    }
    @Override
    public String toString(){
        return "\nAccNo: " + this.AccNo + "\n" +
                "Name: " + this.name + "\n" +
                "DOB: " + this.DOB + "\n" +
                "Address: " + this.Addess + "\n" +
                "MobNo: " + this.MobNo + "\n" +
                "Amount: " + this.amount;
    }
}

class SavingsAcc extends  Account {
    public double interest;
    public  SavingsAcc () {};
    public  SavingsAcc(String name, String DOB, String Address, String MobNo, double  Amount, double  interest){
        super(name, DOB, Address, MobNo, Amount);
        this.interest = interest;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Interest: " + this.interest;
    }
    @Override
    public double getAmt(){
        return this.amount + this.amount*(this.interest/100);
    }
}

class LoanAcc extends  Account{
    public double emi;
    public double interest;
    public double SI;
    public int duration;

    public LoanAcc (){};
    public LoanAcc (String name, String DOB, String Address, String MobNo, double  Amount, double  interest, int duration){
        super(name, DOB, Address, MobNo, Amount);
        this.interest = interest;
        this.duration = duration;
        this.SI = ((this.amount*this.interest)/100*12);
        this.emi = (this.amount + (this.SI*this.duration)/this.duration)/this.duration;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Interest: " + this.interest + "\n" +
                "EMI: " + this.emi + "\n" +
                "Duration: " + this.duration + " months";
    }
    public double getEmi(){ 
        return this.emi;
    }
    public void updateInterest(double interest){
        this.interest = interest;
        this.SI = ((this.amount*this.interest)/100*12);
        this.emi = (this.amount + (this.SI*this.duration)/this.duration)/this.duration;
    }
    public  int getDuration(){
        return this.duration;
    }
}
class classInheritance{
    public static void main(String[] args) {
        Account A = new Account("A", "20/01/2026", "Pune", "9754125452", 10000);
        System.out.println(A);
        SavingsAcc sv = new SavingsAcc("B", "21/01/2026", "Amravati", "7894456913", 25000, 3.75);
        System.out.println(sv);
        LoanAcc lacc = new LoanAcc("C", "22/01/2026", "Mumbai", "9646756913", 35000, 8.95, 12);
        System.out.println(lacc); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new interest rate in % : ");
        lacc.updateInterest(sc.nextDouble());
        System.out.println("New EMI is : " + lacc.getEmi());
        sc.close();
    }
}