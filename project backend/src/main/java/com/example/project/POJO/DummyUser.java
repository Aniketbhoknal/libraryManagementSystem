package com.example.project.POJO;

import org.springframework.stereotype.Component;

import com.example.project.Entities.Login;



public class DummyUser {
	
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNo;
	private String password;
	private String address;
	private String aadhar_id;
	private String educational_qualification;
	int roll_id;
	


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

	public DummyUser() {
		super();
		// TODO Auto-generated constructor stub
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getRoll_id() {
		return roll_id;
	}


	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}


	public DummyUser(String firstname, String lastname, String email, String mobileNo, String password, String address,
			int roll_id,String aadhar_id, String educational_qualification) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
		this.address = address;
		this.roll_id = roll_id;
		this.aadhar_id = aadhar_id;
		this.educational_qualification = educational_qualification;
	}

}
