package io;

import java.io.File;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) throws IOException {
		File dir = new File("/Users/yizhuolu/");
		File file1 = new File(dir, "fileTest1.txt");
		File file2 = new File(dir, "fileTest2.java");
		if (!dir.exists()) {
			dir.mkdir();
		}
		if (!file1.exists()) {
			file1.createNewFile();
		}
		if (!file2.exists()) {
			file2.createNewFile();
		}
		System.out.println("file1's AbsolutePath= " + file1.getAbsolutePath());
		System.out.println("file2's AbsolutePath= " + file2.getAbsolutePath());
		System.out.println("file1 Canread=" + file1.canRead());
		System.out.print("file1's len= " + file1.length());
		String[] fileList = dir.list();
		
		System.out.println("there are " + fileList.length + " file(s) under yizhuolu:");
	}
}
