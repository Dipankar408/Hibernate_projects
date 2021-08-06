package con.info;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="emp")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	@Id
	private int eid;
	private Emp_Name ename;
	public Emp_Name getEname() {
		return ename;
	}
	public void setEname(Emp_Name ename) {
		this.ename = ename;
	}
	private long phno;
	private double sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EID:"+eid+", ENAME:"+ename+", Contact:"+phno+", salary:"+sal;
	}
	
}
