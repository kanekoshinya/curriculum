package work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import work.form.UserListForm;
import work.service.WorkService;



@Controller
public class WorkController {
  @Autowired
  WorkService workService;

  @GetMapping("/")
  public String index(){
	  return "index";
  }

  @GetMapping("/top")
  public String top() {
	  return "top";
  }

  @PostMapping("add")
  public String addUser(@ModelAttribute UserListForm userListForm) {
	  workService.save(userListForm.getName());
	  return "index";
  }
}

