package schoo1.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoo1.entity.User_information;
import schoo1.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository UserRepository;

	public List<User_information> findAll() {
		return UserRepository.findAll();
	}

	public void create(String name,String password) {
	    User_information user = new User_information();
	    user.setName(name);
	    user.setPassword(password);
	    UserRepository.save(user);

	  }

	public void delete(Integer id) {
		UserRepository.deleteById(id);
	}
}
