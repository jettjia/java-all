package Test;

public class RunnableDemo {
	public static void main(String[] args) {
		MyThreads myT = new MyThreads(); // ����MyThreads��ʵ������
		Thread thread = new Thread(myT); // �����̶߳���
		thread.start(); // �����̣߳�ִ���߳��е�run()����
		while (true) {
			System.out.println("main()����������");
		}
	}
}

class MyThreads implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun������������start()����ʱ���̴߳Ӵ˴���ʼִ��
		while (true) {
			System.out.println("MyThread ��� run()����������");
		}
	}
}
