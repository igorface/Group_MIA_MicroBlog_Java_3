package Microblog.dao.impl;

import java.util.*;

import javax.persistence.*;

import Microblog.dao.*;
import Microblog.model.*;

public class PostDaoImpl implements PostDao{

	EntityManager entityManager ;
	
	@Override
	public List<post> retriveUserIdPost(user User_id){
		
		Query query = entityManager.createQuery("select post.*, user.* from post, user where " +
				"user.user_id = post.user_id and user.user_id = :id " +
				"order by post.date_added desc");
		List<post> result = query.getResultList();
		return result;
	}
	
	@Override
	public List<post> retriveSpecificUsersPosts(user User_id){
		
		String hql = "select post.*, user.* from post, user where " +
				"user.user_id = post.user_id and user.user_id = :id " +
				"order by post.date_added desc";		
		
		List<post> result = null;
		return result;
	}
	
	@Override
	public List<post> retriveFollowedUsersPosts(user User_id){
		String hql = "select post.*, user.* from post, user where " +
				"user.user_id = post.user_id and user.user_id = :id " +
				"order by post.date_added desc";		
		
		List<post> result = null;
		return result;
		
	}
	
	@Override
	public List<post> retriveAllUsersPosts(user User_id){
		String hql = "select post.*, user.* from post, user where " +
				"user.user_id = post.user_id and user.user_id = :id " +
				"order by post.date_added desc";		
		
		List<post> result = null;
		return result;
		
	}
	
	@Override
	public void createPost(post Post) {
		
	}
	
}
