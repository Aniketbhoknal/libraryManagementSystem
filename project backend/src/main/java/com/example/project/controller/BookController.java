package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entities.Book;
import com.example.project.Service.BookService;



public class BookController {

	
	  @Autowired
	    private BookService bservice;
	  
	  @GetMapping("/editBook")
	    public Book EditBook(@RequestParam int id){
	    	return bservice.findBookById(id);
	    }
}
