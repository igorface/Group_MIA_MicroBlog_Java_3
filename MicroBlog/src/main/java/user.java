@Entity

@Table (name = "user")

public class user {
	@Column (name = "user_id", nullable = false)
	private int user_id;

	@Column (name = "username", nullable = false)
	private String username;

	@Column (name = "userpassword", nullable = false)
	private String userpassword;

	@Column (name = "email", nullable = false)
	private String emails;
}   a