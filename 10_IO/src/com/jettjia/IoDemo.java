package com.jettjia;

import java.io.File;

public class IoDemo {
	public static void main(String[] args) {
		File file = new File("D:\\develop\\java_study\\10_IO\\src\\com\\jettjia"); // ����File�ļ����󣬱�ʾһ���ļ�
		// ��ȡ�ļ�����
		System.out.println(file.getName());
		// ��ȡ�ļ������·��
		System.out.println(file.getPath());
		// ��ȡ�ļ��ľ���·��
		System.out.println(file.getAbsolutePath());
		// ��ȡ�ļ��ĸ�·��
		System.out.println(file.getParent());
		// �ж��ļ��Ƿ�ɶ�
		System.out.println(file.canRead());
		// �ж��ļ��Ƿ��д
		System.out.println(file.canWrite());
		// �ж��Ƿ���һ���ļ�
		System.out.println(file.isFile());
		// �ж��Ƿ���һ��Ŀ¼
		System.out.println(file.isDirectory());
		// �ж��Ƿ���һ������·��
		System.out.println(file.isAbsolute());
		// �õ��ļ�����޸�ʱ��
		System.out.println(file.lastModified());
		// �õ��ļ��Ĵ�С
		System.out.println(file.length());
		// �Ƿ�ɹ�ɾ���ļ�
		System.out.println(file.delete());
	}
}
