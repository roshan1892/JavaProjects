package com.roshan.empl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddEmployee {
   
	private String firstname;
	private String lastname;
	@Id
	private String email;
	private String address;
	private int age;
	private String phone;


	public AddEmployee() {
		
	}
	
	public AddEmployee(String firstname, String lastname, String email, String address, int age, String phone)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.age = age;
		this.phone = phone;
	}

	


	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public AddEmployee(String firstname) {
		super();
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "AddEmployee [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", address="
				+ address + ", age=" + age + ", phone=" + phone + "]";
	}



	
	
	
}
