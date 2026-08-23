package studentmanagement.exception;

public class InvalidStudentDataException
        extends Exception {
	private static final long serialVersionUID = 1L;
    public InvalidStudentDataException(String message) {
        super(message);
    }
}