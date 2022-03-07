package custom_exceptions;

public class StudentsMarkIsOutOfBoundsException extends Exception{
    public StudentsMarkIsOutOfBoundsException() {
    }

    public StudentsMarkIsOutOfBoundsException(String message) {
        super(message);
    }

    public StudentsMarkIsOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentsMarkIsOutOfBoundsException(Throwable cause) {
        super(cause);
    }
}
