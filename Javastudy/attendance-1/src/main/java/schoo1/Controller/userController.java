package schoo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import schoo1.UserRequest;
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

	@PostMapping("new")
	public String create(@ModelAttribute UserRequest userRequest) {
		UserService.create(userRequest.getName(),userRequest.getPassword());
		return "create";
	}

	@GetMapping("delete")
	public String deleteUser(@RequestParam Integer id) {
		UserService.delete(id);
		return "redirect:/";
	}


}
