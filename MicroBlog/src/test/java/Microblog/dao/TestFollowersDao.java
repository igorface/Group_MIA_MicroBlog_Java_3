package Microblog.dao;

import static org.junit.Assert.assertFalse;
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
	    
	    //folowee
	    user newFollowee;
	    //follower;
	    user newFollower;
	    
	    @Before
	    public void setUp () {
	    
	    	// something goes here
	    
	    }
	    
	    @Test
	    
	    public void testAddFollower () {
	    	
	    	// something goes here
	    }
   

   
    
    }


