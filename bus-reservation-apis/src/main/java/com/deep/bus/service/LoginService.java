package com.deep.bus.service;

import com.deep.bus.entities.Admin;
import com.deep.bus.entities.LoginDto;
import com.deep.bus.entities.User;
import com.deep.bus.exception.AdminException;
import com.deep.bus.exception.CustomerException;

public interface LoginService {

	public User loginUser(LoginDto credential) throws CustomerException;
	
	public String logoutUser(String key) throws CustomerException;
	
	
	public Admin loginAdmin(LoginDto credential) throws AdminException;
	
	public String logoutAdmin(String key) throws AdminException;
	
	
}
