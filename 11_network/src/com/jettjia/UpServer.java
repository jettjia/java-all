package com.jettjia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UpServer {

	public static void main(String[] args) throws Exception {
		// ����ServerSocket����
		ServerSocket serverSocket = new ServerSocket(10001);
		while (true) {
			// ����accept() ���� ���տͻ��˵����󣬵õ�Socket����
			Socket s = serverSocket.accept();
			// ÿ���Ϳͻ��˽���Socket���Ӻ󣬵�������һ���̴߳���Ϳͻ��˵Ľ���
			new Thread(new ServerThread(s)).start();
		}
	}
}

class ServerThread implements Runnable {
	private Socket socket; // Socket���͵�����

	// ���췽����Socket������Ϊʵ�δ���
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		String ip = socket.getInetAddress().getHostAddress(); // ��ȡ�ͻ��˵�IP��ַ
		int count = 1; //�ϴ�ͼƬ����
		try {
			InputStream in = socket.getInputStream();
			File parentFile = new File("D:\\upload\\"); // �����ϴ�ͼƬ��Ŀ¼
			if (!parentFile.exists()) {
				parentFile.mkdir();
			}
			// �ѿͻ��˵�IP��ַ��Ϊ�ϴ��ļ����ļ���
			File file = new File(parentFile, ip + "(" + count + ").png");
			while (file.exists()) {
				// ����ļ������ڣ����count++
				file = new File(parentFile, ip+"(" + (count++) + ").png");
			}
			// ����FileOutputStream����
			FileOutputStream fos = new FileOutputStream(file);
			byte[] buf = new byte[1024]; // ����һ���ֽ�����
			int len = 0;
			while ((len = in.read(buf)) != -1) { // ѭ����ȡ����
				fos.write(buf, 0, len);
			}
			// ��ȡ�������˵������
			OutputStream out = socket.getOutputStream();
			out.write(("�ϴ��ɹ�").getBytes()); // �ϴ��ɹ������ѿͻ���
			fos.close(); // �ر����������
			socket.close(); // �ر�Socket����
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
