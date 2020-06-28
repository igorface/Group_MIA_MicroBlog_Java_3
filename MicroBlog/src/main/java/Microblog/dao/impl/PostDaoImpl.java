package Microblog.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import Microblog.dao.PostDao;
import Microblog.model.post;
import Microblog.model.user;

@Repository
public class PostDaoImpl implements PostDao{

	@Override
	List<post> retriveUserIdPost(user User_id){
		
		
		String sql = "select posts.*, users.* from posts, users where " +
				"users.userid = posts.userid and users.userid = :id " +
				"order by message.pub_date desc";		
	}
	
	@Override
	List<post> retriveSpecificUsersPosts(user User_id){
		
	}
	
	@Override
	List<post> retriveFollowedUsersPosts(user User_id){
		
	}
	
	@Override
	List<post> retriveAllUsersPosts(user User_id){
		
	}
	
	@Override
	void createPost(post Post) {
		
	}
	
}
