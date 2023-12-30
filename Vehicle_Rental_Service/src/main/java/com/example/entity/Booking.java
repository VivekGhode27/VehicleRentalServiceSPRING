package com.example.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "Booking_Table")
public class Booking  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	
	//@Column(name = "Gender",nullable = false,length = 10)
//    @NotEmpty(message = "Gender is required")
//    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 3, max = 10, message = "Minimum 3 and maximum 10 characters allowed.")
	private String gender;
	
	//@Column(name = "Address",nullable = false,length = 75)
//    @NotEmpty(message = "Address is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 10, max = 75, message = "Minimum 10 and maximum 75 characters allowed.")
	private String address;
	
	
	@Column(name = "Pincode",nullable = false,length = 6)
//    @NotEmpty(message = "Pincode is required")
//    @Pattern(regexp = "^[0-9]+$", message = "Only Numeric Values are Allowed.")
//    @Size(min = 6, max = 6, message = "Minimum and maximum 6 characters allowed.")
	private int pincode;
	
	
	@Column(name = "City",nullable = false,length = 25)
//    @NotEmpty(message = "City is required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 25, message = "Minimum 1 and maximum 25 characters allowed.")
	private String city;
	
	
	@Column(name = "State",nullable = false,length = 25)
//    @NotEmpty(message = "State is required")
//    @Pattern(regexp = "^[a-zA-Z\\\\s]*$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 1, max = 25, message = "Minimum 1 and maximum 25 characters allowed.")
	private String state;
	
	
	@Column(name = "Country",nullable = false,length = 25)
//    @NotEmpty(message = "Conutry is required")
//    @Pattern(regexp = "^[a-zA-Z\\\\s]*$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 1, max = 25, message = "Minimum 1 and maximum 25 characters allowed.")
	private String country;

	@Column(name = "license Number",nullable = false,length = 25)
//    @NotEmpty(message = "license Number is required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\\\\\s]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 15, max = 25, message = "Minimum 15 and maximum 25 characters allowed.")
	private String license_number;
	
	@Column(name = "Date of birth",nullable = false,length = 15)
//    @NotEmpty(message = "Date of birth is required")
//    @Pattern(regexp = "^\\\\d{4}-\\\\d{2}-\\\\d{2}$", message = "Only  Numeric Values are Allowed.")
//    @Size(min = 10, max = 12, message = "Minimum 10 and maximum 12 characters allowed.")
	private Date dob;
	
	@Column(name = "Adhar Card Number",nullable = false,length = 15)
//    @NotEmpty(message = "Adhar Card Number is required")
//    @Pattern(regexp = "^[0-9 ]+$", message = "Only  Numeric Values are Allowed.")
//    @Size(min = 12, max = 15, message = "Minimum 12 and maximum 15 characters allowed.")
	private String adharNumber;
	
	
	@Column(name = "Seat Number",nullable = false,length = 10)
//    @NotEmpty(message = "Adhar Card Number is required")
//    @Pattern(regexp = "^[0-9 ]+$", message = "Only  Numeric Values are Allowed.")
//    @Size(min = 0, max = 10, message = "Minimum 1 and maximum 10 characters allowed.")
	private int childSeat;
	
	@Column(name = "Start Date",nullable = false,length = 15)
//    @NotEmpty(message = "Start Date is required")
//	@Pattern(regexp = "^\\\\d{4}-\\\\d{2}-\\\\d{2}$", message = "Only  Numeric Values are Allowed.")
//    @Size(min = 10, max = 12, message = "Minimum 10 and maximum 12 characters allowed.")
	private Date startdate;
	
	@Column(name = "End Date",nullable = false,length = 15)
//    @NotEmpty(message = "End Date is required")
//	@Pattern(regexp = "^\\\\d{4}-\\\\d{2}-\\\\d{2}$", message = "Only  Numeric Values are Allowed.")
//    @Size(min = 10, max = 12, message = "Minimum 10 and maximum 12 characters allowed.")
	private Date enddate;
	
	@OneToOne
	@JoinColumn(name = "User_Id")
	private User user;
	
	
	private Integer uid;
	
	
	
}
