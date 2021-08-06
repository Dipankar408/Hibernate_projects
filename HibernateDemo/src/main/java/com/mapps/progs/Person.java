package com.mapps.progs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Person {
	@Id
	private int pid;
	private PName pname;
	private int age;
	@OneToOne(mappedBy="p")
	private Phone phn;
	public Phone getPhn() {
		return phn;
	}
	public void setPhn(Phone phn) {
		this.phn = phn;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public PName getPname() {
		return pname;
	}
	public void setPname(PName pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "Person ID:"+pid+"  Name:"+pname+"  Age:"+age;
	}
	

}
