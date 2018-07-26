package Test;

public class Multithread {
	public static void main(String[] args) {
		Storage st = new Storage(); //�������ݴ洢����
		Input input = new Input(st); // ����Input���󣬴���Storage����
		Output output = new Output(st); // ����Output���󣬴���Storage����
		new Thread(input).start(); //�������߳�
		new Thread(output).start();
	}
}

/**
 * �����߳���
 */
class Input implements Runnable {
	private Storage st;
	private int num;
	
	/**
	 * ͨ�����췽��������һ��Storage����
	 */
	Input(Storage st) {
		this.st = st;
	}
	
	@Override
	public void run() {
		while(true) {
			st.put(num++); // ��num�������飬ÿ�δ����num����
		}
	}
}

/**
 * ����߳���
 */
class Output implements Runnable {
	private Storage st;
	
	Output(Storage st) {
		this.st = st;
	}
	
	@Override
	public void run() {
		while(true) {
			st.get(); // ȡ���������Ԫ��
		}
	}
}

/**
 * ����д�����飬ȡ������
 * synchronized ����д�롢ȡ��������
 * wait()��notify()���̼����ͨ�ţ�ȷ������һ�ºͲ�������
 */
class Storage {
	private int[] cells = new int[10]; // ���ݴ洢����
	private int inPos, outPos; // ����ʱ�����±꣬ȡ��ʱ�����±�
	private int count; //�������ȡ�����ݵ�����
	
	public synchronized void put(int num) {
		try {
			// �����������ݵ���cells�ĳ��ȣ����̵߳ȴ�
			while (count == cells.length) {
				this.wait();
			}
			cells[inPos] = num; // �������з�������
			System.out.println("��cells[" +inPos+ "]�з�������" +cells[inPos]);
			inPos++;
			if (inPos == cells.length) { // ����cells[9] �������ݺ��ٴ�cells[0]��ʼ
				inPos = 0;
			}
			count++; // û��һ�����ݣ�count+1
			this.notify(); // ���ѵȴ��߳�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void get() {
		try {
			// �����������ݸ���Ϊ0�����̵߳ȴ�
			while (count == 0) {
				this.wait();
			}
			int data = cells[outPos]; // ��������ȡ������
			System.out.println("��cells[" +outPos+ "]��ȡ������"+cells[outPos]);
			outPos++;
			if (outPos == cells.length) { // ����cells[9] ȡ�����ݺ��ٴ�cells[0]��ʼ
				outPos = 0;
			}
			count--;
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
