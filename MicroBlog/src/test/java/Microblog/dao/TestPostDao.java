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
public class TestPostDao {
   
	@Autowired
	PostDao postDAO;
	
	@Autowired
	UserDao userDAO;
	
    post TestPost;

    user User;
 
    @Before
    public void setUp () {
        this.postDAO = new user();
        this.postDAO.user_id = 1;
        this.postDAO.email = "add@me.com";
        this.postDAO.userpassword = "mypass";
        this.postDAO.username = "Me";

        this.userDAO = new user();
        this.userDAO.user_id = 2;
        this.userDAO.email = "illfollow@you.com";
        this.userDAO.userpassword = "mypasstoo";
        this.userDAO.username = "You";
    }
	
	
}


