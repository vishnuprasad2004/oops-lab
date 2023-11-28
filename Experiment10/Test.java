package Experiment10;

import Experiment10.operation.successful.Armstrong;
import Experiment10.operation.Fibonacci;

public class Test {
    public static void main(String[] args) {
        Armstrong o1 = new Armstrong();
        System.out.println(o1.validate(153));
        Fibonacci fib = new Fibonacci();
        fib.printAll(10);

    }
}
