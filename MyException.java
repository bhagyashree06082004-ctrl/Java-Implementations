class LowBalanceException extends java.lang.Exception{
    public String toString(){
        return "Balance is low";
    }
}

public class MyException{
    public static void main(String[] args) throws LowBalanceException {
        int balance = 1000;
        if(balance < 5000){
            throw new LowBalanceException();
        }
    }
} 
