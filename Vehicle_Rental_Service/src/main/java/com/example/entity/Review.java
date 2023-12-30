package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Review  {
	@Id
	private int rid;
	@Column(name = "Review Discription",nullable = false,length = 100)
//    @NotEmpty(message = "Review Discription required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 100, message = "Minimum 1 and maximum 100 characters allowed.")
	private String review;
	
	@Column(name= "Rating",length=2)
//	@Pattern(regexp = "^[0-9\\\\s]*$", message = "Only Numeric Values are Allowed.")
//    @Size(min = 1, max = 2, message = "Give Some Rating")
	private int rating;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "User_ID")
	private User user;
}
