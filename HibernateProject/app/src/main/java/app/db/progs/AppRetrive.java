package app.db.progs;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Map;
import org.hibernate.query.Query;

import core.pers.progs.*;

public class AppRetrive {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		SQLQuery q=session.createSQLQuery("select sname,marks from Student where roll_no%2==0");
//		q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		List obj=q.list();
//		for(Object s:obj)
//		{
//			Map m=(Map)s;
//			System.out.println(m.get("sname")+": "+m.get("marks"));
//		}
		Query q = session.createQuery("select sname,roll_no from Student where marks>60");
//		Double tot=(Double)q.uniqueResult();
		List<StdName> name = (List<StdName>) q.list();
		List<Object[]> std = q.list();
		List<Student> s = q.list();
		for (Object[] l : std) {
			System.out.println("Roll-No:-" + l[1] + "     Name:-" + l[0]);
			// System.out.println(l);
		}
//		Student s=(Student) q.uniqueResult();
//		System.out.println(tot);
		tx.commit();
		System.out.println("Thank you");
	}

}
