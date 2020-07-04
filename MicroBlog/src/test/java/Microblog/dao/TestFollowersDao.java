package Microblog.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import Microblog.dao.*;
import Microblog.model.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class TestFollowersDao {
	 @Autowired
	    FollowersDao followerDAO;
	    
	    @Autowired
	    UserDao userDAO;
	    
	    user newFollowee;

	    user newFollower;
	    
	    @Before
	    public void setUp () {
	        this.newFollower = new user();
	        this.newFollower.user_id = 1;
	        this.newFollower.email = "add@me.com";
	        this.newFollower.userpassword = "mypass";
	        this.newFollower.username = "Me";

	        this.newFollowee = new user();
	        this.newFollowee.user_id = 2;
	        this.newFollowee.email = "illfollow@you.com";
	        this.newFollowee.userpassword = "mypasstoo";
	        this.newFollowee.username = "You";
	    }
	    
	    @Test
	    public boolean isFollowing() {
	    	return followerDAO.isFollowing(newFollowee, newFollower);
	    }

	    @Test
	    public void testAddFollower () {
	    	followerDAO.addFollower(newFollowee, newFollower);
	    }

	    @Test
	    public void deleteFollower () {
	    	followerDAO.deleteFollower(newFollowee, newFollower);
	    }
	    
	    
    }


