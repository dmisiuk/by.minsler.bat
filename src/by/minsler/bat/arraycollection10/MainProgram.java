package by.minsler.bat.arraycollection10;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {

		// int[] a = { 1, 2, 34, 01, -1, 23, 34, -190, 23 };
		int n;
		Integer a[];
		Scanner sc = new Scanner(System.in);

		// TODO Сделать проверку на ошибочный ввод при запросах

		System.out.print("Enter n(amount elements of array) and press Enter");
		n = Integer.parseInt(sc.next());
		a = new Integer[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + i
					+ "th elements of array) and press Enter");
			a[i] = Integer.parseInt(sc.next());
		}

		MySet ms = new MySet(a);
		System.out.println("All elements:\n" + ms);
		System.out.println("Сумма: " + ms.sum()
				+ "\nСреднее значение элемента:  " + ms.average());

		ms.sortUp();
		System.out.println("Orderd by natural order:\n" + ms);
		ms.sortDown();
		System.out.println("Ordered by back natural order(reverse):\n" + ms);

		System.out.println("Even elements:\n" + ms.toString(MySet.EVEN));
		System.out.println("Odd elements:\n" + ms.toString(MySet.ODD));

		// System.out.println("dima petia".matches("(.*)(dima)(.*)"));
	}
}
