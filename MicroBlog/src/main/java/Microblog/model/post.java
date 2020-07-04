package Microblog.model;

import java.util.*;
import javax.persistence.*;

@Entity

@Table (name="post")
public class post {

	@PersistenceContext
	EntityManager entityManager ;

	@Column (name = "user_id", nullable = false)
	public int user_id;

	@Column (name="date_added", nullable = false)
	public Date date_added;

	@Column (name = "text", nullable = false)
	public String text;
}