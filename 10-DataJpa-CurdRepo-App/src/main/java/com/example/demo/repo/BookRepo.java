package com.example.demo.repo;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

	public List<Book> findByBookName(String bookName);

	public List<Book> findByBookPriceGreaterThan(Double price);

	public List<Book> findByBookPriceLessThan(Double price);

	@Query("from Book")
	public List<Book> m1();

	@Query(value = "Select * from book", nativeQuery = true)
	public List<Book> m2();

	@Query(value = "select * from book where book_price=125", nativeQuery = true)
	public List<Book> m3();
	
	
	@Query("select bookName from Book")
	public List<String> m4();
	
	
	@Query(value = "select book_name from book",nativeQuery = true)
	public List<String> m5();
	
	
	
}