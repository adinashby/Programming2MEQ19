package myhelpers;

public class TwoNumbersTheSameException extends RuntimeException {
    // default constructor
    public TwoNumbersTheSameException() {
    }

    // with String message
    public TwoNumbersTheSameException(String message) {
        super(message);
    }
}
