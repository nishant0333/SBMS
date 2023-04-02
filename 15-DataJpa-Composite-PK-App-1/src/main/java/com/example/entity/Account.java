package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Account_tbl")
public class Account {

	
	private String holderName;
	private String branch;
	
	
	@EmbeddedId
	private AccountPk accountPk;
	
}
