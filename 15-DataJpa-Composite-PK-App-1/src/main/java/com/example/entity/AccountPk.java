package com.example.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable {

	
	private Double accNum;
	
	private String accType;
}
