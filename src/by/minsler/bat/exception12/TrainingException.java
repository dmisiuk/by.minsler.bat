package by.minsler.bat.exception12;

public class TrainingException extends Exception {

	private static final long serialVersionUID = 1L;

	public TrainingException(String message) {
		super(message);
	}

	public TrainingException() {
		this("This is training exception");
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
