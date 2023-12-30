package com.example.service;

import java.util.List;

import com.example.Exception.UserNotFoundException;
import com.example.entity.User;



public interface UserService {
	public User addNewUser(User user);
	public User updateUser(User user);
	public List<User> getAllUser();
	public User getUserById(int id);
	
	public void deleteUser(int id);
}
