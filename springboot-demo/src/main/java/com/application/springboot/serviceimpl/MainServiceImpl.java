package com.application.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.application.springboot.model.User1;


@Repository
public class MainServiceImpl {
	/*@PersistenceContext
	private EntityManager entityManager;*/
	
	public void add(User1 r){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

	System.out.println("in add user impl");
	entityManager.getTransaction().begin();
	entityManager.persist(r);
entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
	
	
	}
	
	public ArrayList<User1> getData(User1 u1){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
	
	Query user1 =
			(Query) entityManager.createQuery("select * FROM User1",User1.class);
	List user = user1.list();
	ArrayList<User1> users = new ArrayList<User1>();
	users.addAll(user);
	entityManager.close();
	entityManagerFactory.close();
	return users;
	}
	
}
	
	
	
