package Experiment9;

import java.util.*;

abstract class Shape {
    abstract double CalculateArea();
    abstract double CalculateVolume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double CalculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    double CalculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double CalculateArea() {
        return (Math.PI * radius * radius) + (Math.PI * radius * Math.sqrt((radius * radius) + (height * height)));
    }

    double CalculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double CalculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double CalculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Box extends Shape {
    double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double CalculateArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    double CalculateVolume() {
        return length * breadth * height;
    }
}

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        double SR = sc.nextDouble();
        Sphere sphere = new Sphere(SR);
        System.out.print("Enter the radius of the cone: ");
        double C1R =sc.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double C1H = sc.nextDouble();
        Cone cone = new Cone(C1R, C1H);
        System.out.print("Enter the radius of the Cylinder: ");
        double CR = sc.nextDouble();
        System.out.print("Enter the height of the Cylinder: ");
        double CH = sc.nextDouble();
        Cylinder cylinder = new Cylinder(CR, CH);
        System.out.print("Enter the length of the Box: ");
        double BL = sc.nextDouble();
        System.out.print("Enter the breadth of the Box: ");
        double BB = sc.nextDouble();
        System.out.print("Enter the height of the Box: ");
        double BH = sc.nextDouble();
        Box box = new Box(BL, BB, BH);
        System.out.println("Area of the Sphere is: " + sphere.CalculateArea());
        System.out.println("Volume of the Sphere is: " + sphere.CalculateVolume());
        System.out.println("Area of the Cone is: " + cone.CalculateArea());
        System.out.println("Volume of the Cone is: " + cone.CalculateVolume());
        System.out.println("Area of the Cylinder is: " + cylinder.CalculateArea());
        System.out.println("Volume of the Sphere is: " + cylinder.CalculateVolume());
        System.out.println("Area of the Box is: " + box.CalculateArea());
        System.out.println("Volume of the Box is: " + box.CalculateVolume());
        sc.close();
    }
}

// abstract class Shape {
//     abstract void calcArea();
//     abstract void calcVolume();
// }

// class Sphere extends Shape {
//     void calcArea(int d) {
//         System.out.println("Area of Sphere:");
//     }
//     void calcVolume() {
//         System.out.println("Volume of Sphere:");
//     }
// }

// class Cone extends Shape {
//     void calcArea(int d) {
//         System.out.println("Area of Cone:");
//     }
//     void calcVolume() {
//         System.out.println("Volume of Cone:");
//     }
// }

// class Cylinder extends Shape{
//     void calcArea(int d) {
//         System.out.println("Area of Cylinder:");
//     }
//     void calcVolume() {
//         System.out.println("Volume of Cylinder:");
//     }
// }

// class Box {
//     void calcArea(int d) {
//         System.out.println("Area of Box:");
//     }
//     void calcVolume() {
//         System.out.println("Volume of Box:");
//     }
// }

// public class Question3 {
//     public static void main(String[] args) {
//         Box
//     }
// }
