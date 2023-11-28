package Experiment10.operation.successful;

public class Armstrong {
    public boolean validate(int n) {
        int n2 = n;
        int sum = 0;
        while(n>0) {
            sum += (int)Math.pow(n%10,3);
            n = n /10;
        }
        if(sum == n2) {
            return true;
        }else {
            return false;
        }

        
    }
}
