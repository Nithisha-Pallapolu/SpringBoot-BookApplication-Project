package com.springbootbook.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootbook.application.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
