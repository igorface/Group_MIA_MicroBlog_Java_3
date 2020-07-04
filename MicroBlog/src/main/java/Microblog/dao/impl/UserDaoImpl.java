package Microblog.dao.impl;

import java.util.*;

import javax.persistence.*;

import Microblog.dao.*;
import Microblog.model.*;

public class UserDaoImpl implements UserDao {

	EntityManager entityManager ;

	    @Override
	    public user getUserByLogin(String username) {
	    	String hql = "select * from user where username=:name";
	    	
	    	Query query = entityManager.createQuery(hql);
	    	
	    	user result = (user) query.getSingleResult();
	    	return result;
	    }
	    
	    @Override 
	    public void registerNewUser(user newuser) {
	    	String hql = "insert into user (username, userpassword, email) values (:username, :userpassword, :email)";
					
			Query query = entityManager.createQuery(hql);
			query.executeUpdate();
	    }
	}

