package Test;

class CreateTicket implements Runnable {
	private int tickets = 10;
	@Override
	public void run() {
		while(true) {
			saleTicket(); //������Ʊ����
			if (tickets <= 0) {
				break;
			}
		}
	}
	
	private synchronized void saleTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(10); // �������߳�����10����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--�����ĵ�" + tickets--);
		}
	}
}

public class SynchronizedDemo2 {
	public static void main(String[] args) {
		CreateTicket cTicket = new CreateTicket();
		new Thread(cTicket, "����1 ").start();
		new Thread(cTicket, "����2 ").start();
		new Thread(cTicket, "����3 ").start();
		new Thread(cTicket, "����4 ").start();
	}
}
