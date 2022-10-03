package com.manyToOne;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration cnf = new Configuration();
		cnf.configure("hibernate.cfg.xml");
		

		College col = new College();
		col.setCollegeId(100);
		col.setCollegeName("CMRIT");

		Student s1 = new Student();
		s1.setStudentId(10);
		s1.setStudentName("Chetana");

		Student s2 = new Student();
		s2.setStudentId(11);
		s2.setStudentName("Rajitha");

		s1.setCollegeName(col);
		s2.setCollegeName(col);

		SessionFactory fact1 = cnf.buildSessionFactory();
		Session session1 = fact1.openSession();
		Transaction tx = session1.beginTransaction();
		session1.save(col);

		session1.save(col);
		session1.save(s1);
		session1.save(s2);
		tx.commit();
		session1.close();
	}

}
