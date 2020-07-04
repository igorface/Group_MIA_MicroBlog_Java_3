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
public class TestUserDao {

    @Autowired
    UserDao	userDAO; 

    user newUser;
    
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
    public void registerNewUser() {
    	return userDAO.registerNewUser(newUser);
    }
    
    
}