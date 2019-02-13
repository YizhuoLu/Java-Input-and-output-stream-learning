package io;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ScannerTest {
	/*
	 * Input class: Scanner
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while(sc.hasNext()) {
			int m = sc.nextInt();
			String str = sc.next();
			for (int i = 0;i < m; ++i) {
				System.out.println(sc.nextInt());
			}
		}
	}
}
