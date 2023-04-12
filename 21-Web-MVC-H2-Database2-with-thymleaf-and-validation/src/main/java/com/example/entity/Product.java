package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id 
	@GeneratedValue
	private Integer id;
	
	@NotBlank(message = "name is not Blank")
	@Size(min =3 , max = 15 , message = "Name Should have 3 to 15 character")
	private String  name;
	
	@NotNull(message = "price is not Empty")
	@Positive(message = "price not negative")
	private Double price;
	@NotNull(message = "Quantity is not Empty")
	@Positive(message = "Quantity not negative")
	private Long qunt;
}
