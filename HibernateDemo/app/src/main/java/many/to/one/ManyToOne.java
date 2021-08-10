package many.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToOne {

	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
//		EntityManager em=emf.createEntityManager();
//		
//		em.getTransaction().begin();
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata dt=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=dt.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
//		em.getTransaction().begin();
		
		School sch=new School();
		sch.setScl_id(145);
		sch.setScl_name("Panindra Vidyalay");
		
		Student s1=new Student();
		s1.setSid(11);
		s1.setSname("Raju");
		s1.setCls(8);
		s1.setSchool(sch);
		
		Student s2=new Student();
		s2.setSid(13);
		s2.setSname("Biju");
		s2.setCls(9);
		s2.setSchool(sch);
		
		Student s3=new Student();
		s3.setSid(15);
		s3.setSname("Hari");
		s3.setCls(10);
		s3.setSchool(sch);
		
//		em.persist(sch);
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
		
//		em.getTransaction().commit();
		
//		em.close();
//		emf.close();
		
		session.save(sch);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		
		tx.commit();
		
		session.close();
		sf.close();

	}

}
