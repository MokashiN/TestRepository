package com.niit.controller;
import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterBean 
{
Integer id;

@Size(min=1, max=15, message="Your name should be between 1 - 15 characters.")
String name;

@Size(min=1, max=15, message="Your surname should be between 1 - 15 characters.")
String surname;

@Pattern(regexp=".+@.+\\..+", message="Wrong reemail!")
String emailid;

@Pattern(regexp=".+@.+\\..+", message="Wrong reemail!")
String reemailid;

@Column
@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String password;

@Column
@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String cpassword;

@Size(min=5, max=10, message="Your no should be between 5 - 10 characters.")
String mobileno;


public void setId(Integer id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public String getPassword() 
{
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void setName(String name) {
	this.name = name;
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

public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getReemailid() {
	return reemailid;
}
public void setReemailid(String reemailid) {
	this.reemailid = reemailid;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

}
