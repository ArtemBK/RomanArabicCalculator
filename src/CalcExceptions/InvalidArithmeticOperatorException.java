package CalcExceptions;

public class InvalidArithmeticOperatorException extends Exception{
    public InvalidArithmeticOperatorException() {
    }

    public InvalidArithmeticOperatorException(String message) {
        super(message);
    }

    public InvalidArithmeticOperatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArithmeticOperatorException(Throwable cause) {
        super(cause);
    }

    public InvalidArithmeticOperatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
