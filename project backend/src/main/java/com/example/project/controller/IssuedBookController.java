package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entities.Book;
import com.example.project.Entities.DummyRequest;
import com.example.project.Entities.IssuedBook;
import com.example.project.Entities.Login;
import com.example.project.Entities.User;
import com.example.project.Service.BookService;
import com.example.project.Service.IssuedBookService;
import com.example.project.Service.LoginService;
import com.example.project.Service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class IssuedBookController {
	  @Autowired
	    private IssuedBookService is;
	  
	  @Autowired
		private UserService us;
	  
	  @Autowired
	    private BookService bs;
	  
	  @Autowired
	    private LoginService ls;
	  
	  @PostMapping("/addBookRequest")
	    public IssuedBook addRequest(@RequestBody DummyRequest dr)
	    {
	    	
	    	Book b = bs.findBookById(dr.getBookId());
	    	Login l=ls.findLoginById(dr.getLoginId());
            IssuedBook i = new IssuedBook(dr.getIssueDate(), dr.getApproveStatus(), b,l);
	    	i.setReturnDate(dr.getIssueDate().plusDays(10));
	    	return is.saveBookDetails(i);
	    	 
	    }
}
