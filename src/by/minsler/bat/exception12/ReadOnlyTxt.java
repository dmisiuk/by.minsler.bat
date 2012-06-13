package by.minsler.bat.exception12;

import java.io.File;

public class ReadOnlyTxt {

	public static void main(String[] args) {
		File dir = new File("/Users/minsler/test");

		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles(new MyFileFilter("txt"));

			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		} else {
			System.out.println("Direcotry not exist or is not directory");
		}

	}
}
