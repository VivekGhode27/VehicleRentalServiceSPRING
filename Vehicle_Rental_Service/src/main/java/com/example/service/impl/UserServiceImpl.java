package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;


@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String uemail) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(uemail);
		// return user.map(UserPrincipal::new).orElseThrow(() -> new
		// UsernameNotFoundException("user not found"));
		if (user == null)
			throw new UsernameNotFoundException("User 403");
		return new UserPrincipal(user);

	}
	
	@Override
	public User addNewUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		User exstingUser=userRepository.findById(user.getUid()).get();
		exstingUser.setFname(user.getFname());
		exstingUser.setLname(user.getLname());
		exstingUser.setContact(user.getContact());
		exstingUser.setUemail(user.getUemail());
		return userRepository.save(exstingUser);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}

}
