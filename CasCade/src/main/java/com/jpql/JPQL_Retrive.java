package com.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import progs.Person;

public class JPQL_Retrive {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pers");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		Query q1=(Query) em.createQuery("update Person set age=44 where pid=105");
		q1.executeUpdate();
		
		Query q=(Query) em.createNamedQuery("find name");
		
		List<Person> list=q.getResultList();
		System.out.print("P_id");
		System.out.print("\t P_Name");
		System.out.println("\t\t P_Age");
		for(Person p: list)
		{
			System.out.print(p.getPid());
			System.out.print("\t"+p.getPname());
			System.out.println("\t"+p.getAge());
		}
		
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
