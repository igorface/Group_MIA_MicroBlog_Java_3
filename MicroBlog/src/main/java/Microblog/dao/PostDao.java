package Microblog.dao;

import java.util.List;

import MicroBlog.model.post;
import MicroBlog.model.user;
import MicroBlog.model.followerslist;

public interface PostDao {
	List<post> retriveUserIdPost(user User_id);
	
	List<post> retriveSpecificUsersPosts(user User_id);
	
	List<post> retriveFollowedUsersPosts(user User_id);
	
	List<post> retriveAllUsersPosts(user User_id);
	
	void createPost(post Post);
}
