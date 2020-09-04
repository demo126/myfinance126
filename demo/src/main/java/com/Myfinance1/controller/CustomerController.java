package com.Myfinance1.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Myfinance1.Entity.CustomerEntity;

import com.Myfinance1.Service.CustomerServiceImpl;


@RestController
@CrossOrigin
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerservice;
	
	@PostMapping("/save")
	public String savecustomer(@RequestBody CustomerEntity customer1) {
		
		customerservice.createcustomer(customer1);
		return "data saved";
		
	}
	
	@GetMapping("/get")
	@ResponseBody
	public List<CustomerEntity> getallcustomer() {
		return customerservice.getallcustomer();
		
		
		
	}
	
	@GetMapping("/get/{ID}")
	@ResponseBody
	public Optional<CustomerEntity> getcustomer(@PathVariable Integer ID) {
		return customerservice.getcustomer(ID);
		
		
		
	}
	@PutMapping("/Update/{ID}")
	public CustomerEntity updatecustomer(@PathVariable Integer ID, @RequestBody CustomerEntity customer1) {
		
		return customerservice.updateCustomer(customer1, ID);
		
	}
	@DeleteMapping("/Dlete/{ID}")
	public String deleteCustomer(@PathVariable Integer ID) {
		customerservice.deletcustomer(ID);
		return "customer deleted";
	}
	
	
	}
	

