package com.example.project.Entities;





import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private  int userid;
	
	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	@Column(name="LAST_NAME")
	private String lastname;
	

	public User() {
		super();
		
	}

	@Override
	public String toString() {
		return "User [userId=" + userid + ", firstName=" + firstname + ", LastName=" + lastname + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", password=" + password + ", address=" + address + ", loginId=" + loginId
				+ "]";
	}

	public int getUserId() {
		return userid;
	}

	public void setUserId(int userId) {
		this.userid = userId;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		lastname = lastName;
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

	public Login getLoginId() {
		return loginId;
	}

	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}

	@Column(name="EMAIL")
	private String email;
	
	@Column(name="mobile_no")
    private String  mobileNo;
	
	@Column(name="password")
    private String password;
	
	@Column(name="ADDRESS")
    private String address;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="LOGIN_ID")
	private Login loginId;





	public User(int  string, String firstName, String lastName, String email, String mobileNo, String login,
			String i, Login loginId) {
		super();
		this.userid = string;
		this.firstname = firstName;
		lastname = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = login;
		this.address = i;
		this.loginId = loginId;
	}

	public User( String firstName, String lastName, String email, String mobileNo, String login,
			String address, Login loginId) {
		super();
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = login;
		this.address = address;
		this.loginId = loginId;
	}
	

	
}
