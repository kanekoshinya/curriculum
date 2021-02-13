package schoo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import schoo1.userService.UserService;




@Controller
public class userController {

	@Autowired
	UserService UserService;

	@GetMapping("/")
	public String index(){
		return "index";
	}

//	@RequestMapping(value="new",method=RequestMethod.Post){
//		return "index";
//	}
}
