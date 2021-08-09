package progs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

import org.hibernate.Query;

public class casCadeTest {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pers");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Person p=em.find(Person.class, 105);
		em.remove(p);
//		Query q=(Query) em.createQuery("select p.pname from Person p where p.pid=103");
//		PName nm=(PName) q.uniqueResult();
//		System.out.println("name:"+nm);
//		Query q1=(Query) em.createNamedQuery("find name");
//		List<Person> pname=q1.getResultList();
//		for(Person l:pname)
//		{
//			System.out.println(l.getPname());
//		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Success");
	}
}
