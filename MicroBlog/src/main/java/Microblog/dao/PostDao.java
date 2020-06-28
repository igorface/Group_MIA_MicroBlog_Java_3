package Microblog.dao;

import java.util.List;

import Microblog.model.post;
import Microblog.model.user;
import Microblog.model.followerslist;

public interface PostDao {
	List<post> retriveUserIdPost(user User_id);
	
	List<post> retriveSpecificUsersPosts(user User_id);
	
	List<post> retriveFollowedUsersPosts(user User_id);
	
	List<post> retriveAllUsersPosts(user User_id);
	
	void createPost(post Post);
}
