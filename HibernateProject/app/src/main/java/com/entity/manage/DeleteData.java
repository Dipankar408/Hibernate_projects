package com.entity.manage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import core.pers.progs.Student;

public class DeleteData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s=em.find(Student.class, 5);
		
	em.remove(s);
	
	em.getTransaction().commit();
	
	emf.close();
	em.close();

	}

}
