package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInOut {
	/*
	 * Input/Output to console:
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter characters,'q' to exit.");
		c  = (char)br.read();
		while (c != 'q') {
			System.out.println(c);
			c = (char) br.read();
		}
	}
}
