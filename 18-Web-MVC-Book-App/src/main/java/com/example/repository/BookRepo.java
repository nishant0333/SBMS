package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	
	
	
}
