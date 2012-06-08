package by.minsler.bat.arraycollection10;

public class MainProgram {

	public static void main(String[] args) {

		int[] a = { 1, 2, 34, 01, -1, 23, 34, -190, 23 };
		MySet ms = new MySet(a);
		System.out.println(ms);
		System.out.println("Сумма: " + ms.sum()
				+ "\nСреднее значение элемента:  " + ms.average());

		ms.sortUp();
		System.out.println(ms);
		ms.sortDown();
		System.out.println(ms);

		System.out.println(ms.toString(MySet.EVEN));
		System.out.println(ms.toString(MySet.ODD));
	}
}
