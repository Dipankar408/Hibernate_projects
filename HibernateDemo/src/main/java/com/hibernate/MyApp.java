package com.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.setLid(12);
		lp.setLname("Asus");
		
		Laptop lp2=new Laptop();
		lp2.setLid(10);
		lp2.setLname("Dell");
		
		Student s = new Student();
		s.setSid(236);
		s.setSname("Waju");
		s.setMarks(75.23);
		s.getLap().add(lp);
		lp.getStd().add(s);
		
		
		Student s2 = new Student();
		s2.setSid(254);
		s2.setSname("harshit");
		s2.setMarks(68);
		s2.getLap().add(lp);
		lp.getStd().add(s2);
		lp2.getStd().add(s2);
		
		
//		Student ch_std = null;
//		Laptop ch_lp = null;
//		int st_id = s.getSid();
//		int lp_id = lp.getLid();
//		System.out.println(st_id);
//		System.out.println(lp_id);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		 
		Transaction tx = session.beginTransaction();
		
		
		session.save(lp);
		session.save(s);
		session.save(lp2);
		session.save(s2);
		
//		Query q = session.createQuery("from Student where sid=" + st_id);
//		ch_std = (Student) q.uniqueResult();
//		
//		Query q1 = session.createQuery("from Laptop where lid=" + lp_id);
//		ch_lp = (Laptop) q1.uniqueResult();
//		if(ch_lp!=null)
//		{
//			Session ss=sf.openSession();
//			Transaction t=ss.beginTransaction();
//			int id=ch_lp.getLid();
//			Query data=ss.createQuery("delete from Laptop where lid="+id);
//			data.executeUpdate();
//			t.commit();
//			
//		}
//		if (ch_std == null) {
//			s.getLap().add(ch_lp);
//			session.save(s);
//			session.save(lp);
//		}
//		
//		if (ch_lp == null) {
//			lp.getStd().add(ch_std);
//			session.save(lp);
//		}
//		
		tx.commit();
		System.out.println("Done");

	}

}
