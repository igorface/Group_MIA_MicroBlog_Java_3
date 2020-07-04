package Microblog.dao;

import static org.junit.Assert.assertFalse;
import java.util.*;
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
 
    Date DateAdded;
    
    @Before
    public void setUp () {
        this.User = new user();
        this.User.user_id = 1;
        this.User.email = "add@me.com";
        this.User.userpassword = "mypass";
        this.User.username = "Me";

        DateAdded = new Date(44000);
        
        this.TestPost = new post();
        this.TestPost.user_id = 2;
        this.TestPost.text = "illfollow@you.com";
        this.TestPost.date_added= DateAdded;
    }
	
    @Test
    public List<post> retriveUserIdPost() {
    	return postDAO.retriveUserIdPost(User);
    }

    @Test
    public List<post> retriveFollowedUsersPosts() {
    	return postDAO.retriveFollowedUsersPosts(User);
    }
    
    @Test
    public List<post> retriveAllUsersPosts() {
    	return postDAO.retriveAllUsersPosts(User);
    }
    
    @Test
    public void createPost() {
    	postDAO.createPost(User, TestPost);
    }
    
}


