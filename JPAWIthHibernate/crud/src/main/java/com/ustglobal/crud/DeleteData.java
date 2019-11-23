package com.ustglobal.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crud.dto.Student;

public class DeleteData {
public static void main(String[] args) {
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student student = entityManager.find(Student.class, 2);
		entityManager.remove(student);
		System.out.println("Deleted record");
		entityTransaction.commit();

	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}

}
}
