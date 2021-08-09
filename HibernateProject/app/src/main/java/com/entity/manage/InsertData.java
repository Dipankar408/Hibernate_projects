package com.entity.manage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import core.pers.progs.StdName;
import core.pers.progs.Student;

public class InsertData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StdName name=new StdName();
		name.setFname("Raju");
		name.setMname("Lal");
		name.setLname("Tripathi");
		
		Student st=new Student();
		st.setRoll_no(11);;
		st.setSname(name);
		st.setMarks(65);
		
		em.persist(st);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();

	}

}
