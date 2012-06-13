package by.minsler.bat.exception12;

import org.junit.Test;

public class MyMathTest {
	MyMath mm = new MyMath();

	@Test(expected = TrainingException.class)
	public void testMyTrainingException() throws TrainingException {
		mm.divide(10, 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		int i = 1 / 0;
	}

}
