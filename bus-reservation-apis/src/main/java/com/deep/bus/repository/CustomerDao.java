package com.deep.bus.repository;

import com.deep.bus.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>  {

	public Optional<Customer> findByName(String customername);
	
}
