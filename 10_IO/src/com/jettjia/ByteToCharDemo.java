package com.jettjia;

import java.io.*;

public class ByteToCharDemo {
	public static void main(String[] args) throws Exception {
		// �����ֽ�������
		FileInputStream in = new FileInputStream("D:\\\\read.txt");
		// ���ֽ�������ת���ַ�������
		InputStreamReader isr = new InputStreamReader(in);
		// ���ַ���������װ
		BufferedReader br = new BufferedReader(isr);
		
		// �����ֽ������
		FileOutputStream out = new FileOutputStream("D:\\\\read_s.txt");
		// ���ֽ������ת���ַ������
		OutputStreamWriter osw = new OutputStreamWriter(out);
		// ���ַ��������װ
		BufferedWriter bw = new BufferedWriter(osw);
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
		}
		br.close();
		bw.close();
	}
}
