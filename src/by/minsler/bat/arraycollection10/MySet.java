package by.minsler.bat.arraycollection10;

import java.util.Arrays;

public class MySet {

	public static final int ALL = 0;
	public static final int EVEN = 1;
	public static final int ODD = 2;

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

	public double average() {
		int result;
		result = (int) this.sum() / n;
		return result;
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

	@Override
	public String toString() {
		return this.toString(ALL);
	}

	public String toString(int parity) {
		String str = "";
		for (int i : a) {
			if (toGet(i, parity)) {
				str = str + " " + String.valueOf(i);
			}
		}
		return str;
	}

	private boolean toGet(int i, int parity) {
		boolean cond = false;
		switch (parity) {
		case ALL:
			cond = true;
			break;
		case EVEN:
			if (i % 2 == 0) {
				cond = true;
			}
			break;
		case ODD:
			if (i % 2 != 0) {
				cond = true;
			}
			break;
		default:
			break;
		}
		return cond;
	}

}
