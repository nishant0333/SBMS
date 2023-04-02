package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		BookRepo bookRepo = ctx.getBean(BookRepo.class);

//		Book book1 =new Book();
//		book1.setBookId(103);
//		book1.setBookName("zyx");
//		book1.setBookPrice(125.00);
//		
//
//		Book book2 =new Book();
//		book2.setBookId(105);
//		book2.setBookName("xyzq");
//		book2.setBookPrice(127.00);
//		
//		bookRepo.saveAll(Arrays.asList(book1,book2));
//		System.out.println("Books save");

//		Book book2 = bookRepo.findById(101).get();
//		System.out.println(book2);

//		System.out.println(bookRepo.existsById(101));

//		System.out.println(bookRepo.count());

//		Optional<Book> findById = bookRepo.findById(107);

//		System.out.println(findById.get());

//		if(findById.isPresent()) {
//			System.out.println(findById.get());
//		}else {
//			System.out.println("resource not found");
//		}

//		Iterable<Book> findAllById = bookRepo.findAllById(Arrays.asList(101, 102, 103));
//
//		for (Book b : findAllById) {
//			System.out.println(b);
//		}

//		Iterable<Book> findAll = bookRepo.findAll();
//		
//		for(Book b1 :findAll) {
//			System.out.println(b1);
//		}
//		bookRepo.deleteById(105);

//		Book book = new Book(101,"abc",123.00);

//		bookRepo.delete(book);

//		bookRepo.deleteAllById(Arrays.asList(102,103));

//		Book book = new Book(101,"abc",123.00);
//		Book book1 = new Book(104,"xyz",126.00);

//		bookRepo.deleteAll(Arrays.asList(book,book1));

//		bookRepo.deleteAll();

//		List<Book> book = bookRepo.findByBookName("zyx");
//		
//		for(Book b:book) {
//			System.out.println(b);
//			
//		}

//		List<Book> book = bookRepo.findByBookPriceGreaterThan(124.00);
//		for(Book b:book) {
//			System.out.println(b);
//			
//		}

//		List<Book> book = bookRepo.findByBookPriceLessThan(130.00);
//		
//		System.out.println(book);

//		List<Book> books = bookRepo.m1();
//		
//		for (Book book : books) {
//			System.out.println(book);
//		}

//		List<Book> books = bookRepo.m2();
//		
//		for (Book book : books) {
//			System.out.println(book);
//		}

//		List<Book> books = bookRepo.m3();
//
//		for (Book book : books) {
//			System.out.println(book);
//		}

//		List<String> books = bookRepo.m4();
//
//		for (String book : books) {
//			System.out.println(book);
//		}
		
//		List<String> books = bookRepo.m5();
//
//		for (String book : books) {
//			System.out.println(book);
//		}
		
		

	}

}