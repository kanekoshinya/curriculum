package schoo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import schoo1.entity.UserList;
import schoo1.service.UserListService;

/**
 * Springで作成する簡単なDB出力のサンプルクラスです.
 */
@Controller
public class SchooController {

	@Autowired
	UserListService userListService;

	/**
	 * トップページへのリクエスト
	 * @return output.htmlのパス
	 */
	@GetMapping("/")
	public String index(Model model) {
		List<UserList> users = userListService.findAll();
		model.addAttribute("users", users);
		return "output";
	}
}