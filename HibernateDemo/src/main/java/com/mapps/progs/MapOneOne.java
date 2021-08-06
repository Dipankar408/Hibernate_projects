package com.mapps.progs;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneOne {

	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.setPhno(115);
		phone.setPbrand("Apple");
		phone.setPrice(51599);
		phone.setP(null);
		PName pn=new PName();
		pn.setFname("Raghu");
		pn.setMname("Ram");
		pn.setLname("Rajan");
		Person person=new Person();
		person.setPid(103);
		person.setPname(pn);
		person.setAge(35);
		person.setPhn(phone);
		phone.setP(person);
		Configuration con=new Configuration();
		con.configure().addAnnotatedClass(Person.class).addAnnotatedClass(Phone.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(phone);
		session.save(person);
		tx.commit();
		System.out.println("Stored Succesfully");
		
	}

}
