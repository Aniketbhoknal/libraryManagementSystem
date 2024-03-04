package com.example.project.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ROLES")
public class Roles {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roll_id")
	private int roll_id;
	
	@Column(name="ROLL_NAME")
	private String rollName;
	
	public Roles(int roll_id, String rollName) {
		super();
		this.roll_id = roll_id;
		this.rollName = rollName;
	}

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Roles [rollId=" + roll_id + ", rollName=" + rollName + "]";
	}

	

	public int getRoll_id() {
		return roll_id;
	}

	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	
	
	

}
