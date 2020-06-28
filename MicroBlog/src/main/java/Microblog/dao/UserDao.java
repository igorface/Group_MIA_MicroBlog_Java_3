package Microblog.dao;

import java.util.List;

import Microblog.model.post;
import Microblog.model.user;
import Microblog.model.followerslist;

public interface UserDao {
	
	user getUserByLogin(String username);
	
	void registerNewUser(user newuser);
	
}
