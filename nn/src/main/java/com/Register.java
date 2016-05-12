package com;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table
public class Register {

    @Id
    Integer id;
    @Column
    //@Size(min=5, max=10, message="Your name should be between 5 - 10 characters.")
    String name;
    @Column
    //@Size(min=5, max=10, message="Your name should be between 5 - 10 characters.")
	String city;
    @Column
    String mobileno;
    @Column 
    //@Pattern(regexp=".+@.+\\..+", message="Wrong email!")
    String email;
    
   
	public Register()
	{
		
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
