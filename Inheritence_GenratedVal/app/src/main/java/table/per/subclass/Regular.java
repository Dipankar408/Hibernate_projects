package table.per.subclass;

import javax.persistence.*;

@Entity
@Table(name="Emplyee_Regular")
@PrimaryKeyJoinColumn(name="id")
public class Regular extends Employee{
	
	private double salary;
	private int bonus;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
