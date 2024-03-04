package com.example.project.Entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="issued_book")
public class IssuedBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int issuedId;
	
	
	
	@Column(name="issue_date")
	 private LocalDateTime issueDate;
	
	@Column(name="return_date") 
	private LocalDateTime returnDate;
	
	 @Column(name="approve_status")
    private int ApproveStatus=0;
	


	    @ManyToOne
	    @JoinColumn(name = "book_id")
	    private Book book;
	    
	    @ManyToOne
	    @JoinColumn(name = "login_id")
	    private Login login;
	    

	public IssuedBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IssuedBook( LocalDateTime issueDate, LocalDateTime returnDate, int approveStatus,
			Book book,Login login) {
		super();
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		ApproveStatus = approveStatus;
		this.book = book;
		this.login=login;
	}

	
	public IssuedBook(LocalDateTime issueDate, int approveStatus,Book book,Login login) {
		super();
		this.issueDate = issueDate;
		ApproveStatus = approveStatus;
		this.book = book;
		this.login=login;
	}

	public int getIssuedId() {
		return issuedId;
	}

	public void setIssuedId(int issuedId) {
		this.issuedId = issuedId;
	}

	public LocalDateTime getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	public int getApproveStatus() {
		return ApproveStatus;
	}

	public void setApproveStatus(int approveStatus) {
		ApproveStatus = approveStatus;
	}


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
	

	}
