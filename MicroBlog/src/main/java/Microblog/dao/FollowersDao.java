package Microblog.dao;

import java.util.List;

import Microblog.model.post;
import Microblog.model.user;
import Microblog.model.followerslist;

public interface FollowersDao {

	void addFollower(user ownerid, user userid);
	
	void deleteFollower(user ownerid, user userid);
	
	void isFollowing(user ownerid, user userid);
	
}
