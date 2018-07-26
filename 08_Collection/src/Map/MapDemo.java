package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	/**
	 * Map���ϵĹ��ܸ���
	 * a.���
	 * 		V put(K key, V value) ���Ԫ��
	 * 			������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
	 * 			��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	 * b.ɾ��
	 * 		void clear()	�Ƴ����еļ�ֵ��Ԫ��
	 * 		V remove(Object key) ���ݼ�ɾ����ֵԪ�أ�����ֵ����
	 * c.�ж�
	 * 		boolean containsKey(Object key) �жϼ����Ƿ����ָ���ļ�
	 * 		boolean containsValue(Object key) �жϼ����Ƿ����ָ����ֵ
	 * 		boolean isEmpty() �жϼ����Ƿ�Ϊ��
	 * d.��ȡ
	 * 		V get(Object key) ���ݼ���ȡֵ
	 * 		Set<K> keySet() ��ȡ���������м��ļ���
	 * 		Collection<V> values() ��ȡ����������ֵ�ļ���
	 * e.����
	 * 		size() ���ؼ����еļ�ֵ�Եĸ���
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("zhangsan", 23);
		map.put("lisi", 24);
		map.put("wangwu", 25);
		
		// ��ȡvalue
		Collection<Integer> c = map.values();
		System.out.println(c);
		
		// ɾ��
		Integer val = map.remove("zhangsan"); // ���ݼ�ɾ��Ԫ��,���ؼ���Ӧ��ֵ
		System.out.println(val);
		
		// �ж�
		System.out.println(map.containsKey("lisi")); // true, �ж��Ƿ��������ļ�
		System.out.println(map.containsValue(50)); // false, �ж��Ƿ���������ֵ
		
		// ���� Map û�� iterator
		// ������ʽ1 - ��ǿfor
		for(String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
		// ������ʽ2 - Entry
		for(Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}
		
	}
}
