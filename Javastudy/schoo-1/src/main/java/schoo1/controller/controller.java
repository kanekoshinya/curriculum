package schoo1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class controller {
  @Autowired
  private HttpSession session;

  @GetMapping("/")
  public  String index() {
	  return "input";
  }

  @PostMapping("input")
  public String login(@RequestParam ("message") String message) {
	  String sessionMessage = (String)session.getAttribute("sesssionMessage");
	  System.out.println("---メッセージ（追加前）---");
	  System.out.println(sessionMessage);

	  sessionMessage = sessionMessage + " " + message;
	  session.setAttribute("sessionMessage",sessionMessage);
	  System.out.println("---メッセージ（追加後）---");
	  System.out.println(sessionMessage);

	  return "finish";
  }
}
