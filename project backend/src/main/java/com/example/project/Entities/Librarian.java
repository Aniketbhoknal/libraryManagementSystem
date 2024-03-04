package com.example.project.Entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "librarian")
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="librarian_id")
    private int librarian_id;
    

    @OneToOne
    @Cascade(value = CascadeType.ALL)
    @JoinColumn(name = "LOGIN_ID")
    private Login loginId;

    @Column(name = "aadhar_id")
    private String aadhar_id;

    @Column(name = "educational_qualification")
    private String educational_qualification;
    
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_no")
    private String mobileNo;
    
    @Column(name = "password")
    private String password;
    
    private String email;

	public Librarian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Librarian(  String aadhar_id, String educational_qualification,
			String firstname, String lastname, String address, String mobileNo, String password,String email,Login loginId) {
		super();
		this.loginId = loginId;
		this.aadhar_id = aadhar_id;
		this.educational_qualification = educational_qualification;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobileNo = mobileNo;
		this.password = password;
		this.email=email;
	}

	public int getLibrarian_id() {
		return librarian_id;
	}

	public void setLibrarian_id(int librarian_id) {
		this.librarian_id = librarian_id;
	}

	public Login getLoginId() {
		return loginId;
	}

	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}

	public String getAadhar_id() {
		return aadhar_id;
	}

	public void setAadhar_id(String aadhar_id) {
		this.aadhar_id = aadhar_id;
	}

	public String getEducational_qualification() {
		return educational_qualification;
	}

	public void setEducational_qualification(String educational_qualification) {
		this.educational_qualification = educational_qualification;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
    
    
    
    

}