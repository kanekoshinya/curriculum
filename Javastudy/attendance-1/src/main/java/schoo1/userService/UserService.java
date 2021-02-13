package schoo1.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoo1.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository UserRepository;

}
