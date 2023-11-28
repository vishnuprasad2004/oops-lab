package Experiment6;

public class Question2 {

    static String str = "Static Variable"; 
    
    public static void staticMethod() {
        System.out.println("Static Method");
    }
    
    static {
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        staticMethod();
        System.out.println(str);    
    }    
}
