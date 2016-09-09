package com.niit.controller;

import java.util.List;

import com.niit.controller.*;;


public interface UserDao {

	public List<UserLogin> getList();
	public void addUser(UserLogin p);
	public void updateUser(UserLogin p);
	public void deleteUser(int userid);
	public UserLogin getUserbyId(int userid);

	
}
