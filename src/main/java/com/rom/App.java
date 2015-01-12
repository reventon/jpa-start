package com.rom;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@PersistenceUnit
public class App {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa");
		EntityManager em = emf.createEntityManager();
		
		System.err.println();
		UserTransaction d;
		
//		em.getTransaction( ).begin( );
//		Employee employee = new Employee( ); 
//	   	employee.setId( 1201 );
//	   	employee.setName( "Gopal" );
//	   	employee.setSalary( 40000 );
//	   	employee.setDeg( "Technical Manager" );
//	   	
//	   	em.persist( employee );
//	   	em.getTransaction( ).commit( );
		
		Employee employee = em.
	   			find( Employee.class, 1201 );
		System.out.println(employee);
		
		em.close();
		emf.close();
	}

}
