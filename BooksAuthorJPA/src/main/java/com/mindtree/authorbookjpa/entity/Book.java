package com.mindtree.authorbookjpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	private double price;
	@OneToMany(mappedBy = "book")
	private List<Author> authors;
	
	public Book() {
		
	}
	
	public Book(int bookId, String bookName, double price, List<Author> authors) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.authors = authors;
	}

	public int getId() {
		return bookId;
	}

	public void setId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
}
