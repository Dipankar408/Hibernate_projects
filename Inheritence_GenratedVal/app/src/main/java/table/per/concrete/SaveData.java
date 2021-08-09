package table.per.concrete;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SaveData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata data=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=data.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Raghab");
		
		Employee e4=new Employee();
		e4.setName("Rajib");
		
		RegularEmp e2=new RegularEmp();
		e2.setName("Rajib");
		e2.setBonus(10);
		e2.setSalary(45000);
		
		
	ContractEmp e3=new ContractEmp();
	e3.setName("Binod");
	e3.setPay_per_hour(1500);
	e3.setContract_duration("25 hours");
	
	
	session.persist(e1);

	session.save(e4);
	session.persist(e2);
	session.save(e3);
	
	tx.commit();
	session.close();
	
	System.out.println("Success");

	}

}
