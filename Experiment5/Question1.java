package Experiment5;

public class Question1 {
    /**
     * Area of Circle
     * @param r
     */
    Question1(int r) {
        System.out.println("Area of the Circle is:" + Math.PI * Math.pow(r, 2));
    }
    /**
     * Area of Cone
     * @param r
     * @param l
     */
    Question1(int r, int l) {
        System.out.println("Total surface area of Cone: " + (Math.PI * r * (r + l)));
        System.out.println("Curved surface area of Cone: " + (Math.PI * r * l));
    }
    /**
     * Area of cylinder
     * @param r
     * @param h
     */
    Question1(float r, float h) {
        System.out.println("Total surface area of Cylinder: " + (2*  Math.PI * r * (r + h)));
        System.out.println("Curved surface area of Cylinder: " + (2 * Math.PI * r * h));        
    }
}
