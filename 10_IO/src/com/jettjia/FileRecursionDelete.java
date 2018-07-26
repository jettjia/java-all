package com.jettjia;

import java.io.File;

public class FileRecursionDelete {
	public static void main(String[] args) {
		File file = new File("D:\\test");
		deleteDir(file);
	}
	
	public static void deleteDir(File dir) {
		if (dir.exists()) { // �жϴ����File�����Ƿ����
			File[] files = dir.listFiles(); // �õ�File����
			for (File file : files) {
				if (file.isDirectory()) {
					deleteDir(file); // �����Ŀ¼���ݹ����deleteDir()
				} else {
					file.delete(); // ������ļ���ֱ��ɾ��
				}
			}
			// ɾ����һ��Ŀ¼��������ļ������ɾ�����Ŀ¼
			dir.delete();
		}
	}
}
