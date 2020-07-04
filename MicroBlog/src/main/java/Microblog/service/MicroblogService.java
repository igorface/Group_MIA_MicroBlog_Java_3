package Microblog.service;

import java.util.List;
import Microblog.model.*;

public interface MicroblogService {
	
	/** 
	* Download all messages published by a specific user and all messages
	* from other users I follow
	* 
	* @param XXX
	* @return 
	*/
	
	//posts
	List<post> retriveUserIdPost(user User);
	
	List<post> retriveFollowedUsersPosts(user User);
	
	List<post> retriveAllUsersPosts(user User);
	
	//followers
	followerslist addFollower(user ownerid, user userid);
	
	int deleteFollower(user ownerid, user userid);
	
	boolean isFollowing(user ownerid, user userid);
	
	
	//user
	user getUserByLogin(String username);
	
	void registerNewUser(user newuser);
	
}
