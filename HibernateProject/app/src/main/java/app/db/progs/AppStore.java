package app.db.progs;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import core.pers.progs.*;
public class AppStore {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Random num=new Random();
		for(int i=1;i<=10;i++)
		{
			char f=(char)(64+i);
			char l=(char)(91-i);
			char m=(char)(96+i);
			StdName sn=new StdName();
			sn.setFname(f+" ");
			sn.setMname(m+" ");
			sn.setLname(l+" ");
			Student std=new Student();
			std.setRoll_no(i);
			std.setSname(sn);
			std.setMarks(num.nextInt(100));
			session.save(std);
		}
		tx.commit();
		System.out.println("Thank you");
	}

}
