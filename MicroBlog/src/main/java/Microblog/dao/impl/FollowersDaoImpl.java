package Microblog.dao.impl;

import java.util.*;

import javax.persistence.*;
import javax.transaction.Transactional;

import Microblog.dao.*;
import Microblog.model.*;

public class FollowersDaoImpl implements FollowersDao{
	
	@PersistenceContext
	EntityManager entityManager ;
	
	@Override
	public followerslist addFollower(user ownerid, user userid) {
        if (!this.isFollowing(ownerid, userid)) {
            followerslist followerObject = new followerslist();
            followerObject
                    .setUserId(ownerid)
                    .setFolloweeId(userid);
            entityManager.persist(followerObject);

            return followerObject;
        }

        return null;
    }

	@Override
	public int deleteFollower(user ownerid, user userid) {
        if (this.isFollowing(ownerid, userid)) {
            String hql = "DELETE FROM followerslist "
                    + "WHERE user_id = :user_id "
                    + "AND follower_id = :follower_id";
            Query query = entityManager.createQuery(hql)
                    .setParameter("user_id", ownerid.getUserId())
                    .setParameter("follower_id", userid.getUserId());

            return query.executeUpdate();
        }

        return 0;
    }

	@Override
	public boolean isFollowing(user ownerid, user userid) {
		String hql = "FROM followerslist "
                + "WHERE user_id = :user_id "
                + "AND follower_id = :follower_id";
        Query query = entityManager.createQuery(hql)
                .setParameter("user_id", ownerid.getUserId())
                .setParameter("follower_id", userid.getUserId());
        try {
            UserDao followerFollowee = (UserDao) query.getSingleResult();
            return followerFollowee.getUserId() != null;
        } catch (javax.persistence.NoResultException exception) {
            return false;
        }
		
	}
}