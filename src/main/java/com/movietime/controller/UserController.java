package com.movietime.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movietime.model.MovieTickets;
import com.movietime.model.User;
import com.movietime.repository.MovieTicketsJpaRepository;
import com.movietime.service.UserJpaService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired 
	private UserJpaService userJpaService;
	
	@PostMapping("/login")
	public User userLogin(@RequestBody Map<String, String> request) {
	    String email = request.get("email");
	    String password = request.get("password");
		return userJpaService.userLogin(email, password) ;
	    
	    
	}
	
	@PostMapping("/add")
	public User newUser(@RequestBody User user) {
	    return userJpaService.newUser(user);
	}


	
	@DeleteMapping("/delete/{email}")
	void deleteUserByEmail(@PathVariable String email) {
	
		userJpaService.deleteUserByEmail(email);
	
	}
	
	
	
	
}
