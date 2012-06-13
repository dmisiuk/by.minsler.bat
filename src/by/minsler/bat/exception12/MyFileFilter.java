package by.minsler.bat.exception12;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	private String extension;

	public MyFileFilter(String extension) {
		this.extension = "." + extension;
	}

	@Override
	public boolean accept(File f) {
		String fileName = f.getName();
		int i = fileName.length();
		StringBuilder ext = new StringBuilder();
		do {
			i--;
			ext.insert(0, fileName.charAt(i));
		} while (i > 0 && fileName.charAt(i) != '.');

		// while (i > -1 && fileName.charAt(i) != '.') {
		// ext.insert(0, fileName.charAt(i));
		// i--;
		// }

		if (ext.toString().equalsIgnoreCase(this.extension) && f.isFile()) {
			return true;
		}
		return false;
	}
}
