public class SystemExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // ���㿪ʼʱ��ʱ��
		int sum = 0; //���������ĳ�ʼֵ
		for (int i = 0; i < 10000000; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis(); //�������ʱ��ʱ��
		
		// ���㻨�ѵ�ʱ��
		System.out.println(endTime - startTime);
	}
}
