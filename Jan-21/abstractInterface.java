interface  Payable{
    double calAmount();
}

abstract  class Payment{
    protected  double  baseAmount;

    public Payment(double  amt) {
        baseAmount = amt;
    };
    abstract  String getPaymenType();
    void printReceipt(){
        System.out.println("Payment Type : " + getPaymenType());   
    }
}

class CreditCard extends  Payment implements  Payable{
    public  CreditCard(double  amt){
        super(amt);
    }
    @Override
    public  double  calAmount(){
        return  this.baseAmount + (this.baseAmount*0.02);
    }
    @Override
    public  String getPaymenType(){
        return  "Credit Card";
    }
    @Override
    public  void printReceipt(){
        System.out.println("Payment Type : " + getPaymenType());
        System.out.println("Total Amount : " + calAmount());
    }
}

class UPIPayment extends  Payment implements Payable{
    public  UPIPayment(double  amt){
        super(amt);
    }
    @Override
    public  double  calAmount(){
        return  this.baseAmount;
    }
    @Override
    public  String getPaymenType(){
        return "UPI Payment";
    }
    @Override
    public  void printReceipt(){
        System.out.println("Payment Type : " + getPaymenType());
        System.out.println("Total Amount : " + calAmount());
    }
}

class abstractInterface{
    public static void main(String[] args) {
        CreditCard card = new CreditCard(30000);
        UPIPayment upi = new UPIPayment(25000);
        card.printReceipt();
        System.out.println();
        upi.printReceipt();
    }
}