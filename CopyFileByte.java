package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * E.g.1: copy to file in byte stream.
 * 
 * byte streams are used to perform input and output of 8-bit bytes.
 * */
public class CopyFileByte {
	public static void main(String[] args) throws  IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		/*
		 * Another way:
		 * File inFile = new File("input.txt");
		 * File outFile = new File("output.txt");
		 * 
		 * FileInputStream in = new  FileInputStream(inFile);
		 * FileOutputStream out = new FileOutputStream(outFile);
		 * */
		try {
			in = new FileInputStream("⁨/Users⁩/yizhuolu⁩/eclipse-workspace⁩/UnitTests⁩/src/io⁩/input.txt");
			out = new FileOutputStream("/Users⁩/yizhuolu⁩/eclipse-workspace⁩/UnitTests⁩/src/io⁩/output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
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
