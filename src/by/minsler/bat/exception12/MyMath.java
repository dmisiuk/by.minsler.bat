package by.minsler.bat.exception12;

public class MyMath {

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws TrainingException {
		if (b == 0) {
			throw new TrainingException("Training exception: divide by zero");
		}
		return a / b;
	}

}
