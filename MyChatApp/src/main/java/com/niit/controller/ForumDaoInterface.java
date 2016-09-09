package com.niit.controller;

import java.util.*;
import com.niit.controller.*;
	
public interface ForumDaoInterface
{
	public List<Forum> getList();
	public void createNewForum(Forum f);
	public List<Forum> getForumList(String UserName);
	public void delete(int fid);
	public void deleteForum(int forumid);
	public List<Forum> getForum();
	public Forum getForumbyId(int forumid);
}
