package com.demoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args)
	{
		Person p = new Person();
		p.setPersonId(1000);
		p.setPersonName("Chetana");
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("/ProjectJPA/src/main/resources/META-INF/persistance.xml");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		
		
		
	}

}
