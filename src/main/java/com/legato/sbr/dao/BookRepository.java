package com.legato.sbr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.legato.sbr.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
