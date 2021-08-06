package com.onemany.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mobile_Nos")
public class Phone {
	@Id
	private int phno;
	private String pbrand;
	private double price;
	@ManyToOne
	private Person p;
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString()
	{
		return "Phone-No:"+phno+"  Brand:"+pbrand+"  Price:"+price;
	}
}
