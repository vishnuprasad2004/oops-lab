package Experiment9;

interface A {
    default void hello1() {
        System.out.println("Hello from Interface A");
    }
}

interface B {
    default void hello2() {
        System.out.println("Hello from Interface B");
    }
}


public class Question1 implements A,B {
    public static void main(String[] args) {
        Question1 o = new Question1();
        o.hello1();
        o.hello2();
    }
}
