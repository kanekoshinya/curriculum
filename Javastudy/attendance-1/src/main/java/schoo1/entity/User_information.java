package schoo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

	@Data
	@Entity
	@Table(name="user_information")
	public class User_information {
		@Id
		@Column(name = "id")
		private Integer id;
		}

