package com;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterBean {
Integer id;
@Size(min=1, max=15, message="Your name should be between 1 - 15 characters.")
String name;

String city;
@Pattern(regexp=".+@.+\\..+", message="Wrong email!")
String email;
@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String mobileno;
@Column
@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String password;
@Column
@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String cpassword;


public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String  getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public Integer getId() {
	return id;
}

}
