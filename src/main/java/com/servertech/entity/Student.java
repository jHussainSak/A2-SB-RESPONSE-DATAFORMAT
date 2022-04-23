package com.servertech.entity;


public class Student {
	
//declaring var
	private int sId;
	private String firstName;
	private String lastName;
	private String email;

//Adding Setter & Getter
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

//Parameterized Constructor 
	public Student(int sId, String firstName, String lastName, String email) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	

	
}//EOC
