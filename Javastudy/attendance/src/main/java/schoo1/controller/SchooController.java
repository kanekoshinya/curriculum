package schoo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import schoo1.service.UserListService;

@Controller
public class SchooController {
  @Autowired
  UserListService UserListService;

  @GetMapping("/")
public String index(){
	return "user";
  }
}
