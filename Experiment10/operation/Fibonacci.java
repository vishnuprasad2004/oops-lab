package Experiment10.operation;

public class Fibonacci {
    public int getDigit(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return getDigit(n-1) + getDigit(n-2);
    } 

    public void printAll(int n) {
        int a = 0;
        int b = 1;
        int c;
        int i=0;
        System.out.print(a + " " + b);
        while(i < n-2) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
