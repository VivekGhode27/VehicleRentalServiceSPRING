package com.example.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "FourWheeler_Table")
@Component
public class FourWheeler {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int fourwheelerid;
	
	@Column(name = "FourWheeler name",nullable = false,length = 35)
//    @NotEmpty(message = "Car Name is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String fourwheelename;
	
	
	@Column(name = "FourWheeler Owner name",nullable = false,length = 35)
//    @NotEmpty(message = "FourWheeler Owner is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String fourwheeleOwnername;
	
	@Column(name = "FourWheeler Registration Number",nullable = false,length = 15)
//    @NotEmpty(message = "Car Registration Number is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 10, max = 15, message = "Minimum 10 and maximum 15 characters allowed.")
	private String fourwheeleregistrationnumber;
	
	@Column(name = "FourWheeler Color",nullable = false,length = 35)
//    @NotEmpty(message = "Car Color is required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
	private String fourwheelecolor;
	
	@Column(name = "FourWheeler Gear Type",nullable = false,length = 15)
//    @NotEmpty(message = "Car Gear Type required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 15, message = "Minimum 1 and maximum 15 characters allowed.")
	private String fourwheelegeartype;
	
	@Column(name = "FourWheeler Fuel Type",nullable = false,length = 15)
//    @NotEmpty(message = "Car Fuel Type required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 15, message = "Minimum 1 and maximum 15 characters allowed.")
	private String fourwheelefueltype;
	
	@Column(name = "Car Discription",nullable = false,length = 100)
//    @NotEmpty(message = "Car Discription required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 100, message = "Minimum 1 and maximum 100 characters allowed.")
	private String fourwheelediscription;
	
	
	@Column(name = "Car RPH",nullable = false,length = 10)
//    @NotEmpty(message = "Car RPH required")
//    @Pattern(regexp = "^-?\\\\d+(\\\\.\\\\d+)?$", message = "Only Numeric Values are Allowed.")
//    @Size(min = 1, max = 10, message = "Minimum 1 and maximum 10 characters allowed.")
	private double carrph; //rph=Rent per Hour
	
	
	//many FourWheeler Can have one Category
	@ManyToOne(cascade = CascadeType.ALL,fetch =  FetchType.EAGER)
	//@JoinTable(name = "fourWheelerCategory_id")
	private FourWheelerCategory fourWheelerCategory;
	
	//@NotNull(message = )
	private Integer fourwheelercategoryid;
	
	
}
