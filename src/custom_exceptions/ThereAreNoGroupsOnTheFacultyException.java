package custom_exceptions;

public class ThereAreNoGroupsOnTheFacultyException extends Exception{
    public ThereAreNoGroupsOnTheFacultyException() {
    }

    public ThereAreNoGroupsOnTheFacultyException(String message) {
        super(message);
    }

    public ThereAreNoGroupsOnTheFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThereAreNoGroupsOnTheFacultyException(Throwable cause) {
        super(cause);
    }
}
