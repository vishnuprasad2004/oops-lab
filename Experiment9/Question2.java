package Experiment9;

abstract class Shape {
    abstract Shape draw();
}

class Rectangle extends Shape {
    public Rectangle draw() {
        return new Rectangle();
    }

    void display() {
        System.out.println("This is Rectangle Class");
    }
}

class Circle extends Shape {
   public Circle draw() {
        return new Circle();
   }

    public void display() {
        System.out.println("This is Circle Class");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        Circle c1 = c.draw();
        Rectangle r = new Rectangle();
        r.display();
        Rectangle r1 = r.draw();
    }

}
