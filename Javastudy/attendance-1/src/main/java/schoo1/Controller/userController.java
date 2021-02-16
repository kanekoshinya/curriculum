package schoo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import schoo1.entity.User_information;
import schoo1.userService.UserService;



@Controller
public class userController {

	@Autowired
	UserService UserService;


	@GetMapping("/")
	public String index(Model model) {
		List<User_information> users = UserService.findAll();
		model.addAttribute("users", users);
		return "index";
	}

}
