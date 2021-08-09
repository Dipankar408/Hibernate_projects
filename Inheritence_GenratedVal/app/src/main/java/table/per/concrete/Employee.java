package table.per.concrete;

import javax.persistence.*;

@Entity
@Table(name="emp_data")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="emp_genrator")
	@SequenceGenerator(name="emp_genrator",sequenceName="emp_seq",allocationSize=5)
	private int id;
	
	@Column(name="Emp_Name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
