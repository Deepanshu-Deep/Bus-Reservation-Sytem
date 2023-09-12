package com.deep.bus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.bus.entities.*;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer>{
	
	public List<Reservation> findByBus(Bus bus);
	
	
	
	
}