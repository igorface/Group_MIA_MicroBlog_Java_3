package Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table (name = "followerslist")
public class followerslist {

	@Column (name = "user_id", nullable = false)
	private int user_id;
	
	@Column (name = "follower_id", nullable = false)
	private int follower_id;

}