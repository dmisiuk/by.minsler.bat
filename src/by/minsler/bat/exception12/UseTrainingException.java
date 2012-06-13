package by.minsler.bat.exception12;

public class UseTrainingException {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		System.out.println(mm.add(10, 5));
		try {
			System.out.print("10 divide 0 is ");
			System.out.println(mm.divide(10, 0));
		} catch (TrainingException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.print("10 divide 10 is ");
			System.out.println(mm.divide(10, 10));
		} catch (TrainingException e) {
			System.out.println(e.getMessage());
		}

	}
}
