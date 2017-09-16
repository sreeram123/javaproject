package student;

public class InvalidEmailException extends Exception{
	public InvalidEmailException() {
		super("Entered email is invalid");
	}
}
