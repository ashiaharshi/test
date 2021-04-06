package com.mindtree.authorbookjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.authorbookjpa.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {


}
