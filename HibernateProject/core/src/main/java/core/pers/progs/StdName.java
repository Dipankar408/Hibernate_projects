package core.pers.progs;

import javax.persistence.Embeddable;

@Embeddable
public class StdName {
	private String fname;
	private String mname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String toString()
	{
		return fname+mname+lname;
	}
}
