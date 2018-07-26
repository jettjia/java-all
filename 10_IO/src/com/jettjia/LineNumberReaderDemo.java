package com.jettjia;

import java.io.*;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\\\read.txt");
		FileWriter fw = new FileWriter("D:\\\\readLine.txt");
		LineNumberReader lnr = new LineNumberReader(fr); // ��װ
		lnr.setLineNumber(0); // ���ö�ȡ�ļ�����ʼ�к�
		String line = null;
		while((line = lnr.readLine()) != null) {
			fw.write(lnr.getLineNumber() + ":" + line); // ���кźͶ�ȡ����һ���ı�д�뵽�ļ���
			fw.write("\r\n"); // д�뻻��
		}
		fr.close();
		fw.close();
	}
}
