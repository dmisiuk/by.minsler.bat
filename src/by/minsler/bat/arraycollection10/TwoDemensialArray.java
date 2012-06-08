package by.minsler.bat.arraycollection10;

public class TwoDemensialArray {

	public static void main(String[] args) {

		String a[][] = new String[5][5];
		fillWith(a, " ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				a[i][j] = "*";
			}
		}

		printArray(a);
		mapVertical(a);
		printArray(a);
		mapHorizontal(a);
		printArray(a);
		mapVertical(a);
		printArray(a);

	}

	private static void mapVertical(String[][] a) {
		String temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				temp = a[i][j];
				a[i][j] = a[i][a[i].length - j - 1];
				a[i][a[i].length - j - 1] = temp;
			}
		}
	}

	private static void mapHorizontal(String[][] a) {
		String temp;
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				temp = a[i][j];
				a[i][j] = a[a.length - i - 1][j];
				a[a.length - i - 1][j] = temp;
			}
		}
	}

	private static void fillWith(String[][] a, String string) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = string;
			}
		}
	}

	public static void printArray(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
