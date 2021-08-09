package table.per.concrete;

import javax.persistence.*;

@Entity
@Table(name="regular_emp")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})
public class RegularEmp extends Employee{
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
