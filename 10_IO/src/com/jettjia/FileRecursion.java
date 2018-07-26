package com.jettjia;

import java.io.File;

public class FileRecursion {
	public static void main(String[] args) {
		File file = new File("D:\\develop\\java_study\\10_IO\\src\\com\\jettjia");
		fileDir(file);
	}
	
	public static void fileDir(File dir) {
		File[] files = dir.listFiles(); // ���Ŀ¼�µ������ļ�������
		for (File file : files) {
			if (file.isDirectory()) {
				fileDir(file); // �ݹ����fileDir()
			}
			System.out.println(file.getAbsolutePath()); // ����ļ��ľ���·��
		}
	}
}
