package Microblog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Microblog.dao.*;
import Microblog.dao.impl.PostDaoImpl;
import Microblog.model.*;
import Microblog.service.MicroblogService;


@Service
public class MicroblogServiceImpl implements MicroblogService {
	
	@Autowired
	UserDao userDAO;
	
	@Autowired
	PostDaoImpl postDAO;
	
	@Autowired
	FollowersDao followersDAO;

	
	@Override
	public List<post> retriveUserIdPost(user User) {
		return postDAO.retriveUserIdPost(User);
	}

	@Override
	public List<post> retriveFollowedUsersPosts(user User) {
		return postDAO.retriveFollowedUsersPosts(User);
	}

	@Override
	public List<post> retriveAllUsersPosts(user User) {
		return postDAO.retriveAllUsersPosts(User);
	}

	@Override
	public followerslist addFollower(user ownerid, user userid) {
		return followersDAO.addFollower(ownerid, userid);	
	}

	@Override
	public int deleteFollower(user ownerid, user userid) {
		return followersDAO.deleteFollower(ownerid, userid);
	}

	@Override
	public boolean isFollowing(user ownerid, user userid) {
		return followersDAO.isFollowing(ownerid, userid);
	}

	@Override
	public user getUserByLogin(String username) {
		return userDAO.getUserByLogin(username);
	}

	@Override
	public void registerNewUser(user newuser) {
		userDAO.registerNewUser(newuser);
		
	}
	
}