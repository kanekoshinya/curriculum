package attendance.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class AttendanceController {
//	@GetMapping("/login")
// public String index() {
//	 return "top";
// }
//}
//

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttendanceController {

    @RequestMapping("/login")
    public String showLoginForm(Model model) {

        //ログイン画面へ遷移。
        return "top";
    }
}