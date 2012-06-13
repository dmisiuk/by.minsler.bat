package by.minsler.bat.exception12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileBuffered {

	public static void main(String[] args) {

		String fileName = "/Users/minsler/test/bufferedoutput.txt";
		BufferedWriter out = null;

		try {
			out = new BufferedWriter(new FileWriter(fileName));
			out.write("new file\ncreated!\n");
		} catch (IOException e) {
			System.out.println("problem with io");
		} finally {
			if (out != null) {
				try {
					System.out.print("closing file: ");
					out.close();
					System.out.println("successfully");
				} catch (IOException e) {
					System.out.println("problem with file closing");
				}
			} else {
				System.out.println("file not open");
			}
		}

	}
}
