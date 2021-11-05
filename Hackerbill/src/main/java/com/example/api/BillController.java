package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bill;
import com.example.repository.BillRepositoty;

@CrossOrigin(origins = { "*" })
@RestController()
@RequestMapping("/bills")
public class BillController {

	@Autowired
	BillRepositoty billRepository;

	@GetMapping(produces = { "application/json" })
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}
    @GetMapping(value = "/{id}",produces = {"applicatio/json"})
    public Bill getBill(@PathVariable("id") String bill_no)   
	{  
	return billRepository.findById(bill_no).get();
		
	}
}