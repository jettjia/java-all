package Test;

public class JoinDemo {
	public static void main(String[] args) {
		// �����߳�
		Thread t = new Thread(new EmergencyThread(), "�߳�һ");
		t.start();
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "����" + i);
			if (i == 2) {
				try {
					t.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

class EmergencyThread implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "����" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}