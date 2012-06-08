package by.minsler.bat.arraycollection10;

import java.util.Arrays;

public class MySet {

	private int n = 0;
	private int a[];

	public MySet(int a[]) {
		this.a = a;
		n = a.length;
	}

	public long sum() {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}

	public int average() {
		int result;
		result = (int) this.sum() / n;
		return result;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i : a) {
			str = str + " " + String.valueOf(i);
		}
		return str;
	}

	public void sortUp() {
		Arrays.sort(a);
	}

	public void sortDown() {
		this.sortUp();
		int temp;
		for (int i = 0; i < n / 2; i++) {
			temp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = temp;
		}
	}

}
