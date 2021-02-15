package schoo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * user_listテーブルのEntityクラスです
 */
@Entity
@Table(name="user_information")
public class UserList {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public String getAge() {
		return password;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(String password) {
		this.password = password;
	}
}