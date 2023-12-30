package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;


@RestController

public class UserController {

	
	@Autowired
	UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping(path = "/user") //
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		Map<String, String> errors = new HashMap<>();
		String field = null;
		String message = null;
		try {
			String pwd = user.getPassword();
			String bcryptpwd = passwordEncoder.encode(pwd);
			user.setPassword(bcryptpwd);

			User savedUser = userServiceImpl.addNewUser(user);
			return new ResponseEntity<Object>(savedUser, HttpStatus.CREATED);
		} catch (Exception ex) {

			field += 23000;

			message += "Duplication of unique field";
//
			// }
//				}
//			}
			// }
			errors.put(field, message);
			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);

		}

	}
	
	@GetMapping("/users")
	public List<User> findAllUser()
	{
		return userService.getAllUser();
		
	}
	
	@DeleteMapping("user/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
		
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	
}
