package attendance.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	@GetMapping(value = "/")
	public String top() {
		return "top.html";
	}


}