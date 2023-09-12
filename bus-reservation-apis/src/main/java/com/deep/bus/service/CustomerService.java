package com.deep.bus.service;

import java.util.List;

import com.deep.bus.dto.CustomerDto;
import com.deep.bus.entities.Customer;
import com.deep.bus.exception.CustomerException;



public interface CustomerService {
	
	public Customer createCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(CustomerDto customerDto) throws CustomerException;
	
	public Customer deleteCustomer() throws CustomerException;
	
	public Customer viewCustomer() throws CustomerException;
	
	public List<Customer> viewAllCustomer() throws CustomerException ;

}
