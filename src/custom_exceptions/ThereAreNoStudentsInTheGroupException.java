package custom_exceptions;

public class ThereAreNoStudentsInTheGroupException extends Exception{
    public ThereAreNoStudentsInTheGroupException() {
    }

    public ThereAreNoStudentsInTheGroupException(String message) {
        super(message);
    }

    public ThereAreNoStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThereAreNoStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }
}
