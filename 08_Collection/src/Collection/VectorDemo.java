package Collection;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		
		Enumeration  en = v.elements(); // ��ȡö��
		while(en.hasMoreElements()) { // �жϼ������Ƿ���Ԫ��
			System.out.println(en.nextElement()); // ��ȡ�����е�Ԫ��
		}
	}
}
