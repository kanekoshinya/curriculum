package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

	@GetMapping("/")
	public String index() {
		return "index";
	}


@PostMapping("login")
public String login(@RequestParam("loginId") String loginId,
					@RequestParam("loginPassword") String loginPassword) {
	if("schoo".equals(loginId)&&"pass".equals(loginPassword)) {
		return "login-ok";
	}else {
		return "login-ng";
	}
  }
}
