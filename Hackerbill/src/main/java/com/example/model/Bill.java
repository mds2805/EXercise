package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
public class Bill {
	
	@Id
	private String bill_no;
	private String bill_to;
	private Date bill_date;
	private double bill_amt;
	private double bill_tax;
	private double bill_Toatal_amt;
	
	public Bill() {
		super();
	}

	public Bill(String bill_no, String bill_to, Date bill_date, double bill_amt, double bill_tax,
			double bill_Toatal_amt) {
		super();
		this.bill_no = bill_no;
		this.bill_to = bill_to;
		this.bill_date = bill_date;
		this.bill_amt = bill_amt;
		this.bill_tax = bill_tax;
		this.bill_Toatal_amt = bill_Toatal_amt;
	}

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}

	public String getBill_to() {
		return bill_to;
	}

	public void setBill_to(String bill_to) {
		this.bill_to = bill_to;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	public double getBill_amt() {
		return bill_amt;
	}

	public void setBill_amt(double bill_amt) {
		this.bill_amt = bill_amt;
	}

	public double getBill_tax() {
		return bill_tax;
	}

	public void setBill_tax(double bill_tax) {
		this.bill_tax = bill_tax;
	}

	public double getBill_Toatal_amt() {
		return bill_Toatal_amt;
	}

	public void setBill_Toatal_amt(double bill_Toatal_amt) {
		this.bill_Toatal_amt = bill_Toatal_amt;
	}
	
	

}

