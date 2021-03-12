package attendance.form;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class SignUpForm {

    @Id
    private Integer id;
    @Column(name = "login_id")
    private String loginId;
    private String password;
}