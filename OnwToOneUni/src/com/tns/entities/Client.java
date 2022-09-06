package com.tns.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student students = new Student();
		students.setName("Deepak Patil");
		Address homeAddress = new Address();
		homeAddress.setStreet("Ring Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411 017");
		
		//inject address into student
		students.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(students);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}