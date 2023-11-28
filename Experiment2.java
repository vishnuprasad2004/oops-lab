import java.util.*;

public class Experiment2 {

    public static void question1() {
        // WAJP to print the employee details like name, dept, age, dept, gender, base salary, PF 
        Scanner sc = new Scanner(System.in);
        int age, bSalary;
        char g;
        System.out.println("==EMPLOYEE DETAILS==");
        System.out.print("Enter the Name:");
        String name = sc.nextLine();
        System.out.print("Enter your Department:");
        String dept = sc.next();
        System.out.print("Enter your Age:");
        age = sc.nextInt();
        System.out.print("Enter your Base Salary:");
        bSalary = sc.nextInt();
        System.out.print("Enter your Gender:");
        g = sc.next().charAt(0);
        sc.close();
        System.out.println();
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Dept: "+ dept);
        System.out.println("Employee Age: "+ age);
        System.out.println("Employee Base Salary: "+ bSalary);
        System.out.println("Employee Gender: "+ g);
        System.out.println("Employee PFund: "+ (bSalary*0.12));
    }
    public static void question2() {
        Scanner sc = new Scanner(System.in);
        // WAJP to calculate compound Interest CI = p*(Math.pow(1+(r/100))-1)
        float p,r;
        int n;
        System.out.print("Enter Principal: ");
        p = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        r = sc.nextFloat();
        System.out.print("Enter Time Period: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Compound Interest: "+(p*(float)(Math.pow(1+(r/100),n)-1)));
    }

    public static void question3() {
        // WAJP to find out the surface area or sphere and cone
        Scanner sc = new Scanner(System.in);
        double r,h;
        System.out.println("== Sphere ==");
        System.out.print("Enter Radius: ");
        r = sc.nextDouble();
        System.out.print("Surface area:"+(4 * Math.PI * Math.pow(r,2))); 
        System.out.print("Volume:"+((4/3) * Math.PI * Math.pow(r,3))); 
        System.out.println("== Cone ==");
        System.out.print("Enter Radius: ");
        r = sc.nextDouble();
        System.out.print("Enter Height: ");
        h = sc.nextDouble();
        System.out.print("Surface area:"+(Math.PI * r * (r+Math.pow(Math.pow(h,2)+Math.pow(r,2),2)))); 
        System.out.print("Volume:"+((1/3) * Math.PI * Math.pow(r,2) * h)); 
        sc.close();
    }

    int a = 20,b = 10;
    public static void question4() {
        // WAJP to initialize the value of 2 instance variable & perform arithematic operations
        Experiment2 obj = new Experiment2();
        System.out.println("sum: "+(obj.a + obj.b));
        System.out.println("difference: "+(obj.a - obj.b));
        System.out.println("product: "+(obj.a * obj.b));
        System.out.println("quotient: "+(float)(obj.a / obj.b));
    }

    public static void print(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        // question2();
        // question3();
        // question4();
        print("Enter " + 2344);
    }
}
