import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random r = new Random();
		
		// ����[0, 1.0]�����С��
		System.out.println(r.nextDouble());
		
		// ������������
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10)); // ���ɵ���[0-10)���������
	}
}
