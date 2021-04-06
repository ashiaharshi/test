package com.mindtree.authorbookjpa.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class BookDto {
	
	private int bookId;
	@NotNull
	@Size(min = 3, message = "Book Name should have atleast 3 letters")
	private String bookName;
	@NotNull
	@Positive(message = "Enter valid Price")
	private double price;
	
	public BookDto() {
		
	}
	
	public BookDto(int bookId,String bookName, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
}
