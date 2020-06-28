package Microblog.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table (name="post")

public class post {
	@Column (name = "user_id", nullable = false)
	public int user_id;

	@Column (name="date_added", nullable = false)
	public Date date_added;

	@Column (name = "text", nullable = false)
	public String text;
}