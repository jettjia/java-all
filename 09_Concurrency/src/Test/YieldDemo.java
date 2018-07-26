package Test;

// ����YieldThread�̳�Thread��
class YieldThread extends Thread {
	// ����һ���вεĹ��췽��
	public YieldThread(String name) {
		super(name); //���ø���Ĺ��췽��
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
			if (i == 3) {
				System.out.print("�߳��ò�:");
				Thread.yield(); // �߳����е��ˣ������ò�
			}
		}
	}
}

public class YieldDemo {
	public static void main(String[] args) {
		Thread t1 = new YieldThread("�߳�1");
		Thread t2 = new YieldThread("�߳�2");
		t1.start();
		t2.start();
	}
}