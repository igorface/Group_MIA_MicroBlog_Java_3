package MB.dao;

import java.util.List;

import MicroBlog.model.post;
import MicroBlog.model.user;
import MicroBlog.model.followerslist;

public interface UserDao {
	
	user getUserByLogin(String username);
	
	void registerNewUser(user newuser);
	
}
