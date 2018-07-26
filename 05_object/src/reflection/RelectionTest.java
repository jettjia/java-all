package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

import javax.naming.directory.ModificationItem;

public class RelectionTest {
	public static void main(String[] args) {
		// read class name from command line args or user input
		String name;
		if (args.length > 0) {
			name = args[0];
		} else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name(e.g. java.util.Date):");
			name = in.next();
		}
		try {
			Class cl = Class.forName(name); // ������������Ϊname��Class����
			Class supercl = cl.getSuperclass(); // ���س����Class����
			// ����һ��������ֵ���ò�ͬ��λ��������public��static���������η�ʹ�����
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print("class " + name);
			// ������಻Ϊnull��Object������������Ϣ
			if (supercl != null && supercl != Object.class) System.out.print(" extends " + supercl.getName());
			
			System.out.print("\n{\n");
			printConstructors(cl); // ��ӡ����������
			System.out.println();
			printMethods(cl); // ��ӡ����
			System.out.println();
			printFields(cl); // ��ӡpublic��
			System.out.println("}");
		} catch(ClassNotFoundException e) {
			
		}
	}
	
	/**
	 * ��ӡ�������еĹ�������Ϣ
	 * @param cl a lcass
	 */
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors(); // ����������еĹ�����
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print("  ");
			// ����һ��������ֵ���ò�ͬ��λ��������public��static���������η�ʹ�����
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");
			
			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * ��ӡ�������еķ���
	 * @param cl a class
	 */
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();
			
			System.out.print("  ");
			// print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * ��ӡ�������е� public��
	 * @param cl a class
	 */
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			String modifers = Modifier.toString(f.getModifiers());
			if (modifers.length() > 0) System.out.print(modifers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}
}
