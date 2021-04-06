package com.mindtree.authorbookjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.authorbookjpa.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	@Query("Select a from Author a where a.book.bookName=?1")
	List<Author> findByBookName(String bookName);


}
