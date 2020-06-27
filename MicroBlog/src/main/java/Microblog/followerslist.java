package Microblog;
@Entity

@Table (name = "followerslist")
public class followerslist {

	@Column (name = "user_id", nullable = false)
	private int user_id;
	
	@Column (name = "follower_id", nullable = false)
	private int follower_id;

}