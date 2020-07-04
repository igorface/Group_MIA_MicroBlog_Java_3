package Microblog.dao;

import Microblog.model.*;

public interface UserDao {
	
	user getUserByLogin(String username);
	
	void registerNewUser(user newuser);
	
}
