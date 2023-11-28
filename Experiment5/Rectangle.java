package Experiment5;

import java.util.Scanner;

/**
 * write a program to create a class Rectangle with default constructor, one argument constructor, and two argument constructors, and define the methods area and perimeter of the rectangle. create three different objects with help of three different constructors and print the area and perimeter of those objects 
 */
public class Rectangle {
    int length,breadth;
    Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
        this.length = sc.nextInt();
        System.out.print("Enter Breadth:");
        this.breadth = sc.nextInt();
        sc.close();
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle(int length) {
        this.length = length;
        this.breadth = length;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (this.breadth + this.length)));
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (this.length * this.breadth));
    }
}

