package com.jettjia;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyStreamDemo {
	public static void main(String[] args) throws Exception {
		// ������
		FileInputStream in = new FileInputStream("D:\\\\test.txt");
		// �����
		FileOutputStream out = new FileOutputStream("D:\\\\test_2.txt");
		int len; // ��¼ÿ�ζ�ȡ��һ���ֽ�
		long beginTime = System.currentTimeMillis();
		while((len = in.read()) != -1) {
			out.write(len);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTime - beginTime));
		in.close();
		out.close();
	}
}
