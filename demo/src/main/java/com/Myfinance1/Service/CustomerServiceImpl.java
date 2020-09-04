package com.Myfinance1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Myfinance1.Entity.CustomerEntity;
import com.Myfinance1.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  {
	
	@Autowired
	private CustomerRepository customerRepo;

	public CustomerEntity createcustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		CustomerEntity cust=customerRepo.save(customer);
		return cust;
	}

	public List<CustomerEntity> getallcustomer() {
		
	
		return customerRepo.findAll();
	}
	public Optional<CustomerEntity> getcustomer(Integer ID) {
		
		
		return customerRepo.findById(ID);
	}

	public CustomerEntity updateCustomer(CustomerEntity customer1, Integer ID) {
		// TODO Auto-generated method stub
		
		customerRepo.save(customer1);
		CustomerEntity customer =new CustomerEntity();
		customer=customerRepo.getOne(ID);
		
		
		return customer;
	}

	public void  deletcustomer(Integer iD) {
		// TODO Auto-generated method stub
		
		customerRepo.deleteById(iD);
		
	}

}
