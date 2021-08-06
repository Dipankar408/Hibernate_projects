package app.db.progs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import core.pers.progs.*;

public class PersRetrive {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Student s=em.find(Student.class, 5);
		System.out.println(s);
		tx.commit();
	}

}
