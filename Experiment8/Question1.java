package Experiment8;
/*
 *  Write a java program to create a base class shape with method draw() and calculateArea().
 * Create three sub classes Circle,Square and Triangle.
 * Override the draw() method in each subclass to draw the respective shape 
 * and override the calculateArea() method to calculate and return the area of each shape. 
 */

class Shape {
    void draw() {
        System.out.println("Drawing the Shape");
    }

    void calculateArea() {
        System.out.println("Shape not defined....");
    }
}

class Triangle extends Shape {
    int side = 10;
    void draw() {
        System.out.println("   /\\\n" +"  /  \\\n" + " /    \\\n" + "/______\\");
    }
    void calculateArea() {
        System.out.println("Area:" + (0.43301270189f * this.side * this.side));
    }
}
class Square extends Shape {
    int side = 10;
    void draw() {
        System.out.println("Drawing the square....");
    }
    void calculateArea() {
        System.out.println("Area:"+(this.side * this.side));
    } 
}
class Circle extends Shape {
    int radius = 10;
    void draw() {
        System.out.println("Drawing the Circle....");
    }
    void calculateArea() {
        System.out.println("Area:"+(this.radius * this.radius * Math.PI));
    } 
}


public class Question1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.calculateArea();
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
    }
}
