package com.entity.manage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import core.pers.progs.Student;

public class FindData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s=em.find(Student.class, 9);
		
		System.out.println("Roll-No: "+s.getRoll_no());
		System.out.println("Student Name:"+s.getSname());
		System.out.println("Student Marks:"+s.getMarks());
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();

	}

}
