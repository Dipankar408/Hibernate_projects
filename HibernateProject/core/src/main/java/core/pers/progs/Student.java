package core.pers.progs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll_no;
	private StdName sname;
	private double marks;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public StdName getSname() {
		return sname;
	}

	public void setSname(StdName sname) {
		this.sname = sname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Roll-No:" + roll_no + ", Name:" + sname + ", Marks:" + marks + " ";
	}
}
