package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Bill;

public interface BillRepositoty extends JpaRepository<Bill,String> {

}
