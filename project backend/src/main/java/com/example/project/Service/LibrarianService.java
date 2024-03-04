package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entities.Librarian;
import com.example.project.Entities.User;
import com.example.project.Repository.LibrarianRepository;

@Service
public class LibrarianService {
	
   @Autowired
   LibrarianRepository Lrepo;
   
   public Librarian saveLibrarian(Librarian li)
	{
		return Lrepo.save(li);
	}
   
	/*
	 * public List<Librarian>getAllLibrarian() { return Lrepo.findAll(); }
	 */
   
   public List<Librarian>viewLibrarian()
   {
	   return Lrepo.findAll();
   }
   
//   public int deleteLibrarian(int id)
//   {
//	   try {
//		   
//		    Lrepo.deleteById(id);
//		    return 1;
//		    
//	   }
//	   catch(Exception e)
//	   {
//		   return 0;
//	   }
//   }
   
   public int deleteLibrarian(int id)
   {
	   return Lrepo.deleteLibraraian(id);
   }
   
   
   

   
}