package attendance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/login")
public class AttendanceController {
  @GetMapping
  public ModelAndView login(ModelAndView mav) {
	  return mav;
  }
}
