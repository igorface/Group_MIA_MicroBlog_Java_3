package Microblog.dao;

import java.util.List;

import Microblog.model.*;

public interface PostDao {
	List<post> retriveUserIdPost(user User);
	
	List<post> retriveFollowedUsersPosts(user User);
	
	List<post> retriveAllUsersPosts(user User);
	
	void createPost(user User, post Post);
}
