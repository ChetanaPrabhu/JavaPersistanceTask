package com.manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2
{
	public static void main(String[] args) {
		
	
	Configuration cnf = new Configuration();
	cnf.configure("hibernate.cfg.xml");
	
	SessionFactory fact1 = cnf.buildSessionFactory();
	Session session1 = fact1.openSession();
	Student s1=session1.get(.class, 100);
	System.out.println(s1);
	}
}
