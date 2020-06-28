package Microblog.dao.impl;

import Microblog.dao.FollowersDao;
import Microblog.model.user;

public class FollowersDaoImpl implements FollowersDao{

	@Override
	public void addFollower(user ownerid, user userid) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("follower", follower.getId());
        params.put("followee", followee.getId());
        
		String sql = "insert into follower (follower_id, followee_id) values (:follower, :followee)";
		
        template.update(sql,  params);
	
	
	
	void addFollower(user ownerid, user userid);
	
	void deleteFollower(user ownerid, user userid);
	
	void isFollowing(user ownerid, user userid);
	
	
}
