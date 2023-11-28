public class ExceptionTut {
    public static int func() {
        return func();
    }
    public static void errorCatching() {
        try {
            func();
            System.out.println("Try Block");
        } catch (Error e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }
    }

    public static void notHandled() throws Exception{
        System.out.println("Not Handled");
        System.out.println(50/0);
    }

    public static void arithematicEx() {
        try {
            int data = 50/0;
            System.out.println(data);
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }
    }

    public static void arrayIndexOutofBoundEx() {
        try {
            int data[] = {1,2,6,9};
            System.out.println(data[10]);
            System.out.println("Try Block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
       } finally {
            System.out.println("Finally Block");
        }
    }

    public static void nullPointerEx() {
        try {
            String s = null;
            System.out.println(s.substring(10));
            System.out.println("Try Block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
       } finally {
            System.out.println("Finally Block");
        }
    } 

    public static void numFormatEx() {
        try {
            String s = "abgio";
            System.out.println(Integer.parseInt(s));
            System.out.println("Try Block");
        } catch (NumberFormatException e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
       } finally {
            System.out.println("Finally Block");
        }
    } 

    public static void function(int a, int b) {
        System.out.println(a + b);
    }
    public static void illegalArguementEx() {
        try {
            // function(1);
            // System.out.println();
            System.out.println("Try Block");
        } catch (IllegalArgumentException e) {
            System.out.println("Catch Block");
            // e.printStackTrace();
       } finally {
            System.out.println("Finally Block");
        }
    } 

   
    public static void main(String[] args){
        errorCatching();
        // try {
        //     notHandled();
        // } catch(Exception e) {
        //     System.out.println("Not Happening");
        // }
    }
}
