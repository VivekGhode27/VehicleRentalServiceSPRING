package com.example.entity;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.entity.FourWheeler;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "FourWheelerCategory_Table")
@Component
public class FourWheelerCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fourwheelercategoryid;
	
	@Column(name = "FourWheeler category name",nullable = false,length = 35)
//    @NotEmpty(message = "Car category Name is required")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 3, max = 35, message = "Minimum 3 and maximum 35 characters allowed.")
	private String fourwheelercategoryname;
	
	@Column(name = "FourWheeler category Discription",nullable = false,length = 100)
//    @NotEmpty(message = "Car category Discription required")
//    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//    @Size(min = 1, max = 100, message = "Minimum 1 and maximum 100 characters allowed.")
	private String fourwheelercategorydescription;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "fourWheelerCategory", fetch = FetchType.EAGER)
	@JsonIgnore 
	private List<FourWheeler> fourWheeler;
}
