package Experiment10;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};

        try {

            System.out.println(arr[100]);

        }catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e);

        }catch(NumberFormatException e) {

            System.out.println(e);

        }catch(ArithmeticException e) {

            System.out.println(e);

        }catch(Exception e) {

            System.out.println(e);
        }
    }
}
