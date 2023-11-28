import java.util.*;

public class Student {
    String name;
    String rollno;
    int marks[] = new int[5];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Insert Student Record====");
        System.out.print("Enter your Name:");
        this.name = sc.next();
        System.out.print("Enter your Rollno:");
        this.rollno = sc.next();       
        System.out.print("Enter your Marks:");
        for(int i=0; i<this.marks.length; i++) {
            this.marks[i] = sc.nextInt();
        }
        System.out.println("====Student Inserted====");
        sc.close();
    }

    void printDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll no: " + this.rollno);
        System.out.println("Marks: " + this.marks);
    }

    void printAvg() {
        int avg = 0;
        for (int i = 0; i < this.marks.length; i++) {
            avg += this.marks[i];
        }
        avg = avg / 5; 
        System.out.println("The average is:" + avg);
    }
}
