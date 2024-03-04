package com.example.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entities.Librarian;
import com.example.project.Entities.User;
import com.example.project.Repository.UserRepository;

@Service
public class UserService {
	 @Autowired
		UserRepository urepo;
	    
	   
		public User saveUser(User u)
		{
			return urepo.save(u);
		}
		
		public User getUserById(int id)
		{
			 Optional<User> or=urepo.findById(id);
			 User r=null;
			 try
			 {
				 if(or!=null)
				 {
					 r=or.get();
				 }
				  
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return r;
		}
		
		public List<User>viewMembers()
		{
			return urepo.findAll();
		}
		
		public int deleteMember(int id)
		   {
			   return urepo.delete(id);
		   }

		
		
	}


