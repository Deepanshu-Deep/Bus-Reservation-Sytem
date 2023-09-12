package com.deep.bus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deep.bus.entities.Admin;
import com.deep.bus.entities.Customer;
import com.deep.bus.entities.User;
import com.deep.bus.repository.AdminDao;
import com.deep.bus.repository.CustomerDao;


@RestController
public class LoginController {


	@Autowired
	private AdminDao adminDao;

	@Autowired
	private CustomerDao customerDao;

	@GetMapping("/signIn")
	public ResponseEntity<User> loginUser(Authentication auth) {

		User user  = null;


		List<GrantedAuthority> grantedAuthorityList = (List<GrantedAuthority>) auth.getAuthorities();

		String role = grantedAuthorityList.get(0).toString();


		switch (role) {

			case "ROLE_CUSTOMER" :  Optional<Customer> customer =  customerDao.findByName(auth.getName());

			                     user = customer.get();

								 break;

			case "ROLE_ADMIN" : 	Optional<Admin> admin = adminDao.findByName(auth.getName());

								user = admin.get();

								break;


			default:
		}




		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
			
		}

}
