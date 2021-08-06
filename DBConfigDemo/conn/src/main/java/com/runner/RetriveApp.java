package com.runner;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import con.info.*;
public class RetriveApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started");
		Employee emp=null;
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=con.buildSessionFactory();
		System.out.println("Information of Employess:");
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q1=session.createQuery("from Employee where eid=105");
		q1.setCacheable(true);
		emp=(Employee)q1.uniqueResult();
//		emp=session.get(Employee.class, 105);
		System.out.println(emp);
		tx.commit();
		Session session1=sf.openSession();
		Transaction tx1=session1.beginTransaction();
		Query q2=session1.createQuery("from Employee where eid=105");
		emp=(Employee)q2.uniqueResult();
		q2.setCacheable(true);
		//		emp=session1.get(Employee.class, 105);
		System.out.println(emp);
		tx1.commit();
		
		
	}

}
