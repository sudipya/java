class Student {
    String name;
    int age;
   
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
 }
 
 
 public class OOPS {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();
 
 
        student s2 = new student();
        s2.name = "Shradha";
        s2.age = 22;
        s2.getInfo();
    }
 }
 
 