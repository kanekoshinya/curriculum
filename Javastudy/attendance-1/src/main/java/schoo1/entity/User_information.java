package schoo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class User_information {
	@Entity
	@Table(name="user_information")
	public class UserList {
		@Id
		@Column(name = "id")
		private Integer id;
		}
}
