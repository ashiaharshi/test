package com.mindtree.authorbookjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.authorbookjpa.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	@Query("Select b from Book b where b.bookName=?1")
	public Optional<Book> findByBookName(String bookName);

}
