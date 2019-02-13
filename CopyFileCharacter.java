package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Character streams are used to perform input and output
 * for 16-bit unicode (2 bytes for a char)
 * */
public class CopyFileCharacter {
	public static  void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
