package Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.jettjia.Person;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����", 13));
		ts.add(new Person("����", 23));
		ts.add(new Person("����", 43));
		ts.add(new Person("����", 33));
		
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		
		System.out.println(ts);
	}
}
