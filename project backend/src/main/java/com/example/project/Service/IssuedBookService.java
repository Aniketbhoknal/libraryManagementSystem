package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entities.IssuedBook;
import com.example.project.Entities.User;
import com.example.project.Repository.IssuedBookRepository;

@Service
public class IssuedBookService {

	@Autowired
	IssuedBookRepository Issrepo;
	
	public int BookStatus(int userId,int bookId) {
		System.out.println(bookId);
		System.out.println(userId);
		
		return Issrepo.AllowUser(bookId,userId);
	}
	
	public IssuedBook askForIssue(IssuedBook ib) {
		return Issrepo.save(ib);
	}
	
    public List<IssuedBook>GetAllInfo()
    {
    	return Issrepo.findAll();
    }
    
	public IssuedBook saveBookDetails(IssuedBook u)
	{
		return Issrepo.save(u);
	}
}
