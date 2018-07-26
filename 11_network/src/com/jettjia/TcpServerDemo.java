package com.jettjia;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) throws Exception {
		new TCPServer().listen(); // ����TCPServer���󣬲�����listen����
	}
}

// �����
class TCPServer {
	private static final int PORT = 7788; // ����˿ں�
	// ����һ��listen�������׳�һ���쳣
	public void listen() throws Exception {
		// ����ServerSocket����
		ServerSocket serverSocket = new ServerSocket(PORT);
		// ����ServerSocket��accept()������������
		Socket client = serverSocket.accept();
		// ��ȡ�ͻ��˵������
		OutputStream os = client.getOutputStream();
		
		System.out.println("��ʼ�Ϳͻ��˽�������");
		
		os.write(("���!").getBytes());
		
		Thread.sleep(5000); // ģ��ִ����������ռ�õ�ʱ��
		System.out.println("�����Ϳͻ��˽�������");
		os.close();
		client.close();
	}
}