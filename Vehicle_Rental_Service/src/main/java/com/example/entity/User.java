package com.example.entity;

import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User_Table")
@Entity
public class User {
    @Id
    @Column(name = "User_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    
    //@Column(name = "First name",length = 35)
//    @NotEmpty(message = "First Name is required")
//    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
//    @Column(name = "First name",length = 35)
//	@Size(min = 2, max = 20, message = "Please Enter proper name")
//	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accept only alphabets")
    private String fname;
    
    //@Column(name = "UserName",nullable = false)
//    @Column(name = "UserName")//"^[a-zA-Z]*$\\d"
//    @Size(min = 2, max = 20, message = "Please Enter proper username")
//   	@Pattern(regexp = "^[a-zA-Z]*$\\d", message = "Accept only alphabets and num")
    private String username;
    
    //@Column(name = "Last name",nullable = false,length = 35)
//    @NotEmpty(message = "Last Name is required")
//    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
//    @Column(name = "Last name",length = 35) 
//    @Size(min = 2, max = 20, message = "Please Enter proper name")
//	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accept only alphabets")
    private String lname;
	
    
    @NotEmpty(message = "Eamil is required")
//    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Only email is Allowed.")
//    @Size(min = 6, max = 50, message = "Minimum 6 and maximum 50 characters allowed.")
//    @Column(name = "User Email",nullable = false,length = 50)
    private String uemail;
	
    @NotEmpty(message = "Contact is required")
//    @Pattern(regexp = "^\\+(?:91)?[0-9]{10}$", message = "Only Alphabets Values are Allowed.")
//    @Size(min = 10, max = 15, message = "Minimum 10  and maximum 15 characters allowed.") 
//    @Column(name = "User Contact",nullable = false,length = 15)
    private String contact;
	
    @Column(name = "password")
	//@Length(min = 5, message = "*Your password must have at least 5 characters")
//	@NotEmpty(message = "*Please provide your password")
	private String password;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
    
    @OneToOne(mappedBy = "user")
    @JsonIgnore
	private Booking booking;
//    
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Review>  review;
 	

}
