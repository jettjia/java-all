package Employee;

/**
 * ���ࣨ�����ࣩ
 */
public class Manager extends Employee {
	private double bonus;
	
	// ����Manager���췽��
	public Manager(String name, double salary, int year, int month, int day) {
		// ���ó���Ĺ�����
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	// ���bonus����
	public double getSalary() {
		// ���ó����getSalary()���������нˮ
		double superSalary = super.getSalary();
		return superSalary + bonus;
	}
	
	// ����bonus����
	public void setBonus(double b) {
		bonus = b;
	}
}
