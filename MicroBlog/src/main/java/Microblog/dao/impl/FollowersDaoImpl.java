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
	public void addFollower(user ownerid, user userid) {
        if (!this.isFollowing(ownerid, userid)) {
            String hql = "insert into followerslist (user_id, follower_id) values ( :owner_id , :user_id)";
            Query query = entityManager.createQuery(hql);
            query.setParameter("owner_id", ownerid.user_id);
            query.setParameter("user_id", userid.user_id);
            query.executeUpdate();
        }
    }

	@Override
	public int deleteFollower(user ownerid, user userid) {
        if (this.isFollowing(ownerid, userid)) {
            String hql = "DELETE FROM followerslist "
                    + "WHERE user_id = :user_id "
                    + "AND follower_id = :follower_id";
            Query query = entityManager.createQuery(hql)
                    .setParameter("user_id", ownerid.user_id)
                    .setParameter("follower_id", userid.user_id);

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
                .setParameter("user_id", ownerid.user_id)
                .setParameter("follower_id", userid.user_id);
        try {
            UserDao followerFollowee = (UserDao) query.getSingleResult();
            return followerFollowee != null;
        } catch (javax.persistence.NoResultException exception) {
            return false;
        }
		
	}
}