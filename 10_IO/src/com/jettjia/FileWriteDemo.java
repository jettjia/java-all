package com.jettjia;

import java.io.FileWriter;

public class FileWriteDemo {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:\\\\read.txt");
		String str = "������";
		fw.write(str);
		fw.close();
	}
}
