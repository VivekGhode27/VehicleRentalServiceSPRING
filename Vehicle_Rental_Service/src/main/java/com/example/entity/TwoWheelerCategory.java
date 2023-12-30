package com.example.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Component
@Table(name = "TwoWheelerCategory_Table")
public class TwoWheelerCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int twowheelercategoryid;
	
	@Column(name = "TwoWheeler category name",nullable = false,length = 35)
//    @NotEmpty(message = "Bike category Name is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String twowheelercategoryname;

	@Column(name = "TwoWheeler category Discription",nullable = false,length = 100)
//    @NotEmpty(message = "Bike category Discription required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 100, message = "Minimum 1 and maximum 100 characters allowed.")
	private String twowheelercategorydescription;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "twoWheelerCategory",fetch = FetchType.EAGER)
	@JsonIgnore
	private List<TwoWheeler> twoWheeler;
}
