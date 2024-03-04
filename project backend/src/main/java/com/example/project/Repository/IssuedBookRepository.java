package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Entities.IssuedBook;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer> {
	 @Modifying
	 @Query(value = "UPDATE issued_book SET approve_status = 1 WHERE book_id =:bookId AND login_id =:loginId", nativeQuery = true)
	    public int AllowUser(int bookId, int loginId);
}
