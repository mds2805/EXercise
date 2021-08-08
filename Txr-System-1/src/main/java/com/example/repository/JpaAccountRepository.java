package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.entity.Account;

public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account load(String accNumber) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("app");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		Account account=em.find(Account.class,accNumber);
		em.getTransaction().commit();
		em.close();
		return account;
	}

	@Override
	public void update(Account account) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Account accountdetail =em.find(Account.class,account);
//		account.setBalance(account.getBalance());
//		account.setNumber(account.getNumber());
		em.merge(accountdetail);
		em.getTransaction().commit();
		em.close();
		
		
	}
  
}
