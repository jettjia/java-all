package equals;

public class Manager extends Employee {
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
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
	
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) return false;
		Manager other = (Manager) otherObject;
		return bonus == other.bonus;
	}
	
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}
}
