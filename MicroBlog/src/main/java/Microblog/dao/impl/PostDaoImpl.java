package Microblog.dao.impl;

import java.util.*;

import javax.persistence.*;

import Microblog.dao.*;
import Microblog.model.*;

public class PostDaoImpl implements PostDao{

	EntityManager entityManager ;
	
	@Override
	public List<post> retriveUserIdPost(user User){
		String hql = "select post.*, user.* from post, user where " +
				"user.user_id = post.user_id and user.user_id = :user_id " +  
				"order by post.date_added desc";
		Query query = entityManager.createQuery(hql);
		query.setParameter("user_id", User.user_id);
		List<post> result = query.getResultList();
		return result;
	}

	@Override
	public List<post> retriveFollowedUsersPosts(user User){
		String hql = "select post.*, user.* from post, user " +
				"where post.user_id = user.user_id and ( " +
				"user.user_id = :user_id or " +
				"user.user_id in (select user_id from followerslist " +
                                    "where follower_id = :user_id))" +
                "order by post.date_added desc";
		Query query = entityManager.createQuery(hql);
		query.setParameter("user_id", User.user_id);
		List<post> result = query.getResultList();
		return result;
	}

	@Override
	public List<post> retriveAllUsersPosts(user User){
		String hql = "select post.*, user.* from post, user " +
				"order by post.date_added desc";		
		Query query = entityManager.createQuery(hql);
		List<post> result = query.getResultList();
		return result;
	}
	
	@Override
	public void createPost(user User, post Post) {
		String hql = "insert into post (post_id, user_id, text, date_added) values ( :user_id , :text , :date)";
		Query query = entityManager.createQuery(hql);
		query.setParameter("user_id", User.user_id);
		query.setParameter("text", Post.text);
		query.setParameter("date", Post.date_added);
		query.executeUpdate();
	}
	
}
