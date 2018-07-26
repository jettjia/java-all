package com.jettjia;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		// ����һ������������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\\\test.txt"));
		// ����һ�����������������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\\\\\\\tests.txt"));
		int len = 0;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}
