package equals;

import java.time.LocalDate;
import java.util.Objects;

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	// ���캯��
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	// �ٷֱ����ӹ��ʷ���
	public void raiseSalary(double byPercent) {
		double raise = byPercent * salary / 100;
		salary += raise;
	}

	// Rewrite equals
	public boolean equals(Object otherObject) {
		// ���ټ������Ƿ���ͬ
		if (this == otherObject)
			return true;

		// �����ʽ����Ϊ�գ��򷵻�false
		if (otherObject == null)
			return false;

		// ����಻ƥ�䣬���ǾͲ������
		if (getClass() != otherObject.getClass())
			return false;

		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;

		return Objects.equals(name, other.name) 
				&& salary == other.salary 
				&& Objects.equals(hireDay, other.hireDay);
	}

	// ��д hashCode
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
}
