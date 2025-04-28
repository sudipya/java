// Student.java
public class student {
    // Instance variables
    String name;
    int age;

    // Default Constructor
    student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating object using Default Constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("----------------------------");

        // Creating object using Parameterized Constructor
        Student student2 = new Student("Sudipya Raj", 20);
        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}
