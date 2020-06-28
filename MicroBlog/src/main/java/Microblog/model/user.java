package Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table (name = "user")

public class user {
	@Column (name = "user_id", nullable = false)
	public int user_id;

	@Column (name = "username", nullable = false)
	public String username;

	@Column (name = "userpassword", nullable = false)
	public String userpassword;

	@Column (name = "email", nullable = false)
	public String emails;
	
	public static String getId() {
		return "";
	};
}