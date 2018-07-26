package com.jettjia;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UpClient {
	public static void main(String[] args) throws Exception {
		// �����ͻ���Socket
		Socket socket = new Socket("127.0.0.1", 10001);
		// ��ȡSocket�����������
		OutputStream out = socket.getOutputStream();
		// ����FileInputStream����
		FileInputStream fis = new FileInputStream("D:\\1.png");
		
		// ��ȡ�������ݣ�д��
		byte[] buf = new byte[1024];
		int len;
		while((len = fis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		socket.shutdownInput();
		
		InputStream in = socket.getInputStream(); // ��ȡSocket������������
		byte[] bufMsg = new byte[1024];
		int num = in.read(bufMsg); // ���շ���˵���Ϣ
		String Msg = new String(bufMsg, 0, num);
		System.out.println(Msg);
		fis.close();
		socket.close();
	}
}
