package com.jettjia;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// ���Ϳͻ���
public class UdpClient {
	public static void main(String[] args) throws Exception {
		// ����һ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket(3000);
		// Ҫ���͵�����
		String str = "hello world";
		/**
		 *   ����һ��Ҫ���͵����ݰ�
		 * ������Ŷ���깬�����ݣ����ݵĳ��ȣ����ն˵�IP��ַ�Լ��˿ں�
		 */
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 8954);
		System.out.println("������Ϣ");
		ds.send(dp); // ��������
		ds.close(); // �ر���Դ
	}
}
