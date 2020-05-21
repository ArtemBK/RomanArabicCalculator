package CalcExceptions;

public class IncorrectInputFormat extends Exception {
    public IncorrectInputFormat() {
    }

    public IncorrectInputFormat(String message) {
        super(message);
    }

    public IncorrectInputFormat(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectInputFormat(Throwable cause) {
        super(cause);
    }

    public IncorrectInputFormat(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
