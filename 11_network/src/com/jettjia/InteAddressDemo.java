package com.jettjia;

import java.net.InetAddress;

public class InteAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");
		System.out.println("������IP��ַ��" + localAddress.getHostAddress());
		System.out.println("baidu��IP��ַ:" + remoteAddress.getHostAddress());
		System.out.println("3���Ƿ�ɵ��" + remoteAddress.isReachable(3000));
		System.out.println("baidu����������" + remoteAddress.getHostName());
	}
}
