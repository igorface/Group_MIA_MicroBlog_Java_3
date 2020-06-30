package Microblog.dao;

import java.util.List;

import Microblog.model.post;
import Microblog.model.user;
import Microblog.model.followerslist;

public interface FollowersDao {

	followerslist addFollower(user ownerid, user userid);
	
	int deleteFollower(user ownerid, user userid);
	
	boolean isFollowing(user ownerid, user userid);
	
}
