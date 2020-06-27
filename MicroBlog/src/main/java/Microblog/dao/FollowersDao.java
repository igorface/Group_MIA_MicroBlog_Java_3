package Microblog.dao;

import java.util.List;

import MicroBlog.model.post;
import MicroBlog.model.user;
import MicroBlog.model.followerslist;

public interface FollowersDao {

	void addFollower(user ownerid, user userid);
	
	void deleteFollower(user ownerid, user userid);
	
	void isFollowing(user ownerid, user userid);
	
}
