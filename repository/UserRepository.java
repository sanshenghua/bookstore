package com.seven.bookstore.repository;

import com.seven.bookstore.domain.Book;
import com.seven.bookstore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Book,Integer> {

}
