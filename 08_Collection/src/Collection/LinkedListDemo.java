package Collection;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a"); // Ԫ�ز�����б�Ŀ�ͷ
		list.addFirst("b");
		list.addFirst("c");
		list.addLast("d");
		// ���
		System.out.println(list.get(1));
		
		// ɾ��
		System.out.println(list.removeFirst());
	}
}
