package com.onemany.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Person_Info")
public class Person {
	@Id
	private int pid;
	private PName pname;
	private int age;
	@OneToMany(mappedBy="p")
	private List<Phone> phn=new ArrayList<Phone>();
	public List<Phone> getPhn() {
		return phn;
	}
	public void setPhn(List<Phone> phn) {
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
