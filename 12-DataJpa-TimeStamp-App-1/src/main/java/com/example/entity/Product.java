package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	private Integer pId;
	private String pName;
	
	@CreationTimestamp()
	@Column(name = "date_created",updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name = "date_updated", insertable = false)
	private LocalDate dateUpdated;
}
