package com.jettjia;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyStreamDemo2 {
	public static void main(String[] args) throws Exception {
		// ������
		FileInputStream in = new FileInputStream("D:\\\\test.txt");
		// �����
		FileOutputStream out = new FileOutputStream("D:\\\\test_2.txt");
		int len; // ��¼ÿ�ζ�ȡ��һ���ֽ�
		byte[] buff = new byte[1024]; // ����һ���ֽ����飬��Ϊ������
		long beginTime = System.currentTimeMillis();
		while ((len = in.read(buff)) != -1) {
			out.write(buff, 0, len);
		}
		long endTime= System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTime - beginTime));
		in.close();
		out.close();
	}
}
