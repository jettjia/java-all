package cn.string;

import java.util.Scanner;

/**
 * String����ϰ
 * 
 */
public class StringStudy {
	public static void main(String[] args) {
		// public String():�չ���
		String s1 = new String();
		System.out.println("s1:" + s1 + ",s1 length:" + s1.length());

		// public String(byte[] bytes):���ֽ�����ת���ַ���
		byte[] bt = { 97, 98, 99, 100 };
		String s2 = new String(bt);
		System.out.println("s2:" + s2 + ",s2 length:" + s2.length());

		// public String(byte[] bytes,int offset,int length) ���ֽ������һ����ת���ַ���
		String s3 = new String(bt, 1, 3);
		System.out.println("s3:" + s3 + ",s3 length:" + s3.length());

		// public String(char[] value):���ַ�����ת���ַ���
		char[] cr = { 'a', '3', '��', 'w' };
		String s4 = new String(cr);
		System.out.println("s4:" + s4 + ",s4 length:" + s4.length());

		// �ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
		String s = "abc";
		System.out.println("s:" + s + ",s length:" + s.length());

		System.out.println("======================================");

		String str1 = "helloworld";
		String str2 = "helloworld";
		String str3 = "helloWorld";

		String str4 = str1.replace("owo", "��ʯzcd");
		System.out.println(str2.toUpperCase());

		// int[] arr = {1,2,3}; ��������[1, 2, 3]
		int[] arr = { 1, 2, 3 };
		String result = arrToString(arr);
		System.out.println(result);

		// ����¼�롱abc�� ����������cba��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String inputString = sc.nextLine();

		String result2 = stringReserve(inputString);
		System.out.println(result2);

		// ͳ�ƴ���С�����ֵĴ���
		// �����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// ����С��
		String minString = "java";
		int count = getContainCount(maxString, minString);
		System.out.println(count);
	}

	/**
	 * ���������ַ�������ʽ���أ� ��ʽ��[a, b, c]
	 * 
	 * @param arr
	 *            ��ת��������
	 * @return [a, b, c] ��ʽ���ַ���
	 */
	public static String arrToString(int[] arr) {
		String arrToString = "";
		arrToString += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arrToString += arr[i] + "]";
			} else {
				arrToString += arr[i] + ", ";
			}
		}

		return arrToString;
	}

	/**
	 * �ַ�����ת
	 * 
	 * @param s
	 *            ����ת���ַ���
	 * @return ���ط�ת����ַ���
	 */
	public static String stringReserve(String s) {
		String result = ""; // �����ص�����
		char[] cr = s.toCharArray(); // ���ַ�������ַ�����

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = cr.length - 1; x >= 0; x--) {
			result += cr[x];
		}
		return result;
	}

	/**
	 * ͳ��ĳһ���ַ�������һ���ַ����г��ֵĴ���
	 * 
	 * @param maxString
	 * @param minString
	 * @return
	 */
	public static int getContainCount(String maxString, String minString) {
		// ����ͳ�Ʊ�������ʼֵ 0
		int count = 0;

		/*// ���ڴ��в���һ��С����һ�γ��ֵ�λ��
		int index = maxString.indexOf(minString);

		// ��������-1��˵�����ڣ�ͳ�Ʊ���++
		while (index != -1) {
			count++;
			// �Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
			int startIndex = index + minString.length();
			maxString = maxString.substring(startIndex);
			// ������
			index = maxString.indexOf(minString);
		}

		return count;*/
		
		//����2
		int index;
		while((index=maxString.indexOf(minString)) != -1){
			count ++;
			maxString = maxString.substring(index + minString.length()); 
		}
		return count;
	}

}
