package Map;

import java.util.HashMap;

import com.jettjia.Person;

public class HashMapDemo {
	public static void main(String[] args) {
		// ����������
		HashMap<Person, String> hmMan = new HashMap<>();
		hmMan.put(new Person("�ܽ���", 35),  "�Ϻ�");
		hmMan.put(new Person("����ʢ", 55),  "�Ϻ�");
		
		// ����Ů����
		HashMap<Person, String> hmWoman = new HashMap<>();
		hmWoman.put(new Person("��־��", 33), "̨��");
		hmWoman.put(new Person("����", 37), "����");
		
		// ����˫��HashMap
		HashMap<HashMap<Person, String>, String> hm = new HashMap<>();
		hm.put(hmMan, "������");
		hm.put(hmWoman, "Ů����");
		
		// ����˫�м���
		for(HashMap<Person, String> h : hm.keySet()) { // hm.keySet()�������˫�м����м��ļ���
			String value = hm.get(h); // ��ȡֵ����
			// ��������˫�м��϶���
			for (Person key : h.keySet()) { // h.keySet()��ȡ���������е�Person������
				String value2 = h.get(key);
				System.out.println(key + "=" + value + "=" + value2);
			}
		}
	}
}
