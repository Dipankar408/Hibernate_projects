package table.per.concrete;

import javax.persistence.*;

@Entity
@Table(name="contract_emp")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class ContractEmp extends Employee{
	private int pay_per_hour;
	
	private String contract_duration;

	public int getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	

}
