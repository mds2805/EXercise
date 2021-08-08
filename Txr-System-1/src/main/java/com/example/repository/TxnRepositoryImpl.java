package com.example.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.entity.Txn;

public class TxnRepositoryImpl implements TxnRepository{
	
	

	@Override
	public void save(Txn txn) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(txn);
		
	}

	@Override
	public List<Txn> findByCount(int count, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Txn> findByMonth(int count, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Txn> findByDateRange(LocalDate fromDate, LocalDate toDate, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
