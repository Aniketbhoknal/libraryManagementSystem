package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Entities.Login;
import com.example.project.POJO.DummyUser;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	@Query("select p from Login p where p.email = :uname and p.password = :pass")
	Login getUserByEmail( String uname,  String pass);


}
