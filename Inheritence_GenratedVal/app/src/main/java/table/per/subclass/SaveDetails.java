package table.per.subclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SaveDetails {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("configure.xml").build();
		Metadata data=new MetadataSources(ssr).buildMetadata();
		
		SessionFactory sf=data.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Biraj");
		e1.setContact("256986");
		
		Regular e2=new Regular();
		e2.setName("Anu");
		e2.setContact("654869");
		e2.setBonus(10);
		e2.setSalary(65325);
		
		Contractual e3=new Contractual();
		e3.setContact("786954");
		e3.setName("Chintu");
		e3.setContract_duration("78 hours");
		e3.setPay_per_hour(2500);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
		session.close();
		
		System.out.println("Success");
		

	}

}
