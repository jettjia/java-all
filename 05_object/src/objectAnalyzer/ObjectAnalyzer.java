package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer {
	private ArrayList<Object> visited = new ArrayList<>();
	
	/**
	 * Converts an object to a string representation that lists all fields
	 * @param obj an object
	 * @return a string with the object's class name and all field names and values
	 */
	public String toString(Object obj) {
		if (obj == null) return "null";
		if(visited.contains(obj)) return "..."; // contains() ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true
		visited.add(obj);
		Class cl = obj.getClass();
		if (cl == String.class) return (String)obj;
		if (cl.isArray()) {
			String r = cl.getComponentType() + "[{"; // getComponentType() ȡ��һ�������Class����
			for (int i = 0; i < Array.getLength(obj); i++) {
				if (i > 0) r += ",";
				Object val = Array.get(obj, i); // get()�������ֵ
				if (cl.getComponentType().isPrimitive()) r += val; // isPrimitive()ȷ��ָ����Class�����ʾһ����������
				else r += toString(val);
			}
			return r + "}";
		}
		
		String r = cl.getName();
		// inspect the fields of this class and all superclasses
		do {
			r += "{";
			Field[] fields = cl.getDeclaredFields(); //������е�������
			AccessibleObject.setAccessible(fields, true); // �����е�������Ϊ���Է���
			// get the names and values of all fields
			for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					if (!r.endsWith("[")) r += ",";
					r += f.getName() + "=";
					try {
						Class t = f.getType();
						Object val = f.get(obj);
						if (t.isPrimitive()) r += val;
						else r += toString(val);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			r += "}";
			cl = cl.getSuperclass();
		}while(cl != null);
		return r;
	}
}
