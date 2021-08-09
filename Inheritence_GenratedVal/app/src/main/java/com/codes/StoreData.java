package com.codes;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Rajesh");
		
		Regular_Emp e2=new Regular_Emp();
		e2.setName("Akhil");
		e2.setSalary(15499);
		e2.setBonus(5);
		
		Contract_Emp e3=new Contract_Emp();
		e3.setName("Bijoy");
		e3.setPay_per_hour(700);
		e3.setContract_duration("10 Hours");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
		session.close();
		System.out.println("Success");

	}

}
