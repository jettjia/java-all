package com.jettjia;

import java.io.*;

public class BufferedCharDemo {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:\\\\read.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\reads.txt"));
		String str;
		while ((str = br.readLine()) != null) {
			bw.write(str);
			bw.newLine(); // ���ݲ���ϵͳ��ͬ��д�벻ͬ�Ļ��з�
		}
		br.close();
		bw.close();
	}
}
