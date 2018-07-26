package cn.array;

/**
 * Integer
 * 
 */
public class IntegerStudy {
	public static void main(String[] args) {
		// ������
		System.out.println(Integer.toBinaryString(100));

		// �˽���
		System.out.println(Integer.toOctalString(100));

		// ʮ������
		System.out.println(Integer.toHexString(100));

		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);

		// ��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);

		// ��ʽ2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);
	}
}
