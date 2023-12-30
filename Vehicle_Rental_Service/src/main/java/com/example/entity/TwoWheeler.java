package com.example.entity;

import org.hibernate.annotations.ManyToAny;

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
import jakarta.persistence.Transient;
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
@Table(name = "TwoWheeler_Table")
public class TwoWheeler {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int twowheelereid;
	
	@Column(name = "TwoWheeler name",nullable = false,length = 35)
//    @NotEmpty(message = "Bike Name is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String twowheelerename;
	
	@Column(name = "TwoWheelere Owner name",nullable = false,length = 35)
//    @NotEmpty(message = "TwoWheelere Owner is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String twowheelereOwnername;
	
	@Column(name = "TwoWheeler Registration Number",nullable = false,length = 15)
//    @NotEmpty(message = "Bike Registration Number is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 10, max = 15, message = "Minimum 10 and maximum 15 characters allowed.")
	private String twowheelerregistrationnumber;
	
	@Column(name = "TwoWheeler Color",nullable = false,length = 35)
//    @NotEmpty(message = "bike Color is required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 35, message = "Minimum 1 and maximum 35 characters allowed.")
	private String twowheelercolor;
	
	@Column(name = "TwoWheeler Discription",nullable = false,length = 100)
//    @NotEmpty(message = "Bike Discription required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 100, message = "Minimum 1 and maximum 100 characters allowed.")
	private String twowheelerdiscription;
	
	@Column(name = "TwoWheeler RPH",nullable = false,length = 10)
//    @NotEmpty(message = "Bike RPH required")
//    @Pattern(regexp = "^-?\\\\d+(\\\\.\\\\d+)?$", message = "Only Numeric Values are Allowed.")
//    @Size(min = 1, max = 10, message = "Minimum 1 and maximum 10 characters allowed.")
	private double twowheelerrph; //rph=Rent per Hour
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinTable(name = "twoWheelerCategory_id")
	private TwoWheelerCategory twoWheelerCategory;
	
	@NotNull
	@Transient
	private Integer twowheelercategoryid;
	
}
