package Test;

public class SleepDemo {
	public static void main(String[] args) {
		new Thread(new SleepThread()).start();
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				try {
					Thread.sleep(20000); // ��ǰ�߳�����2��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("���߳��������" + i);
			try {
				Thread.sleep(500); // ��ǰ�߳�����500����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class SleepThread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				try {
					Thread.sleep(20000); // ��ǰ�߳�����2��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�߳�1�������" + i);
			try {
				Thread.sleep(500); // ��ǰ�߳�����500����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}