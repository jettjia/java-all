package Test;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread myT = new MyThread(); // �����߳�MyThread���̶߳���
		myT.start(); // �����߳�
		while (true) {
			System.out.println("main()����������");
		}
	}
}

class MyThread extends Thread { // �̳�Thread��
	public void run() { // ��дrun����
		while (true) { //��ѭ�����
			System.out.println("MyThread ��� run()����������");
		}
	}
}
