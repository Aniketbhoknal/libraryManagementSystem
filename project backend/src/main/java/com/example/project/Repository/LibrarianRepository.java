package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Entities.Librarian;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer>{
	 
	
	@Modifying
	@Query("delete from Librarian l where librarian_id=:id")
	public int deleteLibraraian(int id);
}
