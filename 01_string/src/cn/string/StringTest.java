package cn.string;

import java.math.BigInteger;

public class StringTest {
	public static void main(String[] args) {
		BigInteger aBigInteger = BigInteger.valueOf(100);
		BigInteger bBigInteger = BigInteger.valueOf(200);
		// + * �Ȳ���ֱ�����á�Ҫ�������Դ���add��multiply����
		BigInteger cBigInteger = aBigInteger.add(bBigInteger);
		System.out.println(cBigInteger);
	}
}
