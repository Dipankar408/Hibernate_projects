package com.onemany.map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapOneMany {

	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.setPhno(185);
		phone.setPbrand("Appo");
		phone.setPrice(21599);
		phone.setP(null);
		PName pn=new PName();
		pn.setFname("Babu");
		pn.setMname("Kr.");
		pn.setLname("Saha");
		Person person=new Person();
		person.setPid(105);
		person.setPname(pn);
		person.setAge(25);
		person.getPhn().add(phone);
		phone.setP(person);
		Person ch=null;
		Configuration con=new Configuration();
		con.configure().addAnnotatedClass(Person.class).addAnnotatedClass(Phone.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		int no=person.getPid();
		System.out.println(no);
		Query q=session.createQuery("from Person where pid="+no);
		ch=(Person)q.uniqueResult();
		if(ch==null)
		{
			session.save(person);
		}
		session.save(phone);
		tx.commit();
		System.out.println("Succesfully save");
	}

}
