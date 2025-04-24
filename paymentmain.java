import java.util.*;
abstract  class Payment{
abstract void verifyingpayment();
abstract void paymentdetail();
void paymentconfirmation(){
System.out.println("paise aa gaye");
}
} 
class Creditcard extends Payment{
public void verifyingpayment(){
System.out.println("your payment is ongoing");
}
public void paymentdetail(){
System.out.println("you have chossem credit card for  payment ");
}
}
class Paypal extends Payment{
public void verifyingpayment(){
System.out.println("your payment is ongoing");
}
public void paymentdetail(){
System.out.println("you have chose Paypal for payment ");
}
}
public class Paymentmain{
public static void main(String[]args){
Payment c=new Creditcard();
Payment p=new Paypal();
System.out.println("press 1 for credit card and 2 for paypal");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
switch(n){
case 1:{
c.verifyingpayment();
c.paymentdetail();
c.paymentconfirmation();
}break;
case 2:{
p.verifyingpayment();
p.paymentdetail();
p.paymentconfirmation();
}break;
default:{
System.out.println("enter correct payment method ");
}
}
}
}