package Collection;
import java.util.HashSet;

import com.jettjia.Person;

public class HashSetDemo {
	public static void main(String[] args) {
		System.out.println("============ demo1 ============");
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		System.out.println(hs.size());
		System.out.println(hs.toString());
		
		System.out.println("============ demo2 ============");
		HashSet<String> hStrings = new HashSet<>();
		boolean b1 = hStrings.add("a");
		boolean b2 = hStrings.add("a");
		System.out.println(b1); // true
		System.out.println(b2); // false ��set�����д洢�ظ���Ԫ�أ�����
		
		hStrings.add("b");
		hStrings.add("c");
		System.out.println(hStrings); // [a, b, c]; HashSet�ļ̳���ϵ������дtoString����
		
		//ֻҪ���õ�����������,�Ϳ���ʹ����ǿforѭ������
		for(String s : hStrings) {
			System.out.println(s);
		}
	}
}
