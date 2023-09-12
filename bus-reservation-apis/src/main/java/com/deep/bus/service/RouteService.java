package com.deep.bus.service;

import java.time.LocalDate;
import java.util.List;

import com.deep.bus.entities.Bus;
import com.deep.bus.entities.Route;
import com.deep.bus.exception.CustomerException;
import com.deep.bus.exception.RouteException;


public interface RouteService {

	public Route addRoute(Route route) throws RouteException, CustomerException;

	public Route updateRoute(Route route) throws RouteException, CustomerException;

	public Route deleteRoute(Integer routeId) throws RouteException, CustomerException;

	public Route viewRoute(Integer routeId) throws RouteException, CustomerException;
	
	public List<Route> viewAllRoute() throws RouteException, CustomerException;
	
	public List<Bus> viewBusByRoute(String soure, String destination , LocalDate date) throws RouteException;

}
