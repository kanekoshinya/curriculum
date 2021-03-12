package attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="user")
@Entity
public class UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "login_id")
    private String loginId;
    private String password;

    public UserEntity(Integer id, String loginId, String password) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
    }
}