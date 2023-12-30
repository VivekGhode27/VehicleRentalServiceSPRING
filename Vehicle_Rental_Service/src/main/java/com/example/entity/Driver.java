package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver_table")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverid;
	
	@Column(name = "Driver First name",nullable = false,length = 35)
    @NotEmpty(message = "Driver First Name is required")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only Alphabets Values are Allowed.")
    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
	private String driverfname;
	
	@Column(name = "Driver last name",nullable = false,length = 35)
    @NotEmpty(message = " driver last Name is required")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only Alphabets Values are Allowed.")
    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
	private String driverlname;
	
	@Column(name = "Driver age",nullable = false,length = 3)
	@NotEmpty(message = "Driver Age is required")
	@Pattern(regexp = "^[0-9]+$", message = "Only Numeric Values are Allowed.")
	@Size(min = 1, max = 3, message = "Minimum 1 and maximum 3 characters allowed.")
	private int driverage;
	
	
	@NotEmpty(message = "Driver Contact is required")
    @Pattern(regexp = "^\\+(?:91)?[0-9]{10}$", message = "Only Alphabets Values are Allowed.")
    @Size(min = 10, max = 15, message = "Minimum 10  and maximum 15 characters allowed.") 
    @Column(name = "Driver Contact",nullable = false,length = 15)
	private String drivercontact;
	
	@Column(name = "Driver Gender",nullable = false,length = 10)
    @NotEmpty(message = "Driver Gender is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only Alphabets Values are Allowed.")
    @Size(min = 3, max = 10, message = "Minimum 3 and maximum 10 characters allowed.")
	private String drivergender;
	
	@NotEmpty(message = "Driver Eamil is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Only email is Allowed.")
    @Size(min = 6, max = 50, message = "Minimum 6 and maximum 50 characters allowed.")
    @Column(name = "Driver Email",nullable = false,length = 50)
	private String driveremail;
	
	
	@Column(name = "Driver Address",nullable = false,length = 75)
    @NotEmpty(message = "Driver Address is required")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
    @Size(min = 10, max = 75, message = "Minimum 10 and maximum 75 characters allowed.")
	private String driveraddress;
	
	
	@Column(name = "Driver license Number",nullable = false,length = 25)
    @NotEmpty(message = "Driver license Number is required")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\\\\\s]+$", message = "Only Alphabets and Numeric Values are Allowed.")
    @Size(min = 15, max = 25, message = "Minimum 15 and maximum 25 characters allowed.")
	private String driverlicensenumber;
	
	
	@Column(name = "Driver Adhar Card Number",nullable = false,length = 15)
    @NotEmpty(message = "Driver Adhar Card Number is required")
    @Pattern(regexp = "^[0-9 ]+$", message = "Only  Numeric Values are Allowed.")
    @Size(min = 12, max = 15, message = "Minimum 12 and maximum 15 characters allowed.")
	private String driveradharcardnumber;
}
