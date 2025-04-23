import java.util.*;
public class BankAccount{
int cash=0;
int balance=0;
int chequenumber=0;
int chequeamount=0;
int accountNumber=0;
int amounttransfer=0;
void deposit(int cash){
balance+=cash;
System.out.println("mode of payment is cash and amount deposited is:"+cash);
System.out.println("now your current balance is "+balance);
}
void deposit(int chequeamount,int chequenumber){
balance+=chequeamount;
System.out.println("mode of payment is cheque and amount deposited is:"+chequeamount);
System.out.println("now your current balance is "+balance);
}
void deposittransfer(int accountNumber,int amounttransfer){
balance+=amounttransfer;
System.out.println("mode of payment is account transfer and amount deposited is:"+amounttransfer);
System.out.println("now your current balance is "+balance);
}
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
BankAccount obj= new BankAccount();
System.out.println("enter the mode of payment");
System.out.println("1.for cash\n 2.for cheque\n 3.for accounttransfer");
int c=sc.nextInt();
switch(c){
case 1:{
System.out.println("enter amount cash");
int cash=sc.nextInt();
obj.deposit(cash);
}break;
case 2:{
System.out.println("enter cheque number and amount");
int chequenumber=sc.nextInt();
int chequeamount=sc.nextInt();
obj.deposit(chequeamount,chequenumber);
}break;
case 3:{
System.out.println("enter account number and amount");
int accountNumber=sc.nextInt();
int amounttransfer=sc.nextInt();
obj.deposittransfer(accountNumber,amounttransfer);
}break;
default:{
System.out.print("enter a valid mode of payment");
}
} 
}
}
