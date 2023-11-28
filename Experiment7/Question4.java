package Experiment7;

/*
 * WAP to student class extending from Person class of the above Program and having regno,rollno,college_name
 *  and branch as its own instance variables. Use the constructors for this class. Use the super and this
 *  keywords in this program.Display the properties of student class object with suitable methods.
 */
public class Question4 {

}

class person {
    void display() {
        System.out.println("the details of students are");
    }
}

class student extends person {
    int reg;
    int roll;
    String name;
    String branch;

    student(int reg, int roll, String name, String branch) {
        this.reg = reg;
        this.roll = roll;
        this.name = name;
        this.branch = branch;
    }

    void print() {
        super.display();
        System.out.println("reg=" + reg);
        System.out.println("roll=" + roll);
        System.out.println("name=" + name);
        System.out.println("branch=" + branch);
    }

    public static void main(String[] args) {
        student s1 = new student(1001, 01, "subrat", "cse");
        s1.print();
    }
}