package custom_exceptions;

public class ThereAreNoFacultiesException extends Exception{
    public ThereAreNoFacultiesException() {
    }

    public ThereAreNoFacultiesException(String message) {
        super(message);
    }

    public ThereAreNoFacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThereAreNoFacultiesException(Throwable cause) {
        super(cause);
    }
}
