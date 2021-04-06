package com.mindtree.authorbookjpa.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
@Data
public class AuthorDto {
	
	private int authorId;
	@NotEmpty(message = "Author Name cannot be null")
	private String authorName;
	//private Book book;
	
	public AuthorDto() {
		
	}
	
	public AuthorDto(int authorId,String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
}
