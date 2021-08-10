package one.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
//		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Address.class).addAnnotatedClass(Person.class);
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
		Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=data.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Address adr=new Address();
		adr.setPin(560029);
		adr.setAddr("Btm Layout");
		adr.setState("Karnataka");
		
		Person p1=new Person();
		p1.setPid(101);
		p1.setPname("Biplob");
		p1.setAge(26);
		
		Person p2=new Person();
		p2.setPid(103);
		p2.setPname("Arun");
		p2.setAge(25);
		
		adr.getPd().add(p2);
		adr.getPd().add(p1);
		
		session.save(adr);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		
		session.close();
		
		

	}

}
