package Test;

class Tickets implements Runnable {
	private int tickets = 10;
	Object lock = new Object(); // ��������һ��������������ͬ�������
	@Override
	public void run() {
		while(true) {
			synchronized (lock) { // ����ͬ�������
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "��" + tickets-- + "��Ʊ");
				} else {
					break;
				}
			}
		}
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		Tickets t = new Tickets();
		new Thread(t, "����1").start();
		new Thread(t, "����2").start();
		new Thread(t, "����3").start();
		new Thread(t, "����4").start();
	}
}
