package com.example.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.repository.TxnRepository;
import com.example.repository.TxnRepositoryImpl;
import com.example.service.TxrService;
import com.example.service.TxrServiceImpl;
@WebServlet(urlPatterns = {"/txr"})
public class AccountServlet extends HttpServlet {
	  AccountRepository accountRepository=new JpaAccountRepository();
	  TxrService txrService=new TxrServiceImpl(accountRepository);

  
	  @Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  System.out.println("sucess.");
		  System.out.println("sucess.");
		  System.out.println("sucess.");
		  System.out.println("sucess.");
		  System.out.println("sucess.");
		  System.out.println("sucess.");
		  
//		
//		double amount=Double.parseDouble(req.getParameter("amount"));
//		String fromAcc=req.getParameter("fromAcc");
//		String toAcc =req.getParameter("toAcc");
//		txrService.transfer(amount,fromAcc,toAcc);
		
 }
}
