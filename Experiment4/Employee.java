import java.util.*;
public class Employee {
    int empId;
    String name;
    String qualification;

    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Insert Employee Record ====");
        System.out.print("Enter your Name:");
        this.name = sc.next();
        System.out.print("Enter your Employee ID:");
        this.empId = sc.nextInt();       
        System.out.print("Enter your Qualification: ");
        this.qualification = sc.next();
        System.out.println("=== Employee Inserted ===");
        sc.close();
    }

    void show() {
        System.out.println("Name:" + this.name);
        System.out.println("Name:" + this.empId);
        System.out.println("Name:" + this.qualification);
    }

}
