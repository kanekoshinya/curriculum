package attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import attendance.entity.UserEntity;
import attendance.form.SignUpForm;

@Component
public class Conversion {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public UserEntity signupCon(SignUpForm form) {
        return new UserEntity(
                form.getId(),
                form.getLoginId(),
                passwordEncoder.encode(form.getPassword()));
    }
}
