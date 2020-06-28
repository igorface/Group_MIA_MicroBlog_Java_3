package Microblog.dao.impl;

import Microblog.dao.FollowersDao;
import Microblog.model.user;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class FollowersDaoImpl implements FollowersDao{

	private NamedParameterJdbcTemplate template;
	@Override
	public void addFollower(user ownerid, user userid) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("follower", ownerid.getId());
        params.put("followee", userid.getId());
        
		String hql = "insert into followerslist (follower_id, user_id) values (:ownerid, :userid)";
		
        template.update(hql,  params);

    @Override
	public void deleteFollower(user ownerid, user userid) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("follower", ownerid.getId());
        params.put("followee", userid.getId());
        
		String hql = "delete from followerslist (follower_id, user_id) values (:ownerid, :userid)";
		
        template.update(hql,  params);


    @Override
	public void addFollower(user ownerid, user userid) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("follower", ownerid.getId());
        params.put("followee", userid.getId());
        
		String sql = "select count(1) from followerslist where " +
            "followerslist.ownerid = :follower and followerslist.userid = :followee";
		
		Long l = template.queryForObject(sql, params, Long.class);
		
		return l > 0;
	
}
