public class Fibonnaci {
    int fibonnaci(int n) {
        if(n==1 || n == 0) {
            return 0;
        }
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
