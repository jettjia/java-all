package com.jettjia;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args)  throws Exception {
		// ����һ��FileReader����������ȡ�ļ��е��ַ�
		FileReader fr = new FileReader("D:\\\\read.txt"); // 
		int ch; // ����һ���������ڼ�¼��ȡ���ַ�
		while ((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		} 
		fr.close();
	}

}
