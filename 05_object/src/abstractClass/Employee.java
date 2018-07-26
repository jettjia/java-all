package abstractClass;

import java.time.LocalDate;

public class Employee extends Person {
	private double salary;
	private LocalDate hireDay;

	// ���췽��
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	// ��ù���
	public double getSalary() {
		return salary;
	}

	// ���������
	public LocalDate getHireDay() {
		return hireDay;
	}

	// ʵ�ֳ�����Person�е� getDescription����������
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}

	// �ٷֱ����ӹ��ʷ���
	public void raiseSalary(double byPercent) {
		double raise = byPercent * salary / 100;
		this.salary += raise;
	}
}
