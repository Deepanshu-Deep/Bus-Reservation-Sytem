package com.deep.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deep.bus.entities.*;



public interface RouteDao extends JpaRepository<Route, Integer> {
	
	public Route findByRouteFromAndRouteTo(String from, String To);

}
