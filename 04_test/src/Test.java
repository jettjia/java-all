public class Test {
	public static void main(String[] args) {
		Employee e = new Employee("jet");
		Class cl = e.getClass(); // �����
		System.out.println(cl);
		System.out.println(e.getClass().getName()); // ����������
	}
}

class Employee {
	private String name;
	private int age;
	
	public Employee(String name) {
		name = name;
	}
	
	public String getName() {
		return name;
	}
}