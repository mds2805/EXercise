package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS",schema = "accounts_db")
public class Account {
    @Id
    @Column(name="NUMBER")
    private String number;
    @Column(name="BALANCE")
    private double balance;
    @OneToMany
    private List<Txn> txns;
	public Account(String number, double balance, List<Txn> txns) {
		super();
		this.number = number;
		this.balance = balance;
		this.txns = txns;
	}
	public Account() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<Txn> getTxns() {
		return txns;
	}
	public void setTxns(List<Txn> txns) {
		this.txns = txns;
	}
    

}