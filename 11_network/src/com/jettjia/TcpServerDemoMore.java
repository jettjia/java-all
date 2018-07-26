package com.jettjia;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemoMore {
	public static void main(String[] args) throws Exception {
		new TCPServers().listen();
	}
}

class TCPServers {
	private static final int PORT = 7788;
	
	public void listen() throws Exception {
		// ����ServerSocket���󣬼���ָ���Ķ˿�
		ServerSocket serverSocket = new ServerSocket(PORT);
		// ʹ��whileѭ����ͣ�Ľ��տͻ��˷��͵�����
		while(true) {
			// ����ServerSocket��accept()�������Ϳͻ��˽�������
			final Socket client = serverSocket.accept();
			// �����µ��̺߳��û��������ݽ���
			new Thread() {
				public void run() {
					OutputStream os; // ����һ�����������
					try {
						os = client.getOutputStream(); //��ȡ�ͻ��˵������
						System.out.println("��ʼ�Ϳͻ��˽�������");
						os.write(("��ã�").getBytes());
						Thread.sleep(5000); // ʹ�߳�����5000����
						System.out.println("�������߳̽�������");
						os.close();
						client.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}