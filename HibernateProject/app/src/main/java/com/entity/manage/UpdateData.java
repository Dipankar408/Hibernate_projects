package com.entity.manage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import core.pers.progs.StdName;
import core.pers.progs.Student;

public class UpdateData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		StdName name=new StdName();
		name.setFname("Raghu");
		name.setMname("Ram");
		name.setLname("Rajan");
		
		Student s=em.find(Student.class, 8);
		
		s.setSname(name);
		s.setMarks(85);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();

	}

}
