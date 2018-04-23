package com.seven.bookstore.controller;


import com.seven.bookstore.domain.Response;
import com.seven.bookstore.repository.UserRepository;
import com.seven.bookstore.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.seven.bookstore.domain.Book;

@RestController
@RequestMapping(value = "/book")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping( "/{index}")
   public Response find(@PathVariable("index") Integer index){
       Book book = userRepository.findById(index).get();
return ResponseWrapper.success(book);


    }
}
