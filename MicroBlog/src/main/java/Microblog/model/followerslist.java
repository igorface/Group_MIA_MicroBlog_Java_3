package Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table (name = "followerslist")
public class followerslist {

	@Column (name = "user_id", nullable = false)
	public int user_id;
	
	@Column (name = "follower_id", nullable = false)
	public int follower_id;


}