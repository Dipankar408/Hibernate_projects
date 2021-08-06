package core.pers.progs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private int bid;
	private String bname;
	@OneToMany(mappedBy="b")
	private List<Student> s=new ArrayList<Student>();
	public List<Student> getS() {
		return s;
	}
	public void setS(List<Student> s) {
		this.s = s;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String toString()
	{
		return "B-ID:"+bid+"  B_Name:"+bname;
	}
}
