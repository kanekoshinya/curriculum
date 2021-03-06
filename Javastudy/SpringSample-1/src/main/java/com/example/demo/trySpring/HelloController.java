package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @GetMapping("/hello")
  public String getHello() {
	  return "hello";
  }

  @PostMapping("/hello")
  public String PostRequest(@RequestParam("text1")String str,Model model) {
	  model.addAttribute("sample",str);
	  System.out.println(model);
	  return "helloResponse";
  }
}


