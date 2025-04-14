import java.util.*;
public class reversed{
public static void main(String[]args){
System.out.println("enter the number of which you want reverse");
try (Scanner s = new Scanner(System.in)) {
    int num =s.nextInt();
    int sum ;
    int rev=0;
    while(num>0){
    sum=num%10;
    rev=rev*10+sum;
    num=num/10;
    }
    System.out.println("reversed number:"+rev);
}
}
}