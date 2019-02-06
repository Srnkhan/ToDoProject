package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String User;
	
	public String getUser() {
		return User;
	}
	
	public void setUser(String user) {
		this.User = user;
	}
	
	@Override
	public String toString() {
		return String.format("Id " + id + " User " + User);
	}
}
