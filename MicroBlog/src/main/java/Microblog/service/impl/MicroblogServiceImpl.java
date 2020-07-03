package Microblog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Microblog.dao.*;
import Microblog.model.*;
import Microblog.service.MicroblogService;


@Service
public class MicroblogServiceImpl implements MicroblogService {
	
	@Autowired
	UserDao userDAO;
	
	@Autowired
	PostDao postDAO;
	
	@Autowired
	FollowersDao followersDAO;

	
	@Override
	public List<post> retriveUserIdPost(user User) {
		return PostDao.retriveUserIdPost(User);
	}

	@Override
	public List<post> retriveFollowedUsersPosts(user User) {
		// TODO 
	}

	@Override
	public List<post> retriveAllUsersPosts(user User) {
		// TODO 
	}

	@Override
	public followerslist addFollower(user ownerid, user userid) {
		// TODO 
	}

	@Override
	public int deleteFollower(user ownerid, user userid) {
		// TODO 
	}

	@Override
	public boolean isFollowing(user ownerid, user userid) {
		// TODO 
	}

	@Override
	public user getUserByLogin(String username) {
		// TODO 
	}

	@Override
	public void registerNewUser(user newuser) {
		// TODO 
		
	}
	
}