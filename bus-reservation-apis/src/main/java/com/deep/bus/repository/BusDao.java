package com.deep.bus.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deep.bus.entities.*;


public interface BusDao extends JpaRepository<Bus, Integer> {

	public List<Bus> findByBusType(String busType);
	
	
	
}
