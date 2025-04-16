public class BankAccount {
    int cash=0
    int chequenumber=0
    int accountnumber=0
    int accounttransfer=0
    void deposit(int cash){
        System.out.println("mode of payment is cash and amount deposited is :"+cash);
    }
    void deposit(int chequeamount,int chequenumber){
        System.out.println("mode of payment is cheque and amount deposited is :"+chequeamount)
    }
    void deposit(int accountnumber,int accounttransfer){
        System.out.println("mode of payment is account transfer and ampount deposited is :"+amounttransfer)
        
    }
}
