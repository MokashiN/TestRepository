package com.niit.controller;

import java.util.List;

import com.niit.controller.Blog;

public interface BlogService {
	public List<Blog> getList();
	public void addBlog(Blog b);
	public void approveBlog(Blog m);
	public void deleteBlog(int blogid);
	public Blog getBlogbyId(int blogid);
	public List<Blog> getListApprove();
}
