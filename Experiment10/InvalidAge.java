package Experiment10;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}



public class InvalidAge {
    public static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Too Young to Vote");
        }else {
            System.out.println("Valid to vote in the elections");
        }

    }
    public static void main(String[] args) {
        try {
            validate(10);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
