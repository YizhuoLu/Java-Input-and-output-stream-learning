package io;

import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) {
		/* 
		 * new a PrintWriter object, specify outputStream
		 * to be System.out. true means refresh after each
		 * printed line.
		 * */
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("hello World");
		int i  = -10;
		out.println(i);
		double d = 0.00004;
		out.println(d);
	}
}
