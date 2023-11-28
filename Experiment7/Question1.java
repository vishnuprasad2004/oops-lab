package Experiment7;
/*
 * Define a class dimension,inherit class line from dimension,rectangle from line,and box from rectangle. write a print function in each class to print the class properties. Each class should have some number of constructors.
 */

class Dimension {
    Dimension() {
        System.out.println("Dimension Class");
    }
}


class Line extends Dimension {
    int length;
    Line() {
        this.length = 0;
    }
    Line(int l) {
        length = l;
    }
   
}


class Rectangle extends Line {
    int width;
    
    
}


class Box extends Rectangle {
    
}

public class Question1 {
    public static void main(String[] args) {
        
    }
}

