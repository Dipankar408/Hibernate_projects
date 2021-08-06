package com.runner;
import con.info.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppRun {

	public static void main(String[] args) {
		System.out.println("Start");
		Emp_Name en=new Emp_Name();
		en.setFname("Dipankar");
		en.setMname("Ch.");
		en.setLname("Barman");
		Employee emp=new Employee();
		emp.setEid(101);
		emp.setEname(en);
		emp.setPhno(6226456);
		emp.setSal(38000);
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		emp.setSal(45000);
		tx.commit();
		System.out.println(emp);
		System.out.println("Completed");
		
	}

}
