package com.example.project.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entities.Book;
import com.example.project.Entities.IssuedBook;
import com.example.project.Repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
     BookRepository bookRepository;
    
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
   
    public Book findBookById(int id) {
        Optional<Book> or = bookRepository.findById(id);
        return or.orElse(null);
    }
    
    public Book updateBDetails(Book book) {
    	
    	System.out.println(book);
		Book p=bookRepository.findById(book.getBookId()).get();
			p.setiSBN(book.getiSBN());
			p.setTitle(book.getTitle());
			p.setAuthor(book.getAuthor());
			p.setPrice(book.getPrice());
			p.setGenre(book.getGenre());
			
			return bookRepository.save(p);

    }
    

    
    
    
    


    
  
    
  
}
