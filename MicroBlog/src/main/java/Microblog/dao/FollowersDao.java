package Microblog.dao;

import Microblog.model.*;

public interface FollowersDao {

	void addFollower(user ownerid, user userid);
	
	int deleteFollower(user ownerid, user userid);
	
	boolean isFollowing(user ownerid, user userid);
	
}
