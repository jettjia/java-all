package Map;

import java.util.HashMap;
import java.util.Hashtable;
public class HashtableDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, 23);
		hm.put("����", null);
		System.out.println(hm);
		
		// Hashtable����
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put(null, 23);
		hm.put("����", null);
		System.out.println(hm);
	}
}
