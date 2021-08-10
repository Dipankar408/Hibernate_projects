package one.to.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person_address")
public class Address {
	@Id
	private long pin;
	private String addr;
	private String state;
	
	@OneToMany
	List<Person>  pd=new ArrayList<Person>();
	
	
	public List<Person> getPd() {
		return pd;
	}
	public void setPd(List<Person> pd) {
		this.pd = pd;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
