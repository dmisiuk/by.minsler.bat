package by.minsler.bat.arraycollection10;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {

		// int[] a = { 1, 2, 34, 01, -1, 23, 34, -190, 23 };

		int n;
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n(amount elements of array) and press Enter");
		n = Integer.parseInt(sc.next());
		a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + i
					+ "th elements of array) and press Enter");
			a[i] = Integer.parseInt(sc.next());
		}

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
