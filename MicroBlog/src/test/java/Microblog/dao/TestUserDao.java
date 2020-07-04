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
    
    String username;

    @Before
    public void setUp () {
        this.newUser = new user();
        this.newUser.user_id = 1;
        this.newUser.email = "add@me.com";
        this.newUser.userpassword = "mypass";
        this.newUser.username = "Me";

        this.username = "Me";
    }
    @Test
    public void registerNewUser() {
    	userDAO.registerNewUser(newUser);
    }
    @Test
    public user getUserByLogin() {
    	return userDAO.getUserByLogin(username);
    }
    
}