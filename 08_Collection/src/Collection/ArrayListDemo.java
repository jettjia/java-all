package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		// ��
		arrayList.add("c");
		// ��
		arrayList.set(1, "z");
		// ��
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("======================");
		// ɾ
		Object object = arrayList.remove(0);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("======================");
		
		System.out.println(object); // ���ɾ�����صĶ���
		
		System.out.println("===========Iterator===========");

		// ���������� - Iterator
		Iterator<String> it = arrayList.iterator(); // ��ȡ������
		while (it.hasNext()) { // �жϼ������Ƿ���Ԫ��
			System.out.println(it.next());
		}
		
		System.out.println("===========ListIterator===========");
		
		// ���������� - ListIterator
		ListIterator<String> lit = arrayList.listIterator(); //��ȡ������(List�������е�)
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	}
}
