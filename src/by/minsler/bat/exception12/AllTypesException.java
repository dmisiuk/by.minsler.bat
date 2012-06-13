package by.minsler.bat.exception12;

public class AllTypesException {

	public static void main(String[] args) {

		Error error = new Error("this is error message");
		RuntimeException runtimeException = new RuntimeException(
				"this is runtime exception message");
		Exception exception = new Exception("this is exception message");

		try {
			throw runtimeException;
		} catch (RuntimeException e) {
			System.out.println("caught runtime exception " + e.getMessage());
		}

		try {
			throw exception;
		} catch (Exception e) {
			System.out.println("caught exception " + e.getMessage());
		}

		try {
			throw error;
		} catch (Error e) {
			System.out.println("caught error " + e.getMessage());
		}
	}
}
