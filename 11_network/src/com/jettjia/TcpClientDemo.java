package com.jettjia;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) throws Exception {
		new TCPClient().connetc();
	}
}

class TCPClient {
	private static final int PORT = 7788;
	public void connetc() throws Exception {
		// ����һ��Socket �����ӵ�������ַ�Ͷ˿ںŵļ����
		Socket client = new Socket(InetAddress.getLocalHost(), PORT);
		// �õ��������ݵ���
		InputStream is = client.getInputStream();
		// ����һ��1024���ֽ�����Ļ�����
		byte[] buf = new byte[1024];
		// �����ݶ���������
		int len = is.read(buf);
		// �����������������
		System.out.println(new String(buf, 0, len));
		client.close();
	}
}