package com.mapps.progs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class casCadeRemove {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Person p=em.find(Person.class, 105);
		em.remove(p);
		
		em.getTransaction().commit();
		emf.close();
		em.close();
		System.out.println("Success");
	}

}
