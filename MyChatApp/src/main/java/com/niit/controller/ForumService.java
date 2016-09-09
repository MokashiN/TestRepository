package com.niit.controller;

import java.util.*;
import com.niit.controller.*;

public interface ForumService
{
	public List<Forum> getList();
	
	public void createNewForum(Forum f);

	public List<Forum> getForumList(String UserName);

	public void delete(int fid);

	public List<Forum> getForum();
	
	public void deleteForum(int forumid);

	public Forum getForumbyId(int forumid);
}
