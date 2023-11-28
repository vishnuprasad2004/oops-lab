package Experiment5;

import java.util.Scanner;

public class Question2 {
    int a,b,c;
    Question2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Question2() {
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
        sc.close();
    }

    public boolean validate() {
        // System.out.println("Triangle Approved!!!");
        return ((this.a + this.b) > this.c) && ((this.a + this.c) > this.b) && ((this.b + this.c) > this.a);
    }

    public void findPerimeter() {
        if(!this.validate()) {
            System.out.println("Triangle not Approved!!!");
            return;
        }
        System.out.println("Perimeter of Triangle: " + (this.a + this.b + this.c));
    }
    
    public void findArea() {
        if(!this.validate()) {
            System.out.println("Triangle not Approved!!!");
            return;
        }
        double s = (this.a + this.b +this.c )/2;
        double area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        System.out.println("Area of Triangle: " + area);
    }
}
