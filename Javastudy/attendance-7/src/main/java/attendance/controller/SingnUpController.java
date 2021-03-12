package attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import attendance.Conversion;
import attendance.form.SignUpForm;
import attendance.service.SignUpService;

@RestController
@RequestMapping(value="/signup")
public class SingnUpController {

    @GetMapping
    public ModelAndView signup(ModelAndView mav) {
        return mav;
    }

    @Autowired
    private SignUpService signupService;
    @Autowired
    private Conversion conversion;

    @PostMapping
    public ModelAndView signup(SignUpForm signupForm, ModelAndView mav) {
        signupService.registUser(conversion.signupCon(signupForm));
        mav.setViewName("login");
        return mav;
    }
}
