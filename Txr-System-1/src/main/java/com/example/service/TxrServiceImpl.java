package com.example.service;



import java.util.Date;

import com.example.entity.Account;
import com.example.entity.Txn;
import com.example.entity.TxnType;
import com.example.repository.AccountRepository;
import com.example.repository.TxnRepository;

public class TxrServiceImpl implements TxrService {
	
	
	private AccountRepository accountRepository;
    private TxnRepository txnRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void transfer(double amount, String fromAcc, String toAcc) {
		
	

		Account fromAccount = accountRepository.load(fromAcc);

		if (fromAccount == null) {
			//logger.error("account not found " + fromAcc);
			throw new AccountNotFoundExeption(fromAcc);
		}

		Account toAccount = accountRepository.load(toAcc);

		if (toAccount == null) {
		//	logger.error("account not found " + toAcc);
			throw new AccountNotFoundExeption(toAcc);
		}

		if (fromAccount.getBalance() < amount) {
			//logger.error("no enough balance " + fromAccount.getBalance());
			throw new AccountBalanceException(fromAccount.getBalance());
		}

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);
		
		Txn debitTxn=new Txn();
        debitTxn.setType(TxnType.DEBIT);
        debitTxn.setAccount(fromAccount);
        debitTxn.setAmount(amount);
        debitTxn.setDate(new Date());

        Txn creditTxn=new Txn();
        creditTxn.setType(TxnType.CREDIT);
        creditTxn.setAccount(toAccount);
        creditTxn.setAmount(amount);
        creditTxn.setDate(new Date());

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		Txn debitTxn1 = new Txn();
		debitTxn.setAccount(fromAccount);

		Txn creditTxn1 = new Txn();
		creditTxn.setAccount(toAccount);

		txnRepository.save(debitTxn1);
	    txnRepository.save(creditTxn1);

		//logger.info("txr success...");
	}

}
