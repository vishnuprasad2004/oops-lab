package Experiment6;

public class Question3 {
    public static void main(String[] args) {
        int sum = 0;
        for(String num: args) {
            sum = sum + Integer.parseInt(num);
        }
        System.out.println("Sum: " + sum);
    }
}
